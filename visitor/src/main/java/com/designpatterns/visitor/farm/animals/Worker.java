package com.designpatterns.visitor.farm.animals;

public interface Worker {
    
    void visit(Cow cow);

    void visit(Horse horse);

    void visit(Sheep sheep);

}