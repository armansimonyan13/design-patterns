package com.designpatterns.strategy.traveling;

import com.designpatterns.strategy.util.Logger;

public class TravelOnFootStrategy implements TravelStrategy {

    @Override
    public void execute() {
        Logger.log("Traveling on foot");
    }
    
}