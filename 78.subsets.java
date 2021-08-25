import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {

    List<Integer> set = new ArrayList<>();
    List<List<Integer>> powerSet = new ArrayList<>();

    void helper(int[] nums, int start) {

        powerSet.add(new ArrayList<>(set));

        for (int i = start; i < nums.length; i++) {
            set.add(nums[i]);
            helper(nums, i + 1);
            set.remove(set.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {

        helper(nums, 0);
        return powerSet;
    }
}
// @lc code=end
