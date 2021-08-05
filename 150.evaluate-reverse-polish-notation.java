import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode id=150 lang=java
 *
 * [150] Evaluate Reverse Polish Notation
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {


        Deque<Integer> stack = new ArrayDeque<>();

        for (String t : tokens) {

            switch (t) {

                case "+":
                    int b1 = stack.removeFirst();
                    int a1 = stack.removeFirst();
                    stack.addFirst(a1 + b1);
                    break;

                case "-":
                    int b2 = stack.removeFirst();
                    int a2 = stack.removeFirst();
                    stack.addFirst(a2 - b2);
                    break;

                case "/":
                    int b3 = stack.removeFirst();
                    int a3 = stack.removeFirst();
                    stack.addFirst(a3 / b3);
                    break;

                case "*":
                    int b4 = stack.removeFirst();
                    int a4 = stack.removeFirst();
                    stack.addFirst(a4 * b4);
                    break;


                default:
                    stack.addFirst(Integer.valueOf(t));
                    break;
            }
        }


        return stack.peekFirst();
    }
}
// @lc code=end
