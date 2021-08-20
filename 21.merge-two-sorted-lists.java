/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }

            l3 = l3.next;
        }

        while (l1 != null) {
            l3.next = l1;
            l1 = l1.next;
            l3 = l3.next;
        }


        while (l2 != null) {
            l3.next = l2;
            l2 = l2.next;
            l3 = l3.next;
        }

        return dummy.next;
    }
}
// @lc code=end
