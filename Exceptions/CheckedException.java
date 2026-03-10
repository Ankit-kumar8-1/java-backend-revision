package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ReadOnlyBufferException;

public class CheckedException {

    public static void main(String[] args) {

        CheckedException c = new CheckedException();
        try {
            division();
        } catch (ArithmeticException exception) {
            System.out.println("you cannot divide any number zero : " + exception);
        }

        System.out.println("Continue...");

        int age = 17;
        if (age < 18) {
            throw new IllegalArgumentException("Age cannot be less than 18");
        }

        try {
            int arr[] = { 1, 2, 3, 4, 5, 6 };
            System.out.println(arr[10]);

            int a = 6 / 0;
            System.out.println(a);
        } catch (ArrayIndexOutOfBoundsException es) {
            System.out.println("you  try to access wrong index ");
        } catch (ArithmeticException es) {
            System.out.println("you cannot divide number by 0 ");
        } finally {
            System.out.println("Finally block executed");
            int a = 9 / 0;
            System.out.println(a);

        }

    }

    public static void division() throws ArithmeticException {
        int a = 9 / 0;
        System.out.println(a);
    }
}