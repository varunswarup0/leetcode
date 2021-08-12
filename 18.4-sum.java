import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length; j++) {

                if (j != i + 1 && nums[j] == nums[j - 1])
                    continue;

                int start = j + 1;
                int end = nums.length - 1;
                int tempTarget = target - nums[i] - nums[j];

                while (start < end) {

                    if (tempTarget < nums[start] + nums[end])
                        end--;

                    else if (tempTarget > nums[start] + nums[end])
                        start++;

                    else {

                        res.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));

                        start++;
                        end--;

                        while (start < end && nums[start] == nums[start - 1]) // skip same result
                            start++;

                        while (start < end && nums[end] == nums[end + 1]) // skip same result
                            end--;
                    }
                }
            }
        }

        return res;

    }
}
// @lc code=end
