package com.investedge.model;

public class PortfolioAnalysis {
    private double totalValue;
    private double riskLevel;
    private double potentialReturn;

    // Constructors
    public PortfolioAnalysis() {}

    // Getters and Setters
    public double getTotalValue() { return totalValue; }
    public void setTotalValue(double totalValue) { this.totalValue = totalValue; }

    public double getRiskLevel() { return riskLevel; }
    public void setRiskLevel(double riskLevel) { this.riskLevel = riskLevel; }

    public double getPotentialReturn() { return potentialReturn; }
    public void setPotentialReturn(double potentialReturn) { this.potentialReturn = potentialReturn; }
}
