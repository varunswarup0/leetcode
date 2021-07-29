import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 0)
            return intervals;

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> result = new ArrayList<>();
        int[] currInterval = intervals[0];
        result.add(currInterval);


        for (int[] interval : intervals) {

            if (interval[0] <= currInterval[1]) // Overlapping intervals, move the end if needed
                currInterval[1] = Math.max(currInterval[1], interval[1]);

            else { // Disjoint intervals, add the new interval to the list
                currInterval = interval;
                result.add(currInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
// @lc code=end
