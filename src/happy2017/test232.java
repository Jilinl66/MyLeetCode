package happy2017;

import java.util.Stack;

//232. Implement Queue using Stacks
public class test232 {
	Stack<Integer> myqueue;
    /** Initialize your data structure here. 
     * @return */
    public void MyQueue() {
    	myqueue = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> tempStack = new Stack<>();
        while(!myqueue.isEmpty())
        	tempStack.push(myqueue.pop());
        myqueue.push(x);
        while(!tempStack.isEmpty())
        	myqueue.push(tempStack.pop());
   }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return myqueue.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return myqueue.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return myqueue.empty();
    }
}
