public class MaxKnights {
    static int max = -1;  // To store the maximum number of knights placed
    
    // Check if it's safe to place a knight at the given position (row, col)
    public static boolean issafe(char[][] board, int row, int col) {
        int n = board.length;
        
        int i, j;
        // 2 up, 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'k') return false;
        
        // 2 up, 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'k') return false;
        
        // 2 down, 1 right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'k') return false;
        
        // 2 down, 1 left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'k') return false;
        
        // 1 up, 2 right
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'k') return false;
        
        // 1 down, 2 right
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'k') return false;
        
        // 1 up, 2 left
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'k') return false;
        
        // 1 down, 2 left
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'k') return false;
        
        return true;
    }

    // Recursive function to place knights on the board
    public static void helper(char[][] board, int row, int col, int knightsPlaced) {
        int n = board.length;

        // If all cells have been checked, return the maximum knights placed
        if (row == n) {
            max = Math.max(max, knightsPlaced);
            return;
        }

        // If we are at the end of a row, go to the next row
        if (col == n) {
            helper(board, row + 1, 0, knightsPlaced);
            return;
        }

        // Option 1: Don't place a knight at this position
        helper(board, row, col + 1, knightsPlaced);

        // Option 2: Try placing a knight at this position if it's safe
        if (issafe(board, row, col)) {
            // Place the knight
            board[row][col] = 'k';

            // Recur with knight placed at (row, col)
            helper(board, row, col + 1, knightsPlaced + 1);

            // Backtrack: Remove the knight
            board[row][col] = 'x';
        }
    }

    public static void main(String[] args) {
        int n = 3;  // You can change the size of the board here
        char[][] board = new char[n][n];
        
        // Initialize the board with 'x' (representing empty cells)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        // Start the recursive knight placement
        helper(board, 0, 0, 0);

        // Output the maximum number of knights that can be placed
        System.out.println("Maximum number of knights that can be placed: " + max);
    }
}
