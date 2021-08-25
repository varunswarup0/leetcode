import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {

    List<Integer> list = new ArrayList<>();
    List<List<Integer>> ansList = new ArrayList<>();
    boolean[] used;

    void helper(int[] nums) {

        if (list.size() == nums.length)
            ansList.add(new ArrayList<>(list));

        else {

            for (int i = 0; i < nums.length; i++) {

                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]))
                    continue;

                used[i] = true;
                list.add(nums[i]);
                helper(nums);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        helper(nums);
        return ansList;
    }
}
// @lc code=end
