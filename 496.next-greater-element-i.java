import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int num : nums2) {

            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.removeFirst(), num);

            stack.addFirst(num);
        }


        for (int i = 0; i < nums1.length; i++)
            res[i] = map.getOrDefault(nums1[i], -1);

        return res;
    }
}
// @lc code=end
