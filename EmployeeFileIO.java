import java.io.*;
import java.util.*;

public class EmployeeFileIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "employee2.txt";

        // Writing to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.print("Enter the number of employees: ");
            int limit = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            for (int i = 0; i < limit; i++) {
                try {
                    System.out.print("Enter employee number: ");
                    int empNo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter employee name: ");
                    String empName = scanner.nextLine();

                    System.out.print("Enter employee salary: ");
                    int salary = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Write to file
                    writer.write("Employee Number: " + empNo);
                    writer.newLine();
                    writer.write("Employee Name: " + empName);
                    writer.newLine();
                    writer.write("Employee Salary: " + salary);
                    writer.newLine();
                    writer.write("----------------------------");
                    writer.newLine();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter valid data.");
                    scanner.nextLine(); // Clear bad input
                    i--; // Repeat this iteration
                }
            }

            System.out.println("Employee data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("\nContents of the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
