import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number (a): ");
        double a = sc.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number (b): ");
        double b = sc.nextDouble();

        // Prompt the user to enter the operation
        System.out.println("Select the operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");

        // Read the operation from the user
        System.out.print("Enter the operation (1-5): ");
        int operation = sc.nextInt();

        

        // Perform the calculation based on the selected operation
        double result = 0;

        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is undefined.");
                    return; // Exit the program if division by zero is attempted
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Error: Modulo by zero is undefined.");
                    return; // Exit the program if modulo by zero is attempted
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter a number between 1 and 5.");
                return; // Exit the program for an invalid operation
        }

        // Display the result
        System.out.println("Result: " + result);
    }
}
