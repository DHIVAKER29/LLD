package com.assignment.question;
public class TimeBasedPricingStrategy implements PricingStrategy{

    @Override
    public PricingType supportsType() {
        return PricingType.TIME_BASED;
    }

    @Override
    public Double CalculateRidePrice(RideDetails rideDetails) {
        return Constants.BASE_FARE + Constants.PER_MINUTE_RATE * rideDetails.getDuration();
    }

}
