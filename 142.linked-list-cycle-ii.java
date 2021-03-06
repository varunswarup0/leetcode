/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val
 * = x; next = null; } }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode start = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                while (slow != start) {
                    slow = slow.next;
                    start = start.next;
                }

                return start;
            }

        }

        return null;
    }
}
// @lc code=end
