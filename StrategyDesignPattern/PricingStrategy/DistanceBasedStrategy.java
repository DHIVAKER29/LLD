package com.assignment.question;

public class DistanceBasedStrategy implements PricingStrategy {

    @Override
    public PricingType supportsType() {
        return PricingType.DISTANCE_BASED;
    }

    @Override
    public Double CalculateRidePrice(RideDetails rideDetails) {
        return Constants.BASE_FARE + Constants.PER_KILOMETER_RATE * rideDetails.getDistance();
    }

}