import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {


        List<Integer> res = new ArrayList<>();

        int count1 = 0;
        int count2 = 0;
        int element1 = nums[0];
        int element2 = nums[0];

        for (int val : nums) {
            if (element1 == val) {
                count1++;
            } else if (element2 == val) {
                count2++;
            } else if (count1 == 0) {
                count1++;
                element1 = val;
            } else if (count2 == 0) {
                count2++;
                element2 = val;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int val : nums) {
            if (element1 == val)
                count1++;
            else if (element2 == val)
                count2++;
        }

        if (count1 > (nums.length) / 3)
            res.add(element1);
        if (count2 > (nums.length) / 3)
            res.add(element2);


        return res;
    }
}
// @lc code=end
