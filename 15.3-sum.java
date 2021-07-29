import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) // skip same result
                continue;

            int j = i + 1;
            int k = nums.length - 1;
            int target = -nums[i];

            while (j < k) {

                if (target < nums[j] + nums[k])
                    k--;

                else if (target > nums[j] + nums[k])
                    j++;

                else {

                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) // skip same result
                        j++;

                    while (j < k && nums[k] == nums[k + 1]) // skip same result
                        k--;
                }
            }
        }

        return res;

    }
}
// @lc code=end
