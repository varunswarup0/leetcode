/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {

        int position = 0;
        int maxReach = 0;

        while (position < nums.length && position <= maxReach) {
            int currReach = position + nums[position];

            maxReach = Math.max(maxReach, currReach);
            if (maxReach >= nums.length)
                return true;

            position++;
        }

        return position == nums.length;
    }
}
// @lc code=end
