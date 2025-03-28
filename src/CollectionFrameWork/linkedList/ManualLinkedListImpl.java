package CollectionFrameWork.linkedList;

public class ManualLinkedListImpl {

    public static void main(String[] args) {

        ManualLinkedListImpl obj1 = new ManualLinkedListImpl();
        Node rootNode = obj1.createNode(27, null);
        Node previousNode = rootNode;

        int[] data = new int[]{2,3,4,5,6,7,4,20};

        for (int datum : data) {
            previousNode = obj1.createNode(datum, previousNode);
        }
        obj1.iterateLL(rootNode);
    }

    public  Node createNode(int data, Node previousNode) {
        Node currentNode = new Node(data);
        if(previousNode != null) previousNode.next = currentNode;
        return currentNode;
    }

    public void iterateLL(Node rootNode) {
        while(rootNode != null) {
            System.out.print(rootNode.data+" ->" );
            rootNode = rootNode.next;
        }
        System.out.println("null");

    }

}

class Node {
    Integer data;
    Node next;

    Node() {
        this.data = null;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data  = data;
        this.next = next;
    }
}