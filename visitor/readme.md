# Visitor

## Without **visitor**

```java
 acceptors.forEach(acceptor -> {
     if (acceptor instanceof ConcreteAcceptor0) {
         visitor.visit((ConcreteAcceptor0) acceptor);
     } else if (acceptor instanceof ConcreteAcceptor1) {
         visitor.visit((ConcreteAcceptor1) acceptor);
     } else {
         throw new RuntimeException();
     }
 })
```

## With **visitor**

```java
acceptors.forEach(acceptor -> {
    acceptor.accept(visitor);
});
```
