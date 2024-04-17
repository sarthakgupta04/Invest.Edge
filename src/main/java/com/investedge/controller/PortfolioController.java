package com.investedge.controller;

import com.investedge.model.Portfolio;
import com.investedge.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/portfolio")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @PostMapping("/add")
    public ResponseEntity<Portfolio> addStockToPortfolio(@RequestBody Portfolio portfolio) {
        Portfolio savedPortfolio = portfolioService.addStockToPortfolio(portfolio);
        return ResponseEntity.ok(savedPortfolio);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Portfolio>> getUserPortfolio(@PathVariable Long userId) {
        List<Portfolio> portfolios = portfolioService.getPortfolioByUserId(userId);
        return ResponseEntity.ok(portfolios);
    }

    @DeleteMapping("/remove/{portfolioId}")
    public ResponseEntity<?> removeStockFromPortfolio(@PathVariable Long portfolioId) {
        portfolioService.removeStockFromPortfolio(portfolioId);
        return ResponseEntity.ok("Stock removed from portfolio");
    }
}
