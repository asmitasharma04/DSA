import java.util.ArrayList;
import java.util.List;

public class Leetcode54 {
    public static void main(String[] args) {
        // Example test case
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        Leetcode54 solution = new Leetcode54(); // Instantiate the same class for both
        List<Integer> result = solution.spiralOrder(matrix);
        
        // Print the result
        System.out.println(result);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        
        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // move the top boundary down
            
            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // move the right boundary left
            
            if (top <= bottom) {
                // Traverse from right to left along the bottom row
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // move the bottom boundary up
            }
            
            if (left <= right) {
                // Traverse from bottom to top along the left column
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // move the left boundary right
            }
        }
        
        return result;
    }
}
