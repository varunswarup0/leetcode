/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {

    public int mySqrt(int x) {
        int left = 1;
        int right = x;


        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mid == x / mid)
                return mid;

            else if (mid < x / mid)
                left = mid + 1;

            else
                right = mid - 1;

        }
        return right;
    }
}
// @lc code=end
