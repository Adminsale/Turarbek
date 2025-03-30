package Problems;

import java.util.Scanner;

public class Task6 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given numbers 'a' and 'n', write the function that returns 'a^n'.");

        int a, n;
        while (true) {
            System.out.print("Enter a positive numbers: ");
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                n = sc.nextInt();
                if (a >= 0 || n >= 0) {
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
        int result = powFunc(a, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println(a + " to the power of " + n + " is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method calculates the power of a given number 'a' raised to the exponent 'n'
     * It uses Math class
     * The result is returned as an integer
     */

    private static int powFunc(int a, int n) {
        return (int) a * powFunc(a, n - 1);
    }
}