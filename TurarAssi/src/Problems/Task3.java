package Problems;

import java.util.Scanner;

public class Task3 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given a number “n”, write the function for checking whether “n” is prime.");
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        String result = isPrime(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println("The number is " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }

    /**
     * This method defines whether a given integer 'n' is a prime number or a composite number
     * Returns answer as a string
     */

    private static String isPrime(int n) {
        if (n <= 1) {
            return "Composite";
        }
        if (n == 2) {
            return "Prime";
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }
}