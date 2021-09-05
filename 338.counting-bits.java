/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {

    public int[] countBits(int n) {

        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++)
            ans[i] = ans[i >> 1] + (i & 1);
        // ans[i] = Integer.bitCount(i);


        return ans;
    }
}
// @lc code=end
