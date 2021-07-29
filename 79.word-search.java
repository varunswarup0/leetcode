/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

// @lc code=start
class Solution {

    boolean helper(int i, int j, int k, char[][] board, char[] w) {

        if (k == w.length)
            return true;

        if (i < 0 || j < 0 || i == board.length || j == board[0].length || board[i][j] != w[k])
            return false;

        board[i][j] ^= 256;

        boolean exist = helper(i + 1, j, k + 1, board, w) || helper(i - 1, j, k + 1, board, w)
                || helper(i, j + 1, k + 1, board, w) || helper(i, j - 1, k + 1, board, w);

        board[i][j] ^= 256;

        return exist;
    }

    public boolean exist(char[][] board, String word) {

        char[] w = word.toCharArray();

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (helper(i, j, 0, board, w))
                    return true;


        return false;
    }
}
// @lc code=end
