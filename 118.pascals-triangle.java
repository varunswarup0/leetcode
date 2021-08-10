import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int upLeft = triangle.get(i - 1).get(j - 1);
                    int upRight = triangle.get(i - 1).get(j);
                    row.add(upLeft + upRight);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}
// @lc code=end
