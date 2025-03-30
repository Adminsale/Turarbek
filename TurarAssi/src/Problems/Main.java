package Problems;

import Menu.menu;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\n---Main Menu---");
            System.out.println("1. Tasks");
            System.out.println("2. Exit");
            System.out.print("Your choice: ");

            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    menu.callTasksMenu();
                    break;
                case 2:
                    System.out.println("Exiting the program...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
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