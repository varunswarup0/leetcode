/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {

    public int jump(int[] nums) {

        if (nums.length <= 1)
            return 0;

        int jumps = 1;
        int curFarthest = nums[0];
        int currEnd = nums[0];

        for (int pos = 1; pos < nums.length - 1; pos++) {

            curFarthest = Math.max(curFarthest, pos + nums[pos]);

            if (pos == currEnd) {
                jumps++;
                currEnd = curFarthest;
            }
        }


        return jumps;
    }
}
// @lc code=end
