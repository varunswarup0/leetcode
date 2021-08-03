import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Zigzag Level Order Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        if (root == null)
            return res;

        Deque<TreeNode> s1 = new LinkedList<>();
        Deque<TreeNode> s2 = new LinkedList<>();


        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            List<Integer> leftToRight = new ArrayList<>();

            while (!s1.isEmpty()) {

                TreeNode top = s1.pop();
                leftToRight.add(top.val);

                if (top.left != null)
                    s2.push(top.left);
                if (top.right != null)
                    s2.push(top.right);
            }

            res.add(leftToRight);

            List<Integer> rightToLeft = new ArrayList<>();

            while (!s2.isEmpty()) {

                TreeNode top = s2.pop();
                rightToLeft.add(top.val);

                if (top.right != null)
                    s1.push(top.right);
                if (top.left != null)
                    s1.push(top.left);
            }

            if (!rightToLeft.isEmpty())
                res.add(rightToLeft);
        }

        return res;

    }
}
// @lc code=end
