import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : p.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);


        int begin = 0;
        int end = 0;

        int counter = map.size();

        while (end < s.length()) {

            char endChar = s.charAt(end);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0)
                    counter--;
            }


            end++;

            while (counter == 0) {

                char beginChar = s.charAt(begin);
                if (map.containsKey(beginChar)) {
                    map.put(beginChar, map.get(beginChar) + 1);
                    if (map.get(beginChar) > 0)
                        counter++;
                }

                if (end - begin == p.length())
                    res.add(begin);

                begin++;
            }
        }

        return res;
    }
}
// @lc code=end
