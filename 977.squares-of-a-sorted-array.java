import java.util.ArrayDeque;

/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int resIndex = nums.length - 1;

        int[] res = new int[nums.length];


        while (resIndex >= 0) {
            int begin = nums[i] * nums[i];
            int end = nums[j] * nums[j];

            if (begin < end) {
                res[resIndex] = end;
                j--;
            } else {
                res[resIndex] = begin;
                i++;
            }

            resIndex--;
        }

        return res;
    }
}
// @lc code=end
