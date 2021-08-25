/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftMaxHeight = height[left];
        int rightMaxHeight = height[right];

        int area = 0;

        while (left < right) {
            leftMaxHeight = Math.max(leftMaxHeight, height[left]);
            rightMaxHeight = Math.max(rightMaxHeight, height[right]);

            if (leftMaxHeight < rightMaxHeight) {
                area += leftMaxHeight - height[left];
                left++;
            } else {
                area += rightMaxHeight - height[right];
                right--;
            }
        }

        return area;
    }
}
// @lc code=end
