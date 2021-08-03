/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {

        if (s.length() == 0)
            return 0;

        int res = 0;
        int curr = 0;
        boolean negative = false;
        int bound = Integer.MAX_VALUE / 10;

        while (curr < s.length() && s.charAt(curr) == ' ')
            curr++;


        if (curr < s.length() && (s.charAt(curr) == '-' || s.charAt(curr) == '+')) {
            negative = (s.charAt(curr) == '-');
            curr++;
        }


        while (curr < s.length() && s.charAt(curr) >= '0' && s.charAt(curr) <= '9') {

            if (res > bound || (res == bound && s.charAt(curr) - '0' > 7))
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            int num = s.charAt(curr) - '0';
            res = (res * 10) + num;
            curr++;
        }

        return (negative) ? -res : res;
    }
}
// @lc code=end
