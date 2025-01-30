public class Leetcode240 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 5;
        Solution solution = new Solution();
        boolean result = solution.searchMatrix(matrix, target);
        System.out.println(result);  // Output should be true
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length, i = 0, j = m - 1;
        while (i < n && j >= 0) {
            if (matrix[i][j] == target) return true;
            if (target < matrix[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}

