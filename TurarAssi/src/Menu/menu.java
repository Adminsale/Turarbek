package Menu;

import Problems.Task1;
import Problems.Task2;
import Problems.Task3;
import Problems.Task4;
import Problems.Task5;
import Problems.Task6;
import Problems.Task7;
import Problems.Task8;
import Problems.Task9;
import Problems.Task10;

import java.util.Scanner;

public class menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void callTasksMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n---Tasks Menu---");
            System.out.println("1. Choose Task 1-10");
            System.out.println("11. Back");
            System.out.print("Your choice: ");
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    Task1.problem();
                    break;
                case 2:
                    Task2.problem();
                    break;
                case 3:
                    Task3.problem();
                    break;
                case 4:
                    Task4.problem();
                    break;
                case 5:
                    Task5.problem();
                    break;
                case 6:
                    Task6.problem();
                    break;
                case 7:
                    Task7.problem();
                    break;
                case 8:
                    Task8.problem();
                    break;
                case 9:
                    Task9.problem();
                    break;
                case 10:
                    Task10.problem();
                    break;
                case 11:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static int getUserChoice() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Please enter a number: ");
            }
        }
    }
}