import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Boolean> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int val : nums1)
            map.put(val, true);

        for (int val : nums2) {
            if (Boolean.TRUE.equals(map.get(val))) {
                res.add(val);
                map.put(val, false);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
// @lc code=end
