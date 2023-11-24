import java.util.Scanner;

public class Inf {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

       

        // Print all even numbers from 2 to n
        System.out.println("Even numbers from 2 to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
