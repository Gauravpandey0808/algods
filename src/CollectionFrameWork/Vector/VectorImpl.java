package CollectionFrameWork.Vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorImpl {

    ArrayList<Integer> list1 = new ArrayList<>();
    Vector<Integer> list2 = new Vector<>();

    public static void main(String[] args) throws InterruptedException {
        VectorImpl obj1 = new VectorImpl();

        Thread thread1 = new Thread(obj1::addDataArrayList1);
        Thread thread2 = new Thread(obj1::addDataArrayList2);
        Thread thread3 = new Thread(obj1::addDataVector1);
        Thread thread4 = new Thread(obj1::addDataVector2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        ArrayList<Integer> list1 = obj1.list1;
        Vector<Integer> list2 = obj1.list2;

        System.out.println(list1.size());
        System.out.println(list2.size());
    }

    public void addDataArrayList1() {
        for (int i = 0; i < 1000; i++) {
            list1.add(i);
        }
    }

    public void addDataArrayList2() {
        for (int i = 0; i < 1000; i++) {
            list1.add(i);
        }
    }



    public void addDataVector1() {
        for (int i = 0; i < 1000; i++) {
            list2.add(i);
        }
    }

    public void addDataVector2() {
        for (int i = 0; i < 1000; i++) {
            list2.add(i);
        }

    }
}
