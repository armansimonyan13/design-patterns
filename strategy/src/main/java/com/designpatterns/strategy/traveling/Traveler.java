package com.designpatterns.strategy.traveling;

public class Traveler {

    private TravelStrategy travelStrategy;

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travel() {
        travelStrategy.execute();
    }
    
}