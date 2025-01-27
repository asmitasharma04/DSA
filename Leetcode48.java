import java.util.Arrays;

public class Leetcode48 {
    public static void main(String[] args) {
        // Test case for rotating a matrix 90 degrees clockwise
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Create an instance of the solution
        Leetcode48 solution = new Leetcode48();
        
        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Call the rotate function to rotate the matrix 90 degrees
        solution.rotate(matrix);
        
        // Print the rotated matrix
        System.out.println("Rotated Matrix (90 degrees clockwise):");
        printMatrix(matrix);
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // Step 1: Transpose the matrix (swap rows with columns)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}

