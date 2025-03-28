package Stacks;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {
        MinStack minStack1 = new MinStack();
        minStack1.push(12);
        minStack1.push(2);
        minStack1.push(-15);
        minStack1.push(15);
        System.out.println(minStack1.top());
        System.out.println(minStack1.min());
    }

    public void push(int data) {
        stack.push(data);

        if (minStack.isEmpty() || minStack.peek() > data) minStack.push(data);
        else minStack.push(minStack.peek());
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public int top() {
        if (!stack.isEmpty()) return stack.peek();
        return -1;
    }

    public int min() {
        if (!minStack.isEmpty()) return minStack.peek();
        return -1;
    }


}
