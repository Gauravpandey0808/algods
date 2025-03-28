package queues;

import java.util.*;

public class QueueImpl {

    List<Integer> queue;

    final int maxLength;

    public static void main(String[] args) {
        QueueImpl queue1 = new QueueImpl(10);

        for(int i = 0; i <= 8; i++) {
            queue1.enqueue(i);
        }
        boolean isFull = queue1.isFull();
        System.out.println(isFull);
        

    }

    public int peek() {
        if(!isEmpty()) {
            return queue.get(queue.size() - 1);
        } else return Integer.MIN_VALUE;

    }

    public boolean isEmpty() {
        return 0 == queue.size();

    }

    public boolean isFull() {
        return maxLength == queue.size();
    }

    public boolean enqueue(int data) {
        if(!isFull()) return queue.add(data);
        return false;
    }

    public int dequeue(int data) {
        if(isEmpty()) return queue.remove(0);
        else return Integer.MIN_VALUE;
    }

    private QueueImpl(int n) {
        this.maxLength = n;
        this.queue = new ArrayList<>();
    }
}
