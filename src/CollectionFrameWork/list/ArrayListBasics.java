package CollectionFrameWork.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {

    ArrayList<Integer> arrayList = new ArrayList<>();
    List<String> stringList = new ArrayList<>();


    public static void main(String[] args) {

        ArrayListBasics obj1 = new ArrayListBasics();
        obj1.addData(20, "Gaurav");
        obj1.addData(10, "Saurav");
        obj1.addData(12, "Sanjay");
        obj1.addData(15, "Raghav");
        obj1.addData(22, "Shyam");
        obj1.addData(25, "Raghavendra");
        obj1.addData(30, "Dileep singh");
        obj1.addData(2, "Deepshika Singh");
        obj1.sorting();



    }
    public void addData(Integer data, String data1) {
        arrayList.add(data);
        stringList.add(data1);
    }
    public void iterate(ArrayList<Integer> list) {
        for(Integer data : list) {
            System.out.println(data);
        }
    }
    public void getIthData(int i) {
        if(arrayList.size() > i) {
            System.out.print(arrayList.get(i));
        } else System.out.println("The size of the list is smaller than data");
    }

    public void setIthData(int i, int data) {
        if(i < arrayList.size()) {
            arrayList.set(i, data);
        }
    }

    public void sorting() {
        arrayList.sort((a, b) -> b - a);

        for(int i : arrayList) {
            System.out.println(i);
        }

        stringList.sort((a,b)-> b.length() - a.length());

        for(String i : stringList) {
            System.out.println(i);
        }

    }
}
