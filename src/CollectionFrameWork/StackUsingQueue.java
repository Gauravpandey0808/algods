package CollectionFrameWork;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1 ;
    Queue<Integer> q2 ;


    public void createStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();

    }

    private void push(int x) {
        while(!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while(!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    private int pop() {
        return q1.poll();
    }

    private void top() {
        System.out.println(q1.peek());
    }

    private boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main (String[] args) {
        StackUsingQueue queue = new StackUsingQueue();
        queue.createStack();
        queue.push(3);
        queue.push(20);
        queue.push(30);
        queue.pop();
        queue.pop();
        queue.top();

    }

}
