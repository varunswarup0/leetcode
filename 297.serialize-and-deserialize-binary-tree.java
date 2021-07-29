import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=297 lang=java
 *
 * [297] Serialize and Deserialize Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class Codec {
    String splitNode = ",";
    String nullNode = "X";
    // Encodes a tree to a single string.

    void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(nullNode).append(splitNode);
        } else {
            sb.append(node.val).append(splitNode);

            buildString(node.left, sb);
            buildString(node.right, sb);
        }
    }

    TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(nullNode))
            return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }

    public String serialize(TreeNode root) {
        StringBuilder data = new StringBuilder();
        buildString(root, data);
        return data.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(splitNode)));
        return buildTree(nodes);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end
