/*
 * @lc app=leetcode id=1306 lang=java
 *
 * [1306] Jump Game III
 */

// @lc code=start
class Solution {

    boolean helper(int[] arr, int position) {
        if (position < 0 || position >= arr.length || arr[position] < 0)
            return false;
        else if (arr[position] == 0)
            return true;

        arr[position] = -arr[position];
        boolean forward = helper(arr, position + arr[position]);
        boolean backward = helper(arr, position - arr[position]);

        return forward || backward;
    }


    public boolean canReach(int[] arr, int start) {
        return helper(arr, start);
    }
}
// @lc code=end
