import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> res = new LinkedList<>();

        if (nums == null || nums.length == 0)
            return res;

        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (Math.abs(nums[i] - end) > 1) {
                res.add(start + ((start == end) ? "" : "->" + end));
                start = nums[i];
            }

            end = nums[i];
        }

        res.add(start + ((start == end) ? "" : "->" + end));

        return res;
    }
}
// @lc code=end
