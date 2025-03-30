package Problems;

import java.util.Scanner;

public class Task7 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given a number “n” and an array of “n” elements, write the program that returns given array in reverse order without using array data structure.");

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

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double startTime = System.nanoTime();

        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.print("Reversed order: ");
        reverse(n - 1, arr);
        System.out.println("\nTime taken: " + duration + " milliseconds");
    }

    /**
     * This method reverses array numbers by index
     * The result is returned using sout
     */

    private static void reverse(int n, int[] arr) {
        if (n < 0){ return; }
        System.out.print(arr[n] + " ");
        reverse(n - 1, arr);
    }
}
