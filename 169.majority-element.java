/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int element = nums[0];

        for (int val : nums) {
            if (element == val) {
                count++;
            } else if (count == 0) {
                count++;
                element = val;
            } else {
                count--;
            }
        }


        return element;

    }
}
// @lc code=end
