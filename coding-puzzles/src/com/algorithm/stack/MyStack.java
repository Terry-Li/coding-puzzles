package com.algorithm.stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	
	public MyStack() {}
    
    Queue<Integer> q1 = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        q1.offer(x);
        for (int i=0; i<q1.size()-1; i++) {
            q1.offer(q1.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q1.poll();
    }

    // Get the top element.
    public int top() {
        return q1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}
