package com.investedge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MeanReversionService implements RecommendationService {

    @Autowired
    private StockService stockService;

    @Override
    public String recommend(String symbol) {
        double[] prices = stockService.getHistoricalPrices(symbol);
        double mean = Arrays.stream(prices).average().orElse(Double.NaN);
        double currentPrice = prices[prices.length - 1];  // Latest price

        double threshold = 0.05;  // 5% threshold for simplicity

        if (currentPrice < mean * (1 - threshold)) {
            return "Buy";
        } else if (currentPrice > mean * (1 + threshold)) {
            return "Sell";
        } else {
            return "Hold";
        }
    }
}
