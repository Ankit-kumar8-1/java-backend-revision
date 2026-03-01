package Oops;

public class AbstractClass {
    public static void main(String[] args) {

        Main.hello();
        test.hello();
    }
}

abstract class Main {

    abstract void run();

    static void hello() {
        System.out.println("hello");
    }

    Main() {
        System.out.println("Constructor main");
    }
}

class test extends Main {

    @Override
    void run() {
        System.out.println("Test main methods");
    }

    static void hello() {
        System.out.println("Hello form test class ");
    }

}
