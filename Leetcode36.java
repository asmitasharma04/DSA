// Filename: Leetcode36.java
public class Leetcode36 {
    
    // Function to check if it's valid to place a number at a given position
    public boolean isValid(char[][] board, int row, int col, char num) {
        // Check the row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) return false;
        }
        
        // Check the column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }
        
        // Check the 3x3 subgrid
        int sRow = row / 3 * 3;
        int sCol = col / 3 * 3;
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }

    // Function to check if the entire Sudoku board is valid
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        
        // Traverse through each cell in the 9x9 board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Skip empty cells ('.')
                if (board[i][j] == '.') continue;
                
                // Get the current number in the cell
                char num = board[i][j];
                
                // Temporarily mark the cell as empty
                board[i][j] = '.';
                
                // Check if placing the number in the current cell is valid
                if (!isValid(board, i, j, num)) {
                    return false;
                }
                
                // Restore the original value in the cell
                board[i][j] = num;
            }
        }
        
        // If no invalid placements were found, return true
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        Leetcode36 solution = new Leetcode36();
        
        // Test case: Example Sudoku board
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        
        // Check if the board is a valid Sudoku
        boolean result = solution.isValidSudoku(board);
        
        // Print the result
        System.out.println("Is the Sudoku board valid? " + result);
    }
}
