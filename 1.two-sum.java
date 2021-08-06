import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
s *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int reqdVal = target - nums[i];
            if (map.containsKey(reqdVal))
                return new int[] {map.get(reqdVal), i};
            else
                map.put(nums[i], i);
        }

        return ans;
    }
}
// @lc code=end
