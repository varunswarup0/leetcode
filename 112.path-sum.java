/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 */

// @lc code=start
/**
 */
// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class Solution {

    boolean dfs(TreeNode root, int targetSum) {

        if (root == null)
            return false;

        // leaf node
        if (root.left == null && root.right == null && root.val == targetSum)
            return true;

        boolean left = dfs(root.left, targetSum - root.val);
        boolean right = dfs(root.right, targetSum - root.val);

        return left || right;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }
}
// @lc code=end
