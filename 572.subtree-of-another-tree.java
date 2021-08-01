/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {

    boolean isSame(TreeNode nodeOne, TreeNode nodeTwo) {

        if (nodeOne == null && nodeTwo == null)
            return true;
        else if (nodeOne == null || nodeTwo == null)
            return false;
        else if (nodeOne.val != nodeTwo.val)
            return false;
        else
            return isSame(nodeOne.left, nodeTwo.left) && isSame(nodeOne.right, nodeTwo.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null)
            return false;
        else if (isSame(root, subRoot))
            return true;
        else
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
// @lc code=end
