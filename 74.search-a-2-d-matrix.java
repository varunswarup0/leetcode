/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            int i = mid / cols;
            int j = mid % cols;

            if (matrix[i][j] < target)
                start = mid + 1;

            else if (matrix[i][j] > target)
                end = mid - 1;

            else
                return true;
        }


        return false;
    }
}
// @lc code=end
