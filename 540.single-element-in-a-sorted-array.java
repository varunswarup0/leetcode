/*
 * @lc app=leetcode id=540 lang=java
 *
 * [540] Single Element in a Sorted Array
 */

// @lc code=start
class Solution {
    public int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (mid % 2 == 1)
                mid--;

            if (nums[mid] != nums[mid + 1])
                end = mid;

            else
                start = mid + 2;
        }

        return nums[start];
    }
}
// @lc code=end
