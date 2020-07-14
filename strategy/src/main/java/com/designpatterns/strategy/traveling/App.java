package com.designpatterns.strategy.traveling;

import java.util.List;

public class App {

    public static void main(String[] args) {
        Traveler traveler = new Traveler();

        List<TravelStrategy> travelStrategies = List.of(
            new TravelOnFootStrategy(),
            new TravelByCarStrategy(),
            new TravelByBusStrategy()
        );

        travelStrategies.forEach(travelStrategy -> {
            traveler.setTravelStrategy(travelStrategy);
            traveler.travel();
        });
    }

}
