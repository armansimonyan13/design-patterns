package com.designpatterns.visitor.general;

public class ConcreteAcceptor1 implements Acceptor {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void print1() {
        System.out.println("ConcreteAcceptor1.print1");
    }
    
}