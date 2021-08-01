/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {

        char[] c = s.toCharArray();

        int start = 0;
        int end = c.length - 1;

        while (start < end)
            if (!Character.isLetterOrDigit(c[start]))
                start++;
            else if (!Character.isLetterOrDigit(c[end]))
                end--;
            else if (Character.toLowerCase(c[start++]) != Character.toLowerCase(c[end--]))
                return false;


        return true;
    }
}
// @lc code=end
