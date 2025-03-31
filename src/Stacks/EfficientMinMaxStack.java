package Stacks;

import java.util.Stack;

public class EfficientMinMaxStack {

    Stack<StackNode> stack = new Stack<>();
    public static void main(String[] args) {
        EfficientMinMaxStack minMaxStack = new EfficientMinMaxStack();
        minMaxStack.push(2);
        minMaxStack.push(1);
        System.out.println(minMaxStack.top());
        System.out.println(minMaxStack.getMin());
        System.out.println(minMaxStack.getMax());
        minMaxStack.pop();
    }

    public void push(int topValue) {
        if (stack.isEmpty()) {
            stack.push(new StackNode(topValue, topValue, topValue));
        } else {
            stack.push(new StackNode(topValue, Math.max(topValue, stack.peek().maxValue), Math.min(topValue, stack.peek().minValue)));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().topValue;
    }

    public int getMax() {
        return stack.peek().maxValue;
    }

    public int getMin() {
        return stack.peek().minValue;
    }

    private static class StackNode {
        int maxValue;
        int topValue;
        int minValue;
        StackNode(int topValue, int maxValue, int minValue) {
            this.maxValue = maxValue;
            this.topValue = topValue;
            this.minValue = minValue;
        }

    }
}
