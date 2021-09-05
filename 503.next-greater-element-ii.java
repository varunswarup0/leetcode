import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode id=503 lang=java
 *
 * [503] Next Greater Element II
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int[] res = new int[nums.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.fill(res, -1);

        int n = nums.length;

        for (int i = 0; i < n * 2; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n])
                res[stack.removeFirst()] = nums[i % n];

            stack.addFirst(i % n);
        }

        return res;
    }
}
// @lc code=end
