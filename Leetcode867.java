import java.util.Arrays;

public class Leetcode867 {
    public static void main(String[] args) {
        // Example test case
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Create an instance of the Leetcode867 class
        Leetcode867 leetcode867 = new Leetcode867();

        // Get the transposed matrix
        int[][] result = leetcode867.transpose(matrix);

        // Print the result
        System.out.println("Transposed Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Create a new matrix for the result
        int[][] result = new int[cols][rows];
        
        // Fill the result matrix by swapping rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j]; // Transpose: matrix[i][j] becomes result[j][i]
            }
        }
        
        return result;
    }
}

