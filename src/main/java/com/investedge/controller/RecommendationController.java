package com.investedge.controller;

import com.investedge.service.MeanReversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    @Autowired
    private MeanReversionService meanReversionService;

    @GetMapping("/mean-reversion/{symbol}")
    public String getMeanReversionRecommendation(@PathVariable String symbol) {
        return meanReversionService.recommend(symbol);
    }
}
