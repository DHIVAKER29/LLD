package com.assignment.question;

public class PricingManager {

    private PricingStrategy pricingStrategy;
    private PricingType pricingType; // Ideally this is not required, but the Test cases wont pass without this argument in constructor.
    public PricingManager(PricingType pricingType, PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
        this.pricingType = pricingType;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        return pricingStrategy.CalculateRidePrice(rideDetails);
    }

}