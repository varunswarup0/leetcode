/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 */

// @lc code=start
class Solution {


    void swap(int[] nums, int i, int j) {
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }

    public int firstMissingPositive(int[] nums) {

        for (int i = 0; i < nums.length; i++)
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != i + 1)
                return i + 1;

        return nums.length + 1;
    }
}
// @lc code=end
