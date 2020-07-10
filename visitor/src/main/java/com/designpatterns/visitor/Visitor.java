package com.designpatterns.visitor;

public interface Visitor {

    void visit(ConcreteAcceptor0 acceptor);

    void visit(ConcreteAcceptor1 acceptor);

}