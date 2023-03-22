package uk.ac.cornwallcollege.james;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyError extends Exception {

    public MyError(String message) {
        super(message);
    }
}

public class Division {
    public static int safeDivide(int num, int denum) throws MyError {
        if(num % denum != 0) {
            throw new MyError("Inexact division");
        }
        return num / denum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator = 0;
        int[] results = new int[10];
        int counter = 0;
        do {
            try {
                numerator = scanner.nextInt();
                denominator = scanner.nextInt();
                int result = safeDivide(numerator, denominator);
                results[counter++] = result;
                System.out.println("" + numerator + "/" + denominator + "=" + result);
            } catch (ArithmeticException ex1) {
                System.out.println("Arithmetic exception " + ex1.getMessage());
            } catch (InputMismatchException ex2) {
                System.out.println("Bad input");
                scanner.nextLine();
            } catch (IndexOutOfBoundsException ex3) {
                System.out.println("Index reset");
                counter = 0;
            } catch (MyError ex4) {
                System.out.println("MyError " + ex4.getMessage());
            }
        } while (denominator != -1);
        for (int i = 0; i < counter; i++) {
            System.out.println(results[i]);
        }
    }
}
