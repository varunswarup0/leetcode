import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> powerSet = new ArrayList<>();

        for (int i = 0; i < (1 << nums.length); i++) {

            List<Integer> set = new ArrayList<>();

            for (int j = 0; j < nums.length; j++)

                // checking if j-th bit is set in i
                if (((i >> j) & 1) != 0)
                    set.add(nums[j]);

            powerSet.add(new ArrayList<>(set));
        }
        return powerSet;
    }
}
// @lc code=end
