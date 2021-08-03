/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {


    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode zeroth = dummy;
        ListNode first = head;

        while (first != null && first.next != null) {

            ListNode second = first.next;
            ListNode third = first.next.next;

            zeroth.next = second;
            first.next = third;
            second.next = first;

            zeroth = first;
            first = third;
        }

        return dummy.next;
    }
}
// @lc code=end
