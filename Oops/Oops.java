package Oops;

import java.util.Optional;

public class Oops {
    public static void main(String[] args) {

        B b = new B("Rohit");
        b.printName();
        C c = new C("Amit");
        c.getFatherName();

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