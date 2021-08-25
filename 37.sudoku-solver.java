/*
 * @lc app=leetcode id=37 lang=java
 *
 * [37] Sudoku Solver
 */

// @lc code=start
class Solution {

    int[] rows = new int[9];
    int[] cols = new int[9];
    int[][] grid = new int[3][3];


    void operateOnSudoku(String operation, int i, int j, int num, char[][] board) {
        board[i][j] = operation.equals("insert") ? (char) num : '0';
        rows[i] ^= (1 << num);
        cols[j] ^= (1 << num);
        grid[i / 3][j / 3] ^= (1 << num);
    }

    boolean checkBox(int i, int j, int num) {

        if (((rows[i] & (1 << num)) != 0))
            return false;

        if ((cols[j] & (1 << num)) != 0)
            return false;

        if ((grid[i / 3][j / 3] & (1 << num)) != 0)
            return false;


        return true;
    }

    void solveSudoku(int i, int j, char[][] board) {

        if (i == board.length) {
            return;
        }

        if (board[i][j] != 0)
            solveSudoku(j < 8 ? i : i + 1, j < 8 ? j + 1 : 0, board);

        else {
            for (int num = 1; num <= 9; num++) {
                if (checkBox(i, j, num)) {
                    operateOnSudoku("insert", i, j, num, board);
                    solveSudoku(j < 8 ? i : i + 1, j < 8 ? j + 1 : 0, board);
                    operateOnSudoku("remove", i, j, num, board);
                }
            }
        }
    }

    public void solveSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                rows[i] |= (1 << board[i][j]);
                cols[j] |= (1 << board[i][j]);
                grid[i / 3][j / 3] |= (1 << board[i][j]);
            }
        }

        solveSudoku(0, 0, board);
    }
}
// @lc code=end
