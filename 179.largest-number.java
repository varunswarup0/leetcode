import java.util.Arrays;

/*
 * @lc app=leetcode id=179 lang=java
 *
 * [179] Largest Number
 */

// @lc code=start
class Solution {
    public String largestNumber(int[] nums) {

        if (nums == null || nums.length == 0)
            return "";

        String[] sNums = new String[nums.length];

        for (int i = 0; i < nums.length; i++)
            sNums[i] = nums[i] + "";

        Arrays.sort(sNums, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (sNums[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder("");

        for (String s : sNums)
            sb.append(s);


        return sb.toString();
    }
}
// @lc code=end
