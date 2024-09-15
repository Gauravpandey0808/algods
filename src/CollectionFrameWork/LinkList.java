package CollectionFrameWork;




import java.sql.Array;
import java.util.LinkedList;

public class LinkList {

    LinkedList<String> list = new LinkedList<String>();


    void printLinkedList() {
        for (String i : list)
            System.out.print(i + "->");
        System.out.println("null");
    }

    void insertFirstElementInLinkedList(String data) {
        list.addFirst(data);
    }

    void printFirstElement() {
        System.out.println(list.getFirst());
    }

    void insertElementAtLast(String data) {
        list.addLast(data);
    }

    void printLastElement() {
        System.out.println(list.getLast());
    }

    void getSizeOfLinkedList() {
        System.out.println(list.size());
    }

    public static void main (String[] args) {
        LinkList linkList = new LinkList();
        String[] array = new String[]{"I","am","here","only"};
        for(String data : array) {
            linkList.insertElementAtLast(data);
        }

        linkList.printLinkedList();
        linkList.getSizeOfLinkedList();
        
    }
}
