import java.util.Scanner;

public class Even {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Initialize counters for even, odd, and zero values
        int evenCount = 0;
        int oddCount = 0;
        int zeroCount = 0;

        // Prompt the user to enter 10 values
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter value #" + i + ": ");
            int value = sc.nextInt();

            // Check if the value is even, odd, or zero
            if (value % 2 == 0) {
                evenCount++;
            } else if (value != 0) {
                oddCount++;
            } else {
                zeroCount++;
            }
        }

        

        // Display the results
        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
        System.out.println("Zero Count: " + zeroCount);
    }
}
