# Visitor

I have a dream. I want to have my own farm. And I decided that this is the right
time to build it.

For the beginning of my business I will start to breed cows and horses. These
animals will be treated differently. Cows need to be milked and horses need to
be brushed.

```java
class Cow extends Animal {

    public void milk() {
        println("Cow was milked");
    }

}
```

```java
class Horse extends Animal {

    public void brush() {
        println("Horse was brushed");
    }

}
```

And I need to hire a worker who will take care of these animals while I am 
busy with my thoughts about expanding my business.

```java
class Worker {

    private List<Animal> animals;

    public Worker(List<Animal> animals) {
        this.animals = animals;
    }

    void work() {
        animals.forEach(animal -> {
            if (animal instanceOf Cow) {
                ((Cow) animal).milk();
            } else if (animal instanceOf Horse) {
                ((Horse) animal).brush();
            } else {
                throw new NotSupportedAnimalException();
            }
        });
    }

}
```

We will assume that there is a good reason why these animals are not placed in
separate lists of type Cow and Horse. (Maybe they are sorted by the date they
were worked on).

I decided to expand my business and start to breed sheeps.

```java
class Sheep extends Animal {

    void shave() {
        println("Sheep was shaved");
    }

}
```

My worker needs to be tranined to work also with sheeps:

```java
...
    void work() {
        animals.forEach(animal -> {
            if (animal instanceOf Cow) {
                ((Cow) animal).milk();
            } else if (animal instanceOf Horse) {
                ((Horse) animal).brush();
            } else if (animal instanceOf Sheep) {
                ((Sheep) animal).shave();
            } else {
                throw new NotSupportedAnimalException();
            }
        });
    }
...
```

But this method can get bigger in the future. So we need different approach. We
will separate this huge responsibility into smaller ones:

```java
void visit(Cow cow) {
    cow.milk();
}

void visit(Horse horse) {
    horse.brush();
}

void visit(Sheep sheep) {
    sheep.shave();
}
```

And our animals will accept our worker:

```java
interface Animal {

    void accept(Worker worker);

}
```

And each animal will have its way of accepting this worker:

```java
class Cow implements Animal {

    void accept(Worker worker) {
        worker.visit(this);
    }

}

class Horse implements Animal {

    void accept(Worker worker) {
        worker.visit(this);
    }

}

class Sheep implements Animal {

    void accept(Worker worker) {
        worker.visit(this);
    }

}
```

Now there is no need for type checks and casts:

```java
...
    void work() {
        animals.forEach(animal -> {
            animal.accept(this);
        });
    }
...
```

Isn't it beautiful when we harness polymorphic capabilities of OOP.
