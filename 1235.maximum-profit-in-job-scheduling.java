import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

/*
 * @lc app=leetcode id=1235 lang=java
 *
 * [1235] Maximum Profit in Job Scheduling
 */

// @lc code=start
class Solution {

    class Job implements Comparable<Job> {
        int startTime;
        int endTime;
        int profit;

        Job(int startTime, int endTime, int profit) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }

        public int compareTo(Job other) {
            return this.endTime - other.endTime;
        }
    }


    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {


        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < startTime.length; i++)
            jobs.add(new Job(startTime[i], endTime[i], profit[i]));

        Collections.sort(jobs);

        // <Endtime, Profit>
        TreeMap<Integer, Integer> dp = new TreeMap<>();

        // <at start Endtime = 0, at start Profit = 0>
        dp.put(0, 0);

        for (Job job : jobs) {

            int curr = dp.floorEntry(job.startTime).getValue() + job.profit;

            if (curr > dp.lastEntry().getValue())
                dp.put(job.endTime, curr);
        }

        return dp.lastEntry().getValue();
    }
}
// @lc code=end
