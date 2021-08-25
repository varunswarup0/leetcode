import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {

    List<Integer> set = new ArrayList<>();
    List<List<Integer>> powerSet = new ArrayList<>();

    void helper(int[] nums, int start) {

        powerSet.add(new ArrayList<>(set));

        for (int i = start; i < nums.length; i++) {

            if (i > start && nums[i] == nums[i - 1])
                continue;

            set.add(nums[i]);
            helper(nums, i + 1);
            set.remove(set.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums, 0);
        return powerSet;
    }
}
// @lc code=end
