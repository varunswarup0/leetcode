/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int right = 0;

        int sum = 0;
        int minCount = Integer.MAX_VALUE;

        while (right < nums.length) {

            sum += nums[right];

            while (sum >= target) {

                int count = right - left + 1;
                minCount = Math.min(minCount, count);
                sum -= nums[left];
                left++;

            }

            right++;
        }

        return minCount == Integer.MAX_VALUE ? 0 : minCount;

    }
}
// @lc code=end
