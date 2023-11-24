import java.util.Scanner;

public class Switch{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of the month
        System.out.print("Enter the number of the month (1-12): ");

        // Read the month number from the user
        int monthNumber = sc.nextInt();

        

        // Check if the entered month number is valid
        if (monthNumber >= 1 && monthNumber <= 12) {
            // Use a switch statement to determine the month name
            String monthName;
            switch (monthNumber) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
                default:
                    monthName = "Invalid month"; // This should not happen due to the earlier check
            }

            // Display the month name
            System.out.println("Month Name: " + monthName);
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
}
