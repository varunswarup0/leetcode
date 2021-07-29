import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        int totalElements = matrix.length * matrix[0].length;

        List<Integer> res = new LinkedList<>();

        while (res.size() < totalElements) {

            for (int i = rowStart, j = colStart; j <= colEnd && res.size() < totalElements; j++)
                res.add(matrix[i][j]);

            rowStart++;

            for (int i = rowStart, j = colEnd; i <= rowEnd && res.size() < totalElements; i++)
                res.add(matrix[i][j]);

            colEnd--;

            for (int i = rowEnd, j = colEnd; j >= colStart && res.size() < totalElements; j--)
                res.add(matrix[i][j]);

            rowEnd--;

            for (int i = rowEnd, j = colStart; i >= rowStart && res.size() < totalElements; i--)
                res.add(matrix[i][j]);

            colStart++;
        }

        return res;
    }
}
// @lc code=end
