package Stacks;

public class MinMaxStack {

    java.util.Stack<StackNode> minMax = new java.util.Stack<>();

    public static void main(String[] args) {

    }

    public void push(int currentData) {
        int minValue, maxValue;

        if(!minMax.isEmpty()) {
            StackNode currentStackData = minMax.peek();
            minValue = Math.min(currentStackData.minValue, currentData);
            maxValue = Math.max(currentStackData.maxValue, currentData);
        } else minValue = maxValue = currentData;

        StackNode stack = new StackNode(currentData, minValue, maxValue);
        minMax.push(stack);
    }
    public int getMax() {
        return minMax.isEmpty() ? -1 : minMax.peek().maxValue;
    }

    public int getMin() {
        return minMax.isEmpty() ? -1 : minMax.peek().minValue;
    }

    public int pop() {
        return minMax.pop().getValue();
    }

    public int peek() {
        return minMax.peek().getValue();
    }
}


class StackNode {

    int value;
    int minValue;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public StackNode(int value, int minValue, int maxValue) {
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    int maxValue;
}
