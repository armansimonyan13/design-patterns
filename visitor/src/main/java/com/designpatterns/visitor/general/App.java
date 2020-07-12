package com.designpatterns.visitor.general;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ConcreteAcceptor0 acceptor0 = new ConcreteAcceptor0();
        ConcreteAcceptor0 acceptor1 = new ConcreteAcceptor0();
        ConcreteAcceptor1 acceptor2 = new ConcreteAcceptor1();
        ConcreteAcceptor1 acceptor3 = new ConcreteAcceptor1();

        List<Acceptor> acceptors = List.of(
            acceptor0,
            acceptor1,
            acceptor2,
            acceptor3
        );

        Visitor visitor = new ConcreteVisitor();

        // without 'visitor'
        acceptors.forEach(acceptor -> {
            if (acceptor instanceof ConcreteAcceptor0) {
                visitor.visit((ConcreteAcceptor0) acceptor);
            } else if (acceptor instanceof ConcreteAcceptor1) {
                visitor.visit((ConcreteAcceptor1) acceptor);
            } else {
                throw new RuntimeException();
            }
        });

        // with 'visitor'
        acceptors.forEach(acceptor -> {
            acceptor.accept(visitor);
        });
    }

}
