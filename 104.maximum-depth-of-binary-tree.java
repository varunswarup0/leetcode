/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

    int helper(TreeNode node) {

        if (node == null)
            return 0;

        int leftHeight = helper(node.left);
        int rightHeight = helper(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }


    public int maxDepth(TreeNode root) {
        return helper(root);
    }
}
// @lc code=end
