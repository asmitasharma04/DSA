public class Leetcode2596 {

    // Helper function to check if the knight can move to the next valid position
    public boolean helper(int[][] grid, int row, int col, int num) {
        int n = grid.length;

        // Base case: if the knight reaches the largest number, return true
        if (grid[row][col] == n * n - 1) {
            return true;
        }

        int i, j;

        // 2 up, 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == num + 1) {
            if (helper(grid, i, j, num + 1)) return true;
        }

        // 2 up, 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) {
            if (helper(grid, i, j, num + 1)) return true;
        }

        // 2 down, 1 right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == num + 1) {
            if (helper(grid, i, j, num + 1)) return true;
        }

        // 2 down, 1 left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == num + 1) {
            if (helper(grid, i, j, num + 1)) return true;
        }

        // 1 up, 2 right
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == num + 1) {
            if (helper(grid, i, j, num + 1)) return true;
        }

        // 1 down, 2 right
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == num + 1) {
            if (helper(grid, i, j, num + 1)) return true;
        }

        // 1 up, 2 left
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == num + 1) {
            if (helper(grid, i, j, num + 1)) return true;
        }

        // 1 down, 2 left
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == num + 1) {
            if (helper(grid, i, j, num + 1)) return true;
        }

        return false; // If no valid move is found, return false
    }

    // Function to check if the knight can traverse the grid
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;

        // Starting condition: grid[0][0] should be 0
        if (grid[0][0] != 0) {
            return false;
        }

        return helper(grid, 0, 0, 0); // Start the recursion from position (0, 0)
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Leetcode2596 solution = new Leetcode2596();

        // Test grid 1 (Valid case)
        int[][] grid1 = {
            {0, 1, 2},
            {5, 6, 3},
            {4, 7, 8}
        };
        System.out.println("Test Case 1: " + solution.checkValidGrid(grid1)); // Expected: true

        // Test grid 2 (Invalid case)
        int[][] grid2 = {
            {0, 1, 2},
            {3, 5, 4},
            {6, 7, 8}
        };
        System.out.println("Test Case 2: " + solution.checkValidGrid(grid2)); // Expected: false

        // Test grid 3 (Another valid case)
        int[][] grid3 = {
            {0, 11, 16, 5, 20},
            {17, 4, 19, 10, 15},
            {12, 1, 8, 21, 6},
            {3, 18, 23, 14, 9},
            {24, 13, 2, 7, 22}
        };
        System.out.println("Test Case 3: " + solution.checkValidGrid(grid3)); // Expected: true
    }
}

