package com.investedge.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class RecommendationServiceTest {

    @Mock
    private StockService stockService;

    @InjectMocks
    private MeanReversionService meanReversionService;

    @Test
    public void testMeanReversionRecommendation() {
        double[] historicalPrices = {100.0, 105.0, 95.0, 90.0, 110.0};
        when(stockService.getHistoricalPrices("AAPL")).thenReturn(historicalPrices);

        String recommendation = meanReversionService.recommend("AAPL");
        assertEquals("Buy", recommendation, "The recommendation should be Buy based on Mean Reversion logic.");
    }
}
