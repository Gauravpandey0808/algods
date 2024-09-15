package CollectionFrameWork;

import java.util.*;

public class ListImpl {

    List<Integer> data = new ArrayList<>();

    void addDataToList(int finalData) {
        data.add(finalData);
        data.add(1,finalData);   
        int[] array =new int[10];
        List array1 = Arrays.asList(array);
        array[1] = 1;

        for(int i : array) {
            System.out.println(i);
        }
        String a = "11";
        int b = Integer.parseInt(a);
        float c = Float.parseFloat(a);
        char[]d = a.toCharArray();
        System.out.println("-----------------------------------------------");
        for(char e : d) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ListImpl impl = new ListImpl();
        impl.addDataToList(20);


        char[] helloWorld = new char[10];
        List<char[]> list = Arrays.asList(helloWorld);
        System.out.println(list.listIterator().nextIndex());

    }
}
