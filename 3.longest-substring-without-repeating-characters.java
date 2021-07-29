import java.util.HashMap;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int sPos = 0;

        for (int ePos = 0; ePos < s.length(); ePos++) {

            char endCh = s.charAt(ePos);

            if (map.containsKey(endCh))
                sPos = Math.max(sPos, map.get(endCh) + 1);

            map.put(endCh, ePos);
            int currLength = ePos - sPos + 1;
            maxLength = Math.max(maxLength, currLength);
        }

        return maxLength;
    }
}
// @lc code=end
