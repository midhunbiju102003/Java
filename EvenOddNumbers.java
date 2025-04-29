import java.io.*; 
import java.util.Scanner; 

public class EvenOddNumbers { 
    public static void main(String[] args) { 
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.print("Enter the name of the input file: "); 
            String inputFileName = inputScanner.nextLine(); 

            // Reading from the input file and writing to even/odd files
            try (Scanner fileScanner = new Scanner(new FileInputStream(inputFileName));
                 PrintWriter evenWriter = new PrintWriter(new FileOutputStream("even.txt"));
                 PrintWriter oddWriter = new PrintWriter(new FileOutputStream("odd.txt"))) {

                int evenCount = 0;
                int oddCount = 0;

                while (fileScanner.hasNextInt()) { 
                    int number = fileScanner.nextInt(); 
                    if (number % 2 == 0) { 
                        evenWriter.println(number); 
                        evenCount++;
                    } else { 
                        oddWriter.println(number); 
                        oddCount++;
                    } 
                } 

                System.out.println("Even and odd numbers have been copied to separate files.");
                System.out.println("Total even numbers: " + evenCount);
                System.out.println("Total odd numbers: " + oddCount);

            } catch (FileNotFoundException e) {
                System.err.println("Error: Input file not found. " + e.getMessage());
            }
        } catch (IOException e) { 
            System.err.println("Error: " + e.getMessage()); 
        } 
    } 
}
