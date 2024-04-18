package com.investedge.service;

public interface RecommendationService {
    /**
     * Provides a stock recommendation based on the given symbol.
     * @param symbol the stock symbol to recommend an action for.
     * @return the recommendation as a String.
     */
    String recommend(String symbol);
}
