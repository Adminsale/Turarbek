package Problems;

import java.util.Scanner;

public class Task9 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given numbers “n” and “k”,write the program that finds Cn k (binomial coefficient) using formulaCn\n" + " k=Cn−1 k−1 + Cn−1 k where Cn 0=Cn n=1.");

        int n, k;
        while (true) {
            System.out.print("Enter n: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 0) break;
                else System.out.println("Error: n must be non-negative.");
            } else {
                System.out.println("Error: Invalid input! Please enter an integer.");
                sc.next();
            }
        }

        while (true) {
            System.out.print("Enter k: ");
            if (sc.hasNextInt()) {
                k = sc.nextInt();
                if (k >= 0 && k <= n) break;
                else System.out.println("Error: k must be between 0 and " + n);
            } else {
                System.out.println("Error: Invalid input! Please enter an integer.");
                sc.next();
            }
        }
        double startTime = System.nanoTime();
        int result = binomialCoefficient(n, k);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("C(" + n + ", " + k + ") = " + result);
        System.out.println("\nTime taken: " + duration + " milliseconds");
    }

    /**
     * This method finds Binomial Coefficient of given numbers using formula
     * It uses recursion
     * The result is returned as an integer
     */

    private static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}