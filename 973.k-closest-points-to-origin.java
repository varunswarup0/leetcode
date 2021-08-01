import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

// @lc code=start
class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (p1, p2) -> (p2[0] * p2[0] + p2[1] * p2[1]) - (p1[0] * p1[0] + p1[1] * p1[1]));

        for (int[] p : points) {
            pq.offer(p);

            if (pq.size() > k)
                pq.poll();
        }

        int[][] res = new int[pq.size()][2];

        while (k > 0)
            res[--k] = pq.poll();


        return res;
    }
}
// @lc code=end
