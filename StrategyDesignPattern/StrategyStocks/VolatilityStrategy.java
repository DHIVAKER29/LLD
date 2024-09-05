package com.assignment.question;
public class VolatilityStrategy implements TradingIndicatorStrategy {

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.VOLATILITY;
    }

    @Override
    public Double CalculateTradingIndicator(Stock stock) {
        return Math.abs(stock.getPrice() - stock.getPreviousPrice());
    }
}