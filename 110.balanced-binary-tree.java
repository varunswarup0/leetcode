/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

    class Pair {
        boolean isBalanced;
        int height;

    }

    Pair helper(TreeNode node) {
        if (node == null) {
            Pair leafPair = new Pair();
            leafPair.isBalanced = true;
            leafPair.height = 0;
            return leafPair;
        }

        Pair leftPair = helper(node.left);
        Pair rightPair = helper(node.right);

        Pair nodePair = new Pair();

        nodePair.isBalanced = leftPair.isBalanced && rightPair.isBalanced
                && Math.abs(leftPair.height - rightPair.height) <= 1;

        nodePair.height = Math.max(leftPair.height, rightPair.height) + 1;

        return nodePair;
    }

    public boolean isBalanced(TreeNode root) {
        return helper(root).isBalanced;
    }
}
// @lc code=end
