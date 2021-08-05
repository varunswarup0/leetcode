import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=508 lang=java
 *
 * [508] Most Frequent Subtree Sum
 */

// @lc code=start
/**
 */
// * Definition for a binary tree node.
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

    int maxFreq = Integer.MIN_VALUE;
    HashMap<Integer, Integer> map = new HashMap<>();

    int sum(TreeNode node, HashMap<Integer, Integer> map) {
        if (node == null)
            return 0;


        int leftSum = sum(node.left, map);
        int rightSum = sum(node.right, map);

        int nodeSum = node.val + leftSum + rightSum;

        map.put(nodeSum, map.getOrDefault(nodeSum, 1) + 1);
        maxFreq = Math.max(maxFreq, map.get(nodeSum));

        return nodeSum;
    }

    public int[] findFrequentTreeSum(TreeNode root) {

        sum(root, map);

        List<Integer> arr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int sum = entry.getKey();
            int freq = entry.getValue();

            if (freq == maxFreq)
                arr.add(sum);

        }

        return arr.stream().mapToInt(i -> i).toArray();
    }



}
// @lc code=end
