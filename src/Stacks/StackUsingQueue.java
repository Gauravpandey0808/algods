package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> mainQueue = new LinkedList<>();
    Queue<Integer> supporterQueue = new LinkedList<>();

    public static void main(String[] args) {
        StackUsingQueue stackImpl = new StackUsingQueue();
        stackImpl.push(1);
        stackImpl.push(2);
        stackImpl.push(3);
        stackImpl.push(4);
        stackImpl.push(5);
        stackImpl.push(6);
        stackImpl.push(7);

        System.out.println(stackImpl.top());

    }

    public int push(int x) {
        while(!mainQueue.isEmpty()) supporterQueue.add(mainQueue.poll());
        mainQueue.add(x);
        while(!supporterQueue.isEmpty()) mainQueue.add(supporterQueue.poll());
        return x;
    }

    public int pop() {
        if(!mainQueue.isEmpty()) return mainQueue.poll();
        else return -1;
    }

    public int top() {
        if(!mainQueue.isEmpty()) return mainQueue.peek();
        else return -1;
    }
}
