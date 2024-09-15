package CollectionFrameWork;

import java.util.*;
public class PQueue {

    Queue<Integer> queue = new PriorityQueue<>();


//    this method will store data inside the queue
    void createQueue(int number) {
        queue.add(number);
    }


//    this will show which element is the first element in the queue
    void peekNumber() {
        System.out.println(queue.peek());
    }

//    this method is used to remove the data from the queue
    void removeData() {
        queue.remove();
    }

//    this method is used for printing the queue
    void printQueue() {
        System.out.println(queue);
    }

    public static void main(String[] args) {
        PQueue pQueue = new PQueue();
        for(int i = 10 ; i >0 ; i--) {
            pQueue.createQueue(i);
        }
        pQueue.peekNumber();
        pQueue.removeData();
        pQueue.peekNumber();

        pQueue.printQueue();



    }

}
