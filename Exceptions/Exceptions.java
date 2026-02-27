package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
    public static void main(String[] args) throws Exception {

        // Unchecked Exception
        int a = 9;
        int b = 0;
        // int divison = a / b;
        // System.out.println(divison);

        // hanldig unchecked exception
        try {
            int res = 3 / 0;
            System.out.println(res);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }

        // Checked exception
        // FileReader fikeR = new FileReader("hello.txt"); // C

        // handling Checked exception

        try {
            FileReader fileReader = new FileReader("test.text");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Programe is terminate");
        }

        int age = 16;
        try {
            if (age < 18) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("bhai tum jo input de rahe vo wrong please age allways greater than 18 ");
        }

        // divison(); throws
        System.out.println("After Exception ");

        Boy boy = new Boy("Rohit", "Happy");
        Boy boy2 = new Boy(null, null);
        Boy vBoy = null;

        // custom exception
        if (vBoy == null) {
            throw new UserNotFoundException("User not found ");
        } else {
            System.out.println(" name  : " + boy2.name + "Happy Or Not : " + boy2.happyOrNot);
        }

        System.out.println("Hello Ji ");

    }

    public static void divison() throws Exception {
        System.out.println(8 / 0);
    }
}

class Boy {
    String name;
    String happyOrNot;

    Boy(String name, String happyOrNot) {
        this.name = name;
        this.happyOrNot = happyOrNot;
    }

}