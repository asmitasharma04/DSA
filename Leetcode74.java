public class Leetcode74 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        Solution solution = new Solution();
        boolean result = solution.searchMatrix(matrix, target);
        System.out.println(result);  // Output should be true
    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int s = 0, e = m * n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int midele = matrix[mid / m][mid % m]; // Mapping the 1D index to 2D
            if (midele == target) return true;
            if (target < midele) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return false;
    }
}

