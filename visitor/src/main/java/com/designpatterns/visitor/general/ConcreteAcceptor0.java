package com.designpatterns.visitor.general;

public class ConcreteAcceptor0 implements Acceptor {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void print0() {
        System.out.println("ConcreeteAcceptor0.print0");
    }
    
}