package com.investedge.service;

import com.investedge.model.Portfolio;
import com.investedge.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    public Portfolio addStockToPortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    public List<Portfolio> getPortfolioByUserId(Long userId) {
        return portfolioRepository.findByUserId(userId);
    }

    public void removeStockFromPortfolio(Long portfolioId) {
        portfolioRepository.deleteById(portfolioId);
    }
}
