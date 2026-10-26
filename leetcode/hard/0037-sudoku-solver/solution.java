class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                // Find an empty cell
                if (board[row][col] == '.') {

                    // Try digits 1 to 9
                    for (char digit = '1'; digit <= '9'; digit++) {

                        if (isValid(board, row, col, digit)) {

                            // Make a choice
                            board[row][col] = digit;

                            // Recursively solve the remaining board
                            if (solve(board)) {
                                return true;
                            }

                            // Undo the choice: backtracking
                            board[row][col] = '.';
                        }
                    }

                    // No digit worked in this empty cell
                    return false;
                }
            }
        }

        // No empty cells remain: Sudoku is solved
        return true;
    }

    private boolean isValid(char[][] board, int row, int col,
                            char digit) {

        for (int i = 0; i < 9; i++) {

            // Check the row
            if (board[row][i] == digit) {
                return false;
            }

            // Check the column
            if (board[i][col] == digit) {
                return false;
            }

            // Check the 3x3 box
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;

            if (board[boxRow][boxCol] == digit) {
                return false;
            }
        }

        return true;
    }
}