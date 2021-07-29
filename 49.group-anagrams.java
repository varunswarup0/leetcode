import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] alphabetArr = new char[26];
            for (char ch : str.toCharArray())
                alphabetArr[ch - 'a']++;
            String key = String.valueOf(alphabetArr);

            map.putIfAbsent(key, new ArrayList<>());
            ArrayList<String> arrList = map.get(key);
            arrList.add(str);
            map.put(key, arrList);
        }

        List<List<String>> res = new ArrayList<>();

        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet())
            res.add(entry.getValue());


        return res;
    }
}
// @lc code=end
