
/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {

    void swap(int[] nums, int i, int j) {
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }

    int partition(int[] nums, int low, int high) {

        int pivot = nums[high];
        int i = low;

        for (int j = low; j < high; j++)
            if (nums[i] <= pivot)
                swap(nums, i++, j);

        swap(nums, i, high);

        return i;
    }

    public int findKthLargest(int[] nums, int k) {

        k = nums.length - k;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int pivot = partition(nums, left, right);

            if (pivot == k)
                return nums[k];
            else if (pivot < k)
                left = pivot + 1;
            else
                right = pivot - 1;
        }

        return -1;
    }
}
// @lc code=end
