package Stacks;

import java.util.ArrayList;
import java.util.List;

public class StackImpl {
    final int maxData;
    List<Integer> stack;

    public StackImpl(int maxData) {
        this.stack = new ArrayList<>();
        this.maxData = maxData;
    }

    public static void main(String[] args) {
        StackImpl stack1 = new StackImpl(10);

        for(int i = 0; i <= 10; i++) {
            stack1.push(i);
        }
        System.out.println("Hello world");

    }

    public void push(int data) {
        if (!isFull()) {
            stack.add(data);
        } else System.out.println("The stack is full .Please wait till some work is done");
    }

    public int pop() {
        if (!isStackEmpty()) {
            return stack.remove(stack.size() - 1);
        } else System.out.println("The stack is empty . You cannot pop a value");
        return -1;
    }

    public int peek() {
        if (!isStackEmpty()) {
            return stack.get(stack.size() - 1);
        } else return Integer.MIN_VALUE;
    }

    public boolean isStackEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() == maxData ;
    }
}
