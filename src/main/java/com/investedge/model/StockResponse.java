package com.investedge.model;

public class StockResponse {
    private Stock stock; // Assuming "stock" is a nested JSON object in the response

    public Stock getStock() { return stock; }
    public void setStock(Stock stock) { this.stock = stock; }
}
