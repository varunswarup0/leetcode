import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {

        Deque<String> stack = new LinkedList<>();

        for (String str : path.split("/")) {

            if (str.equals(".."))
                stack.poll();

            else if (!str.equals("") && !str.equals("."))
                stack.push(str);

        }

        StringBuilder sb = new StringBuilder();

        if (stack.isEmpty())
            return "/";

        while (!stack.isEmpty())
            sb.append("/").append(stack.pollLast());

        return sb.toString();
    }
}
// @lc code=end
