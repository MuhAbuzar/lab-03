import java.util.Scanner;

public class Choice{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        int choice;

        // Menu-driven loop
        do {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. Enter student marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0 or 1): ");

            // Read the user's choice
            choice = sc.nextInt();

            // Process the user's choice
            switch (choice) {
                case 1:
                    // Take input for student marks
                    System.out.print("Enter student marks (out of 100): ");
                    int marks = sc.nextInt();

                    // Provide feedback based on the entered marks
                    if (marks >= 90) {
                        System.out.println("This is Good");
                    } else if (marks >= 60) {
                        System.out.println("This is also Good");
                    } else if (marks >= 0) {
                        System.out.println("This is Good as well");
                    } else {
                        System.out.println("Invalid input for marks. Marks should be between 0 and 100.");
                    }
                    break;
                case 0:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter 0 or 1.");
            }
        } while (choice != 0);

        
    }
}
