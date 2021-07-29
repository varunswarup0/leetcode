import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return new ArrayList<>();

        String[] dict =
                new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> combos = new ArrayList<>();
        helper(digits.toCharArray(), dict, combos, "");
        return combos;
    }

    void helper(char[] digits, String[] dict, List<String> combos, String currCombo) {

        if (currCombo.length() == digits.length) {
            combos.add(currCombo);
            return;
        }

        int digit = digits[currCombo.length()] - '0';

        for (char alphabet : dict[digit].toCharArray())
            helper(digits, dict, combos, currCombo + alphabet);
    }


}
// @lc code=end
