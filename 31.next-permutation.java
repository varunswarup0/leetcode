/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {

    public void nextPermutation(int[] nums) {

        int n = nums.length - 1;
        int pivotIndex = -1;
        int pivot = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivotIndex = i;
                pivot = nums[i];
                break;
            }
        }

        if (pivotIndex == -1) {
            reverse(nums, 0, n);
            return;
        }

        for (int i = n; i >= 0; i--) {
            if (nums[i] > pivot) {
                swap(nums, pivotIndex, i);
                break;
            }
        }

        reverse(nums, pivotIndex + 1, n);
    }

    void reverse(int[] nums, int s, int e) {
        while (s < e) {
            swap(nums, s, e);
            s++;
            e--;
        }
    }

    void swap(int[] nums, int s, int e) {
        int t = nums[s];
        nums[s] = nums[e];
        nums[e] = t;
    }

}
// @lc code=end
