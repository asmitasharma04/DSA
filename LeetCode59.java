import java.util.Arrays;

public class LeetCode59 {
    
    public int[][] generateMatrix(int n) {
        // Create an empty n x n matrix
        int[][] matrix = new int[n][n];
        
        // Define the boundaries
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1; // Start filling with 1
        
        // Start filling the matrix in spiral order
        while (top <= bottom && left <= right) {
            // Fill from left to right (top row)
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++; // Move the top boundary down
            
            // Fill from top to bottom (right column)
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--; // Move the right boundary left
            
            if (top <= bottom) {
                // Fill from right to left (bottom row)
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--; // Move the bottom boundary up
            }
            
            if (left <= right) {
                // Fill from bottom to top (left column)
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++; // Move the left boundary right
            }
        }
        
        return matrix;
    }

    public static void main(String[] args) {
        LeetCode59 solution = new LeetCode59();
        
        // Example 1: n = 3
        int n1 = 3;
        int[][] result1 = solution.generateMatrix(n1);
        System.out.println("Spiral matrix for n = " + n1 + ":");
        System.out.println(Arrays.deepToString(result1));
        
        // Example 2: n = 1
        int n2 = 1;
        int[][] result2 = solution.generateMatrix(n2);
        System.out.println("Spiral matrix for n = " + n2 + ":");
        System.out.println(Arrays.deepToString(result2));
    }
}
