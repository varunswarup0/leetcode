/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {

    public boolean isSubsequence(String s, String t) {

        int sPtr = 0;
        int tPtr = 0;

        while (sPtr < s.length() && tPtr < t.length()) {
            if (s.charAt(sPtr) == t.charAt(tPtr))
                sPtr++;

            tPtr++;
        }

        return sPtr == s.length();
    }
}
// @lc code=end
