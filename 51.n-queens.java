import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start
class Solution {

    char[][] board;
    int columnBit = 0;
    int normalDiagonal = 0;
    int reverseDiagonal = 0;
    List<List<String>> res = new ArrayList<>();


    void operateOnBoard(String operation, int row, int col) {
        board[row][col] = operation.equals("insert") ? 'Q' : '.';
        columnBit ^= (1 << col);
        normalDiagonal ^= (1 << (row + col));
        reverseDiagonal ^= (1 << (row - col + board.length - 1));
    }

    boolean checkSquare(int row, int col) {

        if ((columnBit & (1 << col)) != 0)
            return false;

        if ((normalDiagonal & (1 << (row + col))) != 0)
            return false;

        if ((reverseDiagonal & (1 << (row - col + board.length - 1))) != 0)
            return false;

        return true;
    }


    List<List<String>> solveNQueens(int n) {
        board = new char[n][n];

        for (char[] row : board)
            Arrays.fill(row, '.');


        solve(0);
        return res;
    }

    void solve(int row) {

        if (row == board.length) {
            List<String> path = new ArrayList<>();

            for (int i = 0; i < board.length; i++)
                path.add(new String(board[i]));

            res.add(path);

            return;
        }


        for (int col = 0; col < board.length; col++)
            if (checkSquare(row, col)) {
                operateOnBoard("insert", row, col);
                solve(row + 1);
                operateOnBoard("remove", row, col);
            }
    }
}
// @lc code=end
