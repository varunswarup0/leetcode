/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        int fastIndex = 0;
        int smallIndex = 0;
        int prev = -101;


        while (fastIndex < nums.length) {
            if (nums[fastIndex] != prev)
                nums[smallIndex++] = nums[fastIndex];

            prev = nums[fastIndex++];
        }

        return smallIndex;
    }
}
// @lc code=end
