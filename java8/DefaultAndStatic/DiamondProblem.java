package java8.DefaultAndStatic;

public class DiamondProblem {
    public static void main(String[] args) {
        A a = new A();
        a.move();
    }
}

interface Flyable {
    default void move() {
        System.out.println("Flying !");
    }
}

interface Swimmable {
    default void move() {
        System.out.println("");
    }
}

// DIAMOND PROBLEM!
// Both interfaces have same default method move()s
class A implements Flyable, Swimmable {

    // MUST override — Java doesn't know which to use!
    @Override
    public void move() {
        Flyable.super.move(); // explicitly call Flyable's
        Swimmable.super.move(); // explicitly call Swimmable
        System.out.println("Duck can both fly and swim! ");
    }

}
