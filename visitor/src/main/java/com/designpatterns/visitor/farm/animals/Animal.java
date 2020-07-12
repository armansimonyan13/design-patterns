package com.designpatterns.visitor.farm.animals;

public interface Animal {

    void accept(Worker worker);
    
}