import java.util.Arrays;

/*
 * @lc app=leetcode id=621 lang=java
 *
 * [621] Task Scheduler
 */

// @lc code=start
class Solution {
    public int leastInterval(char[] tasks, int cooldownPeriod) {

        int[] freqArr = new int[26];

        for (char task : tasks)
            freqArr[task - 'A']++;


        Arrays.sort(freqArr);
        int maxFreq = freqArr[25];
        int emptySlots = (maxFreq - 1) * cooldownPeriod;


        for (int i = 24; i >= 0; i--)
            emptySlots -= Math.min(freqArr[i], maxFreq - 1);

        return (emptySlots > 0) ? tasks.length + emptySlots : tasks.length;
    }
}
// @lc code=end
