package linklist;

public class DoublyLinkedList {

    DoublyLinkedList left;
    DoublyLinkedList right;
    int val;

    public DoublyLinkedList(int val) {
        this.val = val;
    }

    public DoublyLinkedList(DoublyLinkedList left, DoublyLinkedList right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    DoublyLinkedList() {
        this.left = null;
        this.right = null;
        this.val = 0;
    }

}
