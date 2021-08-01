import java.util.HashMap;

/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start
class Solution {

    public int subarraySum(int[] nums, int target) {

        int res = 0;
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            preSum += nums[i];

            int diff = preSum - target;
            if (map.containsKey(diff))
                res += map.get(diff);

            map.put(preSum, map.getOrDefault(preSum, 0) + 1);

        }

        return res;
    }
}
// @lc code=end
