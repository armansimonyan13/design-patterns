# Visitor

## Example

I am going to start a new business. I want to have my own farm. 

For the beginning of my business I will start to breed cows and horses. These
animals will be treated differently. Cows need to be fed and milked.
Horses need to be fed and brushed.

```java
class Cow extends Animal {

    public void feed() {
        println("Cow was fed");
    }
    
    public void milk() {
        println("Cow was milked");
    }

}
```

```java
class Horse extends Animal {

    public void feed() {
        println("Horse was fed");
    }

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
                Cow cow = (Cow) animal;
                cow.feed();
                cow.milk();
            } else if (animal instanceOf Horse) {
                Horse horse = (Horse) animal;
                horse.feed();
                horse.brush();
            } else {
                throw new NotSupportedAnimalException();
            }
        });
    }

}
```

Note: We will assume that there is a good reason why these animals are not placed in
separate lists of type Cow and Horse. (Maybe they are sorted by the date they
were taken care of).

I decided to expand my business and start to breed sheeps.

```java
class Sheep extends Animal {

    public void feed() {
        println("Sheep was fed");
    }

    public void shave() {
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
                Cow cow = (Cow) animal;
                cow.feed();
                cow.milk();
            } else if (animal instanceOf Horse) {
                Horse horse = (Horse) animal;
                horse.feed();
                horse.brush();
            } else if (animal instanceOf Sheep) {
                Sheep sheep = (Sheep) animal;
                sheep.feed();
                sheep.shave();
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
    cow.feed();
    cow.milk();
}

void visit(Horse horse) {
    horse.feed();
    horse.brush();
}

void visit(Sheep sheep) {
    sheep.feed();
    sheep.shave();
}
```

And the animals will accept the worker:

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
