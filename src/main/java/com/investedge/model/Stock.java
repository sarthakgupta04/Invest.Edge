package com.investedge.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stocks")
public class Stock {
    @Id
    private String symbol;
    private String companyName;
    private double price;

    // Constructors, getters, and setters
    public Stock() {}

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
