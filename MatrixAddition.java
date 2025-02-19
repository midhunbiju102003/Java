// public class MatrixAddition {
//     public MatrixAddition() {
//     }
 
//     public static void main(String[] var0) {
//        int[][] var1 = new int[][]{{1, 5, 3}, {5, 7, 6}, {9, 8, 3}};
//        int[][] var2 = new int[][]{{4, 8, 7}, {2, 5, 4}, {3, 2, 4}};
//        int[][] var3 = new int[3][3];
//        System.out.println("First Matrix :");
 
//        int var4;
//        int var5;
//        for(var4 = 0; var4 < 3; ++var4) {
//           for(var5 = 0; var5 < 3; ++var5) {
//              System.out.print(var1[var4][var5] + " ");
//           }
 
//           System.out.println();
//        }
 
//        System.out.println("Second Matrix :");
 
//        for(var4 = 0; var4 < 3; ++var4) {
//           for(var5 = 0; var5 < 3; ++var5) {
//              System.out.print(var2[var4][var5] + " ");
//           }
 
//           System.out.println();
//        }
 
//        for(var4 = 0; var4 < 3; ++var4) {
//           for(var5 = 0; var5 < 3; ++var5) {
//              var3[var4][var5] = var1[var4][var5] + var2[var4][var5];
//           }
//        }
 
//        System.out.println("Result of Matrix Addition:");
 
//        for(var4 = 0; var4 < 3; ++var4) {
//           for(var5 = 0; var5 < 3; ++var5) {
//              System.out.print(var3[var4][var5] + " ");
//           }
 
//           System.out.println();
//        }
 
//     }
//  }
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 5, 3},
            {5, 7, 6},
            {9, 8, 3}
        };
        
        int[][] matrix2 = {
            {4, 8, 7},
            {2, 5, 4},
            {3, 2, 4}
        };
        
        int[][] resultMatrix = new int[3][3];

        // Print matrices and calculate the result in one loop
        System.out.println("First Matrix:");
        printMatrix(matrix1);
        System.out.println("Second Matrix:");
        printMatrix(matrix2);
        
        // Perform matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Result of Matrix Addition:");
        printMatrix(resultMatrix);
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}