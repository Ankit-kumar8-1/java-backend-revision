package Oops;

public class Oops {
    public static void main(String[] args) {

        B b = new B("Rohit");
        b.printName();

    }
}

class A {

    String giveName(String name) {
        return name;
    }
}

class B extends A {

    String name;

    B(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println(" your name is " + giveName(name));
    }
}
