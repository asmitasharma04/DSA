public class Leetcode37 {

    // Function to solve the Sudoku puzzle
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    // Helper recursive function to solve the Sudoku board using backtracking
    private boolean solve(char[][] board) {
        // Loop through every cell in the 9x9 grid
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // If the cell is empty ('.'), try placing a number
                if (board[i][j] == '.') {
                    // Try placing digits from '1' to '9'
                    for (char num = '1'; num <= '9'; num++) {
                        // Check if it's valid to place the number
                        if (isValid(board, i, j, num)) {
                            // If valid, place the number
                            board[i][j] = num;

                            // Recursively attempt to solve the rest of the board
                            if (solve(board)) {
                                return true;
                            }

                            // If placing the number didn't lead to a solution, backtrack
                            board[i][j] = '.';
                        }
                    }
                    // If no valid number can be placed, return false
                    return false;
                }
            }
        }
        // If we filled all cells, return true (solved)
        return true;
    }

    // Function to check if it's valid to place a number at the given position
    private boolean isValid(char[][] board, int row, int col, char num) {
        // Check the row for the same number
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) return false;
        }
        
        // Check the column for the same number
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }

        // Check the 3x3 subgrid for the same number
        int sRow = row / 3 * 3;
        int sCol = col / 3 * 3;
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        // If no conflicts, return true
        return true;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Leetcode37 solution = new Leetcode37();

        // Example input board
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        // Call the solveSudoku function
        solution.solveSudoku(board);

        // Print the solved board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
