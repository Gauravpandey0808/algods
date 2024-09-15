package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {

    ArrayList<Integer> arrayList = new ArrayList<>();

    void setArrayList(int []data) {
        for (int datum : data) {
            arrayList.add(datum);
        }
    }

    void printData() {
        for (int data : arrayList) {
            System.out.println(data);
        }
    }

    void addData(int i ) {
        arrayList.add(i);
    }

    void iteratingArray() {

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    void deleteData(int indexToBeDeleted) {
        arrayList.remove(indexToBeDeleted);
    }

    void sizeOfArrayList() {
        System.out.println("the size of the array is currently : "+ arrayList.size());
    }

    public static void main(String[] args) {
        LearnArrayList learnArrayList = new LearnArrayList();
        learnArrayList.setArrayList(new int[]{1,2,8,10,5,6,7,8,9,10});
//        learnArrayList.sizeOfArrayList();
//        learnArrayList.deleteData(4);
//        learnArrayList.sizeOfArrayList();
        learnArrayList.iteratingArray();
        learnArrayList.addData(15);
        learnArrayList.iteratingArray();
    }
}
