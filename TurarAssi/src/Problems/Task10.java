package Problems;

import java.util.Scanner;

public class Task10 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given numbers 'a' and 'b', find GCD(a, b) using recursion.");

        int a, b;
        while (true) {
            System.out.print("Enter 'a' number: ");
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                System.out.print("Enter 'b' number: ");
                b = sc.nextInt();
                if (a >= 0 || b >= 0) {
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
        int result = gcd(a, b);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("GCD(" + a + ", " + b + ") = " + result);
        System.out.println("\nTime taken: " + duration + " milliseconds");
    }
    /**
     * This method finds gcd of given numbers using Euclidean Algorithm
     * It uses recursion
     * The result is returned as an integer
     */
    private static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a); // Ensure GCD is always positive
        return gcd(b, a % b);
    }
}