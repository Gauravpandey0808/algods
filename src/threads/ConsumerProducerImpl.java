package threads;

import java.util.LinkedList;

public class ConsumerProducerImpl {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity;


    ConsumerProducerImpl(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int data) throws InterruptedException {
        while (list.size() == capacity) {
            System.out.println("The buffer is full and the thread will wait");
            wait();
        }

        list.add(data);
        System.out.println("We have added the data to the list and the value of the data is : " + data);
        notifyAll();

    }

    public synchronized void consume() throws InterruptedException {

        while (list.size() == 0) {
            System.out.println("The thread cannot consume as buffer is empty");
            wait();
        }

        int val = list.removeFirst();
        System.out.println("We have consumed the first data and the value of the data is : " + val);
        notifyAll();
    }
}
