package com.designpatterns.visitor.farm.animals;

import com.designpatterns.visitor.farm.util.Logger;

public class Sheep implements Animal {

    public void feed() {
        Logger.log("Sheep was fed");
    }

    public void shave() {
        Logger.log("Sheep was shaved");
    }

    @Override
    public void accept(Worker worker) {
        worker.visit(this);
    }
    
}