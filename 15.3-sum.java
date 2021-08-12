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

        for (int index = 0; index < nums.length; index++) {

            if (index > 0 && nums[index] == nums[index - 1]) // skip same result
                continue;

            int start = index + 1;
            int end = nums.length - 1;
            int target = -nums[index];

            while (start < end) {

                if (target < nums[start] + nums[end])
                    end--;

                else if (target > nums[start] + nums[end])
                    start++;

                else {

                    res.add(Arrays.asList(nums[index], nums[start], nums[end]));

                    start++;
                    end--;

                    while (start < end && nums[start] == nums[start - 1]) // skip same result
                        start++;

                    while (start < end && nums[end] == nums[end + 1]) // skip same result
                        end--;
                }
            }
        }

        return res;

    }
}
// @lc code=end
