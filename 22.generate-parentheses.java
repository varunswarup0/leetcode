import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {

    void helper(int max, String str, int open, int close, List<String> list) {

        if (open > max || close > open)
            return;

        if (str.length() == 2 * max) {
            list.add(str);
            return;
        }

        helper(max, str + '(', open + 1, close, list);
        helper(max, str + ')', open, close + 1, list);
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(n, "", 0, 0, list);
        return list;
    }
}
// @lc code=end
