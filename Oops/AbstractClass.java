package Oops;

import java8.StreamAPIs.mapOperation;

public class AbstractClass {
    public static void main(String[] args) {

        Main.hello();
        test.hello();

        Encapsulation user = new Encapsulation();
        user.TrasnderMoney(900, 11);
        System.out.println(user.getBalance());
    }
}

class Encapsulation {
    private int balance = 9000;

    public int getBalance() {
        return balance;
    }

    public void TrasnderMoney(int money, int transferId) {
        if (money <= 0) {
            System.out.println("Sorry 0 money cannot  be send");
        } else if (transferId < 100) {
            if (balance < money) {
                System.out.println("Sorry your account not suficient balance");
            } else {
                balance -= money;
                System.out.println("Money transfer successfull");
            }
        } else {
            System.out.println("Id is envalid");
        }
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
