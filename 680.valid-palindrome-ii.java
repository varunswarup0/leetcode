import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int numOfOdds = 0;

        for (Map.Entry entry : map.entrySet()) {
            Integer val = (Integer) entry.getValue();
            if ((val & 1) != 0)
                numOfOdds++;
        }

        return numOfOdds <= 1;
    }
}
// @lc code=end
