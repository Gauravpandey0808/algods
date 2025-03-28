package trees;

public class BSTToDoublyLinkedList {

    private DoublyLL root = null;
    private DoublyLL temNode = null;
    public static void main(String[] args) {
        BNode root = new BNode(6);
        root.left = new BNode(2);
        root.right = new BNode(8);
        root.left.left = new BNode(0);
        root.left.right = new BNode(4);
        root.left.right.left = new BNode(3);
        root.left.right.right = new BNode(5);
        root.right.left = new BNode(7);
        root.right.right = new BNode(9);

        BSTToDoublyLinkedList doublyLinkedList = new BSTToDoublyLinkedList();
        DoublyLL ll = doublyLinkedList.convertToDoublyLinkedList(root);
        System.out.print(ll.value + "-> ");

        while(ll != null && ll.right != null) {
            System.out.print(ll.right.value );
            if(ll.right.right != null) System.out.print("-> ");
            ll = ll.right;
        }
        System.out.println("\n");

        while(ll != null) {
            System.out.print(ll.value );
            if(ll.left != null) System.out.print("-> ");
            ll = ll.left;
        }

    }

    public DoublyLL convertToDoublyLinkedList(BNode root) {
        if(root == null) return null;
        convertToDoublyLinkedList(root.left);
        if(this.root == null) {
            this.root = new DoublyLL(root.value);
            temNode = this.root;
        } else {
            temNode.right = new DoublyLL(root.value);
            temNode.right.left = temNode;
            temNode = temNode.right;
        }

        convertToDoublyLinkedList(root.right);
        return this.root;
    }


}

class DoublyLL {
    public DoublyLL(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    int value;
    DoublyLL left, right;


}
