public class sudoku {

    // 1. Check if placing 'num' at board[row][col] is valid
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        
        // Check Row & Column in a single loop
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 Subgrid
        int startRow = row - (row % 3);
        int startCol = col - (col % 3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // 2. Main recursive solver method
    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                
                // Find an empty cell
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num; // Place number

                            // Recursively attempt to solve rest of board
                            if (solveSudoku(board)) {
                                return true;
                            }

                            board[row][col] = 0; // Backtrack!
                        }
                    }
                    return false; // Triggers backtracking if no number 1-9 works
                }
            }
        }
        return true; // Base Case: No empty cells left, puzzle is solved!
    }

    // 3. Helper to display the board nicely
    public static void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            if (r % 3 == 0 && r != 0) {
                System.out.println("---------------------");
            }
            for (int d = 0; d < 9; d++) {
                if (d % 3 == 0 && d != 0) {
                    System.out.print("| ");
                }
                System.out.print(board[r][d] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 0 represents an empty cell
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board)) {
            System.out.println("Sudoku Solved Successfully:\n");
            printBoard(board);
        } else {
            System.out.println("Unsolvable Sudoku board.");
        }
    }
}