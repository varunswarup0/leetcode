import java.util.ArrayList;

/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {

        boolean isZeroCol = false;
        boolean isZeroRow = false;

        for (int i = 0; i < matrix.length; i++) // check the first column
            if (matrix[i][0] == 0) {
                isZeroCol = true;
                break;
            }

        for (int i = 0; i < matrix[0].length; i++) // check the first row
            if (matrix[0][i] == 0) {
                isZeroRow = true;
                break;
            }


        for (int i = 1; i < matrix.length; i++) // check except the first row and column
            for (int j = 1; j < matrix[0].length; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;

        for (int i = 1; i < matrix.length; i++) // process except the first row and column
            for (int j = 1; j < matrix[0].length; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;


        if (isZeroCol) // handle the first column
            for (int i = 0; i < matrix.length; i++)
                matrix[i][0] = 0;


        if (isZeroRow) // handle the first row
            for (int i = 0; i < matrix[0].length; i++)
                matrix[0][i] = 0;
    }
}
// @lc code=end
