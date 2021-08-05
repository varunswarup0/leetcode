import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=1325 lang=java
 *
 * [1325] Delete Leaves With a Given Value
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 */
// public class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;

// TreeNode() {}

// TreeNode(int val) {
// this.val = val;
// }

// TreeNode(int val, TreeNode left, TreeNode right) {
// this.val = val;
// this.left = left;
// this.right = right;
// }
// }


class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {

        if (root == null)
            return root;

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if (root.left == null && root.right == null && root.val == target) {
            return null;
        } else {
            return root;
        }
    }
}
// @lc code=end
