package com.assignment.question;
public class MovingAverageStrategy implements TradingIndicatorStrategy {

    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOVING_AVERAGES;
    }

    @Override
    public Double CalculateTradingIndicator(Stock stock) {
        return (stock.getPrice() + stock.getPreviousPrice()) / 2;
    }
}