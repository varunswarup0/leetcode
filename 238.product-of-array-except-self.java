import java.util.Arrays;

/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {

    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);


        for (int i = 1; i < ans.length; i++)
            ans[i] = nums[i - 1] * ans[i - 1];

        int rightProduct = 1;

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return ans;
    }
}
// @lc code=end
