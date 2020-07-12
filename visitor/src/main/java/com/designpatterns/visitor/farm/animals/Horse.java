package com.designpatterns.visitor.farm.animals;

import com.designpatterns.visitor.farm.util.Logger;

public class Horse implements Animal {

    public void feed() {
        Logger.log("Horse was fed");
    }

    public void brush() {
        Logger.log("Horse was brushed");
    }
    
    @Override
    public void accept(Worker worker) {
        worker.visit(this);
    }

}