import java.util.Arrays;

/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {

    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high])
                low = mid + 1;

            else
                high = mid;
        }

        int realLow = low;

        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int realMid = (mid + realLow) % nums.length;

            if (nums[realMid] < target)
                low = mid + 1;

            else if (nums[realMid] > target)
                high = mid - 1;

            else
                return realMid;
        }


        return -1;
    }
}
// @lc code=end
