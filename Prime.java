import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(n);

        // Display the result
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for factors from 2 to the number-1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; // Found a factor, so the number is not prime
            }
        }

        return true; // If no factors were found, the number is prime
    }
}
