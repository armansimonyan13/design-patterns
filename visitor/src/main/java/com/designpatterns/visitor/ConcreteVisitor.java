package com.designpatterns.visitor;

public class ConcreteVisitor implements Visitor{

    @Override
    public void visit(ConcreteAcceptor0 acceptor) {
        acceptor.print0();
    }

    @Override
    public void visit(ConcreteAcceptor1 acceptor) {
        acceptor.print1();
    }
    
}