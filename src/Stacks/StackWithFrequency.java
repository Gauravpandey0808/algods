package Stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackWithFrequency {

    Map<Integer, Integer> frequencyMap = new HashMap<>();
    Stack<Integer> currentStack = new Stack<>();

    public static void main(String[] args) {

        StackWithFrequency frequency = new StackWithFrequency();
        frequency.push(1);
        frequency.push(2);
        frequency.push(1);
        frequency.push(1);
        frequency.push(5);
        frequency.push(1);
        frequency.push(4);
        frequency.push(5);
        frequency.push(7);
        frequency.push(5);

        System.out.println(frequency.getFrequency(1));
    }

    public void push(int x) {
        if(frequencyMap.containsKey(x)) frequencyMap.put(x, frequencyMap.get(x) + 1);
        else frequencyMap.put(x, 1);
        currentStack.push(x);
    }

    public void pop() {
        int top = currentStack.pop();
        if(frequencyMap.get(top) == 1) frequencyMap.remove(top);
        else frequencyMap.put(top, frequencyMap.get(top) - 1);
    }

    public int getFrequency(int x) {
        return frequencyMap.getOrDefault(x, 0);
    }
}
