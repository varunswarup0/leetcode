import java.util.HashSet;

/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int val : nums)
            set.add(val);

        int maxCount = 0;

        for (int val : set) {
            if (!set.contains(val - 1)) {

                int count = 1;

                while (set.contains(val + count))
                    count++;

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}
// @lc code=end
