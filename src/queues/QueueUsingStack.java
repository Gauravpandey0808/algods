package queues;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> supporterStack = new Stack<>();

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }

    public void enqueue(int x) {
        while(!mainStack.isEmpty()) supporterStack.push(mainStack.pop());

        mainStack.push(x);
        while(!supporterStack.isEmpty()) mainStack.push(supporterStack.pop());
    }

    public int dequeue() {
        return mainStack.pop();
    }

    public int peek() {
        return mainStack.peek();

    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
}
