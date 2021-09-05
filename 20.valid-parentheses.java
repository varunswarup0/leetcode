import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);

            else if (stack.empty())
                return false;

            if (ch == ')' && stack.pop() != '(')
                return false;

            else if (ch == ']' && stack.pop() != '[')
                return false;

            else if (ch == '}' && stack.pop() != '{')
                return false;
        }

        return stack.isEmpty();
    }
}
// @lc code=end
