package com.designpatterns.visitor.general;

public interface Visitor {

    void visit(ConcreteAcceptor0 acceptor);

    void visit(ConcreteAcceptor1 acceptor);

}