package CollectionFrameWork;

import java.util.LinkedList;
import java.util.Queue;

public class LineOfBank {

    Queue<Integer> queue = new LinkedList<>();

    void createQueue(int data) {
        queue.add(data);

    }

    void removeData() {
        queue.poll();
    }
    void peekQueue() {
        System.out.println(queue.peek());
    }

    public static void main(String[] args) {
        LineOfBank bankLine = new LineOfBank();
        bankLine.createQueue(1);
        bankLine.createQueue(2);
        bankLine.createQueue(3);
        bankLine.createQueue(4);
        bankLine.createQueue(5);
        bankLine.createQueue(6);
        bankLine.createQueue(7);
        bankLine.createQueue(8);
        bankLine.createQueue(9);
        bankLine.createQueue(10);
        bankLine.createQueue(11);
        bankLine.peekQueue();
        bankLine.removeData();
        bankLine.peekQueue();
        bankLine.removeData();
        bankLine.peekQueue();
        bankLine.removeData();
        bankLine.peekQueue();
        bankLine.removeData();
        bankLine.peekQueue();
        bankLine.removeData();
    }

}
