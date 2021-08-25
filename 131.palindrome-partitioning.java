import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start
class Solution {

    boolean isPalindrome(String s, int low, int high) {
        while (low < high)
            if (s.charAt(low++) != s.charAt(high--))
                return false;

        return true;
    }

    List<String> list = new ArrayList<>();
    List<List<String>> ansList = new ArrayList<>();

    void helper(String s, int start) {
        if (start == s.length())
            ansList.add(new ArrayList<>(list));

        for (int i = start; i < s.length(); i++) {

            if (isPalindrome(s, start, i)) {
                list.add(s.substring(start, i + 1));
                helper(s, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        helper(s, 0);
        return ansList;
    }
}
// @lc code=end
