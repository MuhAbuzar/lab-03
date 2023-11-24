import java.util.Scanner;

public class Leap {

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Step 2: Prompt the user to enter the starting year (above 1000)
        System.out.print("Enter the starting year (above 1000): ");
        int startYear = sc.nextInt();

        // Step 3: Validate the starting year
        if (startYear <= 1000) {
            System.out.println("Invalid input. Starting year should be above 1000.");
            return; // Exit the program
        }

        // Step 4: Prompt the user to enter the ending year
        System.out.print("Enter the ending year: ");
        int endYear = sc.nextInt();

        // Step 5: Validate the ending year
        if (endYear <= startYear) {
            System.out.println("Invalid input. Ending year should be greater than the starting year.");
            return; // Exit the program
        }

        // Step 6: Find and display leap years between the starting and ending years
        System.out.println("Leap years between " + startYear + " and " + endYear + ":");
        for (int year = startYear; year <= endYear; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year);
            }
        }

   
    }
}
