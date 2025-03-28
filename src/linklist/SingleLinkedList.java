package linklist;

public class SingleLinkedList {
    public ListNode createLinkedList(int[] values) {
        int valuesLength = values.length;
        if(0 == valuesLength) {
            return new ListNode();
        }
        ListNode head = new ListNode(values[0]);
        ListNode previousNode = head;

        for(int i = 1; i < valuesLength; i++) {
            ListNode newNode = new ListNode(values[i]);
            previousNode.next = newNode;
            previousNode = newNode;
        }
        return head;
    }

    public void traverseList(ListNode head) {
        if(head == null) {
            System.out.println("Linked list is null");
            return;
        } else if(head.next == null) {
            System.out.println("There is only one value and the value is " + head.data);
            return;
        }

        ListNode temp = head;

        while(temp != null) {
            System.out.print(temp.data);
            if(temp.next != null) System.out.print("->");
            temp = temp.next;
        }
    }
}
