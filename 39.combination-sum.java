import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
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
                list.add(nums[i]);
                helper(nums, target - nums[i], i);
                list.remove(list.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, 0);
        return ansList;
    }
}
// @lc code=end
