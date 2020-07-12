package com.designpatterns.visitor.farm.animals;

import com.designpatterns.visitor.farm.util.Logger;

public class Cow implements Animal {

    public void feed() {
        Logger.log("Cow was fed");
    }

    public void milk() {
        Logger.log("Cow was milked");
    }

    @Override
    public void accept(Worker worker) {
        worker.visit(this);
    }

}