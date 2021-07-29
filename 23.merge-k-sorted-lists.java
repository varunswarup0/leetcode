import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {}
 * ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
 * this.next = next; } }
 */



class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0)
            return null;

        PriorityQueue<ListNode> minHeap =
                new PriorityQueue<>(lists.length, new Comparator<ListNode>() {

                    @Override
                    public int compare(ListNode o1, ListNode o2) {

                        if (o1.val < o2.val)
                            return -1;
                        else if (o1.val == o2.val)
                            return 0;
                        else
                            return 1;
                    }
                });

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (ListNode node : lists)
            if (node != null)
                minHeap.add(node);

        while (!minHeap.isEmpty()) {
            tail.next = minHeap.poll();
            tail = tail.next;

            if (tail.next != null)
                minHeap.add(tail.next);
        }

        return dummy.next;
    }
}
// @lc code=end
