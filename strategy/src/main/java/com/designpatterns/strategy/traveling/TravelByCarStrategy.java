package com.designpatterns.strategy.traveling;

import com.designpatterns.strategy.util.Logger;

public class TravelByCarStrategy implements TravelStrategy {

    @Override
    public void execute() {
        Logger.log("Traveling by car");
    }
    
}