import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1171 lang=java
 *
 * [1171] Remove Zero Sum Consecutive Nodes from Linked List
 */

// @lc code=start

// * Definition for singly-linked list.
// public class ListNode {
// int val;
// ListNode next;

// ListNode() {}

// ListNode(int val) {
// this.val = val;
// }

// ListNode(int val, ListNode next) {
// this.val = val;
// this.next = next;
// }
// }


class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {

        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode dummyHead = new ListNode(0);
        ListNode currNode = dummyHead;
        dummyHead.next = head;

        int prefixSum = 0;

        while (currNode != null) {

            prefixSum += currNode.val;

            if (map.containsKey(prefixSum)) {

                currNode = map.get(prefixSum).next;

                for (int p = prefixSum + currNode.val; p != prefixSum; p += currNode.val) {
                    map.remove(p);
                    currNode = currNode.next;
                }

                map.get(prefixSum).next = currNode.next;

            } else {
                map.put(prefixSum, currNode);
            }


            currNode = currNode.next;
        }

        return dummyHead.next;
    }
}
// @lc code=end
