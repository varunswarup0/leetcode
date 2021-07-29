import java.util.HashMap;

/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int val : nums)
            map.put(val, true);

        for (int val : nums)
            if (map.containsKey(val - 1))
                map.put(val, false);

        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i])) {

                int count = 1;

                while (map.containsKey(nums[i] + count))
                    count++;

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}
// @lc code=end
