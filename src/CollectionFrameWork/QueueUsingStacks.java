package CollectionFrameWork;

import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int data) {
        while(!s1.isEmpty()) {
          s2.push(s1.pop());
        }
        s1.push(data);

        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();
    }

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public int peek() {
        return s1.peek();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.push(22);
        queue.push(33);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
    }
}
