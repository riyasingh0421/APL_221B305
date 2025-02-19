interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

interface Squeakable {
    void squeak();
}

abstract class Duck {
    public void swim() {
        System.out.println("All ducks can swim.");
    }
}

class RubberDuck extends Duck implements Squeakable {
    public void squeak() {
        System.out.println("Rubber Duck squeaks.");
    }
}

class WoodenDuck extends Duck {
    // WoodenDuck is mute, no sound-related interface implemented
}

class RedHeadDuck extends Duck implements Flyable, Quackable {
    public void fly() {
        System.out.println("RedHead Duck flies.");
    }

    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
}

class LakeDuck extends Duck implements Flyable, Quackable {
    public void fly() {
        System.out.println("Lake Duck flies.");
    }

    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}

public class Main {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        // Test swimming behavior
        rubberDuck.swim();
        woodenDuck.swim();
        redHeadDuck.swim();
        lakeDuck.swim();

        // Test sound behavior
        rubberDuck.squeak();
        redHeadDuck.quack();
        lakeDuck.quack();

        // Test flying behavior
        redHeadDuck.fly();
        lakeDuck.fly();
    }
}
