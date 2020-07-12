package com.designpatterns.visitor.farm;

import java.util.List;

import com.designpatterns.visitor.farm.animals.Animal;
import com.designpatterns.visitor.farm.animals.Cow;
import com.designpatterns.visitor.farm.animals.Horse;
import com.designpatterns.visitor.farm.animals.Sheep;
import com.designpatterns.visitor.farm.workers.Expert;
import com.designpatterns.visitor.farm.workers.Intern;

public class App {

    public static void main(String[] args) {
        Cow cow0 = new Cow();
        Cow cow1 = new Cow();
        Horse horse0 = new Horse();
        Horse horse1 = new Horse();
        Sheep sheep0 = new Sheep();
        Sheep sheep1 = new Sheep();

        List<Animal> animals = List.of(cow0, cow1, horse0, horse1, sheep0, sheep1);

        Intern intern = new Intern(animals);
        Expert expert = new Expert(animals);

        intern.work();
        expert.work();
    }
    
}