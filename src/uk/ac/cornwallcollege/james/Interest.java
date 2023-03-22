package uk.ac.cornwallcollege.james;

import java.util.Arrays;

/**
 * A program to calculate compound interest over a number of years
 */
public class Interest {
    /**
     * Main method of the program
     * @param args an array of string arguments containing the command line arguments
     */
    public static void main(String[] args) {
        double starting = 1000;
        int rate = 15;
        double[] balance = new double[11];

        balance[0] = starting;
        //loop through all the years
        for(int year = 1; year <= 10; year++) {
            double interest = balance[year - 1] * rate / 100;
            balance[year] = balance[year - 1] + interest;
        }
    System.out.println(Arrays.toString(balance));
        for(int i = 0; i < 10; i++) {
            System.out.print(i + 1 + "\t");
            System.out.printf("%.2f%n", balance[i]);
        }
        double oneyears = starting * (1 + rate / 100.0) /*^ 10*/;
        System.out.println(oneyears);
        double tenyears = starting * Math.pow(1 + rate / 100.0, 10);
        System.out.printf("%.2f%n",tenyears);
    }
}
