package Problems;

import java.util.Scanner;

public class Task8 {
    public static void problem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are given a string “s”, write the function for checking whether “s” is all consists of digits.");
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        if (isAllDigits(s)) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }

        System.out.println("\nTime taken: " + duration + " milliseconds");
    }

    /**
     * This method checks if the string consists only digits
     * The result is returned using boolean
     */

    private static boolean isAllDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return !s.isEmpty();
    }
}