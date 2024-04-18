package com.investedge.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {

    private final RestTemplate restTemplate = new RestTemplate();
    @Value("${alphaVantage.apikey}")
    private String API_KEY;

    public double[] getHistoricalPrices(String symbol) {
        String url = String.format("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=%s&apikey=%s", symbol, API_KEY);
        return restTemplate.getForObject(url, double[].class);  // Adjust according to actual response structure
    }
}
