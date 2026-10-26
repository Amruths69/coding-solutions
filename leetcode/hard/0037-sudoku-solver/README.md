# Sudoku Solver

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy  **all of the following rules** :

- Each of the digits 1-9 must occur exactly once in each row.
- Each of the digits 1-9 must occur exactly once in each column.
- Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

The `'.'` character indicates empty cells.

 

 **Example 1:** 

```
Input: board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
Output: [["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
Explanation: The input board is shown above and the only valid solution is shown below:

```

 

 **Constraints:** 

- board.length == 9
- board[i].length == 9
- board[i][j] is a digit or '.'.
- It is guaranteed that the input board has only one solution.

## Solution

**Language:** Java  
**Runtime:** 400 ms (beats 10.20%)  
**Memory:** 42.4 MB (beats 92.83%)  
**Submitted:** 2026-10-26T23:46:07.540Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/sudoku-solver/)