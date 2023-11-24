import java.util.Scanner;

public class Avg {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter scores for 3 subjects
        System.out.print("Enter score for subject 1: ");
        double sub1 = sc.nextDouble();

        System.out.print("Enter score for subject 2: ");
        double sub2 = sc.nextDouble();

        System.out.print("Enter score for subject 3: ");
        double sub3 = sc.nextDouble();

        
        // Calculate the average score
        double averageScore = (sub1 + sub2 + sub3) / 3;

        // Check if the average score is above 50 and print the result
        if (averageScore > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
