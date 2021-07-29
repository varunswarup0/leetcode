/*
 * @lc app=leetcode id=665 lang=java
 *
 * [665] Non-decreasing Array
 */

// @lc code=start
class Solution {
    public boolean checkPossibility(int[] nums) {

        Integer dipIndex = null;

        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] > nums[index + 1]) {

                if (dipIndex != null)
                    return false;

                dipIndex = index;
            }
        }

        return (dipIndex == null) || (dipIndex == 0) || (dipIndex == nums.length - 2)
                || (nums[dipIndex - 1] <= nums[dipIndex + 1]) || (nums[dipIndex] <= nums[dipIndex + 2]);
    }
}
// @lc code=end
