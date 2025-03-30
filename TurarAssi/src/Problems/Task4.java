package Problems;

import java.util.Scanner;

public class Task4 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given a number “n”, write the program using recursion for finding “n!");

        int n;
        while (true) {
            System.out.print("Enter a positive number: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 0) {
                    break;
                } else {
                    System.out.println("Error: Enter a non-negative number.");
                }
            } else {
                System.out.println("Error: Invalid input! Please enter a valid integer.");
                sc.next();
            }
        }

        double startTime = System.nanoTime();
        int result = factorial(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("Factorial of " + n + " is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method calculates the factorial of a given number
     * It uses a recursion
     * The result is returned as an integer
     */

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}