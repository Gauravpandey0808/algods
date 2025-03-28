package CollectionFrameWork.linkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollectionFrameWork {

    LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        LinkedListCollectionFrameWork obj1 = new LinkedListCollectionFrameWork();
        LinkedList<Integer> linkedList =  obj1.list;
        linkedList.add(20);
        linkedList.add(50);
        linkedList.add(100);
        linkedList.add(15);
        linkedList.add(5);
        linkedList.add(35);

        linkedList.addAll(Arrays.asList(2,10,20,30,50,100));
        linkedList.sort(null);

        Iterator<Integer> iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }




        
    }
}
