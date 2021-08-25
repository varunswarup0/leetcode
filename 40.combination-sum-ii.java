import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {

    List<Integer> list = new ArrayList<>();
    List<List<Integer>> ansList = new ArrayList<>();

    void helper(int[] nums, int target, int start) {

        if (target == 0)
            ansList.add(new ArrayList<>(list));

        else if (target > 0) {

            for (int i = start; i < nums.length; i++) {

                if (i > start && nums[i] == nums[i - 1])
                    continue;

                list.add(nums[i]);
                helper(nums, target - nums[i], i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        helper(candidates, target, 0);
        return ansList;
    }
}
// @lc code=end
