package com.investedge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {

    private final RestTemplate restTemplate;
    private final String API_KEY = "0BYLU7ZKC4UZFT79";  

    @Autowired
    public StockService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public double[] getHistoricalPrices(String symbol) {
        String url = String.format("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=%s&apikey=%s", symbol, API_KEY);
        // Simplified: Assume the API returns an array of prices
        return restTemplate.getForObject(url, double[].class);
    }
}
