import java.util.Arrays;

/*
 * @lc app=leetcode id=621 lang=java
 *
 * [621] Task Scheduler
 */

// @lc code=start
class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] arr = new int[26];

        for (char code : tasks)
            arr[code - 'A']++;

        Arrays.sort(arr);

        int idleTime = 25;

        while (idleTime >= 0 && arr[idleTime] == arr[25])
            idleTime--;

        return Math.max(tasks.length, (arr[25] - 1) * (n + 1) + 25 - idleTime);
    }
}
// @lc code=end
