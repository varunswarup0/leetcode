import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        int[] res = new int[k];

        for (int val : nums)
            map.put(val, map.getOrDefault(val, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            pq.add(entry);

        for (int i = 0; i < k; i++)
            res[i] = pq.remove().getKey();

        return res;
    }
}
// @lc code=end
