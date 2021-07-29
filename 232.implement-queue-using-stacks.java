import java.util.ArrayDeque;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {
    ArrayDeque<Integer> stack;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack = new ArrayDeque<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.add(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        ArrayDeque<Integer> tempStack = new ArrayDeque<>();
        while (!stack.isEmpty())
            tempStack.push(stack.pop());

        int poppedElement = tempStack.pop();

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());

        return poppedElement;
    }

    /** Get the front element. */
    public int peek() {
        ArrayDeque<Integer> tempStack = new ArrayDeque<>();

        while (!stack.isEmpty())
            tempStack.push(stack.pop());

        int peekElement = tempStack.peek();

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());

        return peekElement;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj = new MyQueue();
 * obj.push(x); int param_2 = obj.pop(); int param_3 = obj.peek(); boolean param_4 = obj.empty();
 */
// @lc code=end
