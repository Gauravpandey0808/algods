package linklist;

public class LinkedListMain {

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        ListNode head = linkedList.createLinkedList(new int[]{});
        linkedList.traverseList(head);
    }
}
