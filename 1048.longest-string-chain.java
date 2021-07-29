import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode id=1048 lang=java
 *
 * [1048] Longest String Chain
 */

// @lc code=start
class Solution {
    public int longestStrChain(String[] words) {

        if (words == null || words.length == 0)
            return 0;

        int res = 0;

        Arrays.sort(words, (a, b) -> a.length() - b.length());
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, 1);

            for (int i = 0; i < w.length(); i++) {
                String next = new StringBuilder(w).deleteCharAt(i).toString();
                map.put(w, Math.max(map.get(w), map.getOrDefault(next, 0) + 1));
            }

            res = Math.max(res, map.get(w));
        }

        return res;

    }
}
// @lc code=end
