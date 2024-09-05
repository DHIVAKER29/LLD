package com.assignment.question;

public interface TradingIndicatorStrategy {
    TradingStrategyType supportsType();
    Double CalculateTradingIndicator(Stock stock);
}