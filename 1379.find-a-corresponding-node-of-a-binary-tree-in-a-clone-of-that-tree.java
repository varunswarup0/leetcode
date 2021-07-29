import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*
 * @lc app=leetcode id=1379 lang=java
 *
 * [1379] Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */

class Solution {

    class Pair {
        TreeNode original;
        TreeNode cloned;

        Pair(TreeNode original, TreeNode cloned) {
            this.original = original;
            this.cloned = cloned;
            }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned,
            final TreeNode target) {

        Deque<Pair> deque = new ArrayDeque<>();

        deque.push(new Pair(original, cloned));

        while (!deque.isEmpty()) {
            Pair pair = deque.pop();

            if (pair.original == target)
                return pair.cloned;

            if (pair.original.left != null && pair.cloned.left != null)
                deque.push(new Pair(pair.original.left, pair.cloned.left));

            if (pair.original.right != null && pair.cloned.right != null)
                deque.push(new Pair(pair.original.right, pair.cloned.right));
        }

        return null;
    }
}
// @lc code=end
