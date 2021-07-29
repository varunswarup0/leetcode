/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {

        int prevSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int val : nums) {
            prevSum = val + ((prevSum > 0) ? prevSum : 0);
            maxSum = Math.max(maxSum, prevSum);
        }


        return maxSum;
    }
}
// @lc code=end
