package com.assignment.question;

public class SurgePricingStrategy implements PricingStrategy {

    @Override
    public PricingType supportsType() {
        return PricingType.SURGE;
    }

    @Override
    public Double CalculateRidePrice(RideDetails rideDetails) {
        return Constants.BASE_FARE * Constants.SURGE_MULTIPLIER;
    }

}
