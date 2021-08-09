/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */

// @lc code=start
class MyLinkedList {

    Node head;
    int size = 0;


    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {

        int currIndex = 0;
        Node curr = head;

        while ()
        {
            if (currIndex == index)
                return curr.val;
        }

        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the
     * new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head.next;
        head.next = temp;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node curr = head;

        while (curr.next != null)
        {
            
        }


        Node temp = new Node(val);
        temp.next = head.next;
        head.next = temp;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the
     * length of linked list, the node will be appended to the end of linked list. If index is
     * greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such: MyLinkedList obj = new
 * MyLinkedList(); int param_1 = obj.get(index); obj.addAtHead(val); obj.addAtTail(val);
 * obj.addAtIndex(index,val); obj.deleteAtIndex(index);
 */
// @lc code=end
