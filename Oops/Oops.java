package Oops;

public class Oops {
    public static void main(String[] args) {

        B b = new B("Rohit");
        b.printName();
        C c = new C("Amit");
        c.getFatherName();

        Animal a = new Dog();
        a.sound();

        Payment p = new UpiPayment();
        p.pay();

    }
}

interface Payment {
    void pay();
}

class UpiPayment implements Payment {

    public void pay() {
        System.out.println("Payment via UPI");
    }
}

abstract class Animal {

    abstract void sound(); // abstract method (no body)

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
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

class C extends A {
    String fatherName;

    C(String fatherName) {
        this.fatherName = fatherName;
    }

    void getFatherName() {
        System.out.println("your father name is : " + giveName(fatherName));
    }
}

class D extends B {

    D(String name) {
        super(name);
    }

    void callParentVaribale() {
        super.name = "Rohit";
    }

}
