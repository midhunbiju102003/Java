
import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

       
        boolean symmetric = true;
        outerLoop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break outerLoop;
                }
            }
        }

        
        System.out.println(symmetric ? "Symmetric" : "Not Symmetric");

        sc.close();
    }
}
//Enter the limit:
//3
//Enter the elements:
//1 2 3
//2 4 5
//3 5 6
//Symmetric