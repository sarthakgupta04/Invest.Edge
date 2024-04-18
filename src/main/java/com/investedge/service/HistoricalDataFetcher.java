package com.investedge.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HistoricalDataFetcher {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String API_KEY = "6LYGO9T1LAOPEVSP";  

    public double[] getHistoricalPrices(String symbol) {
        String url = String.format("https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=%s&apikey=%s&outputsize=full", symbol, API_KEY);
        // Simplified: Assume the API returns an array of prices
        return restTemplate.getForObject(url, double[].class);
    }
}
