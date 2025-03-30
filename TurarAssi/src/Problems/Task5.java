package Problems;

import java.util.Scanner;

public class Task5 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given a number “n”, write the function for finding n-th elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2). F0 = 0, F1 = 1.");

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
        int result = fib(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("Fibonacci number at position " + n + " is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method finds n-th element of Fibonacci sequence
     * It uses a recursion
     * The result is returned as an integer
     */

    private static int fib(int n) {
        if (n == 0 || n == 1) { return n; }
        return fib(n - 1) + fib(n - 2);
    }
}