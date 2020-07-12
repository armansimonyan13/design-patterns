package com.designpatterns.visitor.farm.workers;

import java.util.List;

import com.designpatterns.visitor.farm.animals.Animal;
import com.designpatterns.visitor.farm.animals.Cow;
import com.designpatterns.visitor.farm.animals.Horse;
import com.designpatterns.visitor.farm.animals.Sheep;
import com.designpatterns.visitor.farm.animals.Worker;

public class Intern implements Worker {

    private List<Animal> animals;

    public Intern(List<Animal> animals) {
        this.animals = animals;
    }

    public void work() {
        animals.forEach(animal -> animal.accept(this));
    }

    @Override
    public void visit(Cow cow) {
        cow.feed();
    }

    @Override
    public void visit(Horse horse) {
        horse.feed();
    }

    @Override
    public void visit(Sheep sheep) {
        sheep.feed();
    }
    
}