import java.util.Scanner;

// Custom exception for negative input
class NegativeInputException extends Exception {
    public NegativeInputException() {
        super("Negative input is not allowed.");
    }
}

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();  // Total number of inputs expected
        int sum = 0;
        int count = 0;  // Count of valid numbers entered

        // Loop to take N inputs
        for (int i = 1; i <= N; i++) {
            try {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();

                // Check if the number is negative
                if (num < 0) {
                    throw new NegativeInputException();
                }

                sum += num;  // Add the valid number to the sum
                count++;     // Increment count of valid numbers

            } catch (NegativeInputException e) {
                System.out.println(e.getMessage());  // Show the error message
                i--;  // Do not count this iteration towards N
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
                i--; // Do not count this iteration towards N
            }
        }

        // Calculate and display the average if count > 0 (to avoid division by zero)
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The Average of the valid numbers is: " + average);
        } else {
            System.out.println("No valid numbers entered, cannot calculate average.");
        }

        scanner.close();  
    }
}