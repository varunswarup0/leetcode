/*
 * @lc app=leetcode id=416 lang=java
 *
 * [416] Partition Equal Subset Sum
 */

// @lc code=start
class Solution {

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int num : nums)
            sum += num;

        if (sum % 2 != 0)
            return false;

        int target = sum / 2;

        boolean[][] dp = new boolean[target + 1][nums.length + 1];

        for (int i = 0; i <= target; i++) {
            for (int j = 0; j <= nums.length; j++) {

                if (i == 0)
                    dp[i][j] = true;

                else if (j == 0)
                    dp[i][j] = false;

                else {

                    boolean include = (i >= nums[j - 1]) && dp[i - nums[j - 1]][j - 1];
                    boolean exclude = dp[i][j - 1];

                    dp[i][j] = include || exclude;
                }
            }
        }

        return dp[target][nums.length];
    }
}
// @lc code=end
