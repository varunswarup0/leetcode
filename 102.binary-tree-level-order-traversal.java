import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null)
            return res;

        q.add(root);

        while (!q.isEmpty()) {
            int level = q.size();
            List<Integer> levelList = new LinkedList<>();

            for (int i = 0; i < level; i++) {
                TreeNode front = q.poll();
                levelList.add(front.val);

                if (front.left != null)
                    q.add(front.left);
                if (front.right != null)
                    q.add(front.right);
            }

            res.add(levelList);
        }

        return res;
    }
}
// @lc code=end
