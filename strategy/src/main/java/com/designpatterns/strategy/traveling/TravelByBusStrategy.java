package com.designpatterns.strategy.traveling;

import com.designpatterns.strategy.util.Logger;

public class TravelByBusStrategy implements TravelStrategy {

    @Override
    public void execute() {
        Logger.log("Traveling by bus");
    }
    
}