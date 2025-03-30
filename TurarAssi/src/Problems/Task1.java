package Problems;

import java.util.Scanner;

public class Task1 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given a positive integer 'n' and an array of 'n' numbers, this program finds the smallest number.");

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
        // Create an array of size n
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Record the start time
        double startTime = System.nanoTime();
        // Find the smallest number in the array
        int result = findMin(arr);
        // Record the end time
        double endTime = System.nanoTime();
        // Calculate the duration in milliseconds
        double duration = (endTime - startTime) / 1000000;

        // Output the result and execution time
        System.out.println("The minimum is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method finds the minimum number of given array
     * It uses a for loop to iterate through each number and compare
     */
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}