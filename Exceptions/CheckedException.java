package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ReadOnlyBufferException;

public class CheckedException {

    public static void main(String[] args) {

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
        }
    }
}