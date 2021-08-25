/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start
/**
 */
// * Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class Solution {

    public int length(ListNode head) {
        int length = 0;

        while (head.next != null) {
            head = head.next;
            length++;
        }

        return length;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode zero = dummy;
        ListNode one;
        ListNode two;
        int length = length(zero);

        while (length >= k) {

            one = zero.next;
            two = zero.next.next;

            for (int i = 1; i < k; i++) {
                one.next = two.next;
                two.next = zero.next;
                zero.next = two;
                two = one.next;
            }

            zero = one;
            length -= k;
        }

        return dummy.next;
    }
}
// @lc code=end
