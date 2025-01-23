// leetcode766.java

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 1, 2},
            {5, 4, 1}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 1, 2},
            {5, 9, 1}
        };

        System.out.println("Matrix 1 is Toeplitz: " + solution.isToeplitzMatrix(matrix1)); // Output: true
        System.out.println("Matrix 2 is Toeplitz: " + solution.isToeplitzMatrix(matrix2)); // Output: false
    }
}

