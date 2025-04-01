package linklist;


public class RotateLinkedListByK {

    public static void main(String[] args) {
//         1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        RotateLinkedListByK obj1 = new RotateLinkedListByK();
        head = obj1.rotateLL(head, 3);

        while(head != null) {
            System.out.print(head.data + " ");
            String print = head.next != null ? "->" : "";
            System.out.print(print);
            head = head.next;
        }


    }

    public ListNode rotateLL(ListNode head, int k) {
        int n = getLinkedListLength(head);
        if(k > n) k %= n;
        int tempPointer = 0;
        ListNode slowPointer = head , fastPointer = head;

        while(tempPointer < k) {
            fastPointer = fastPointer.next;
            tempPointer++;
        }

        while(fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        ListNode tempNode = slowPointer.next;
        slowPointer.next = null;
        fastPointer.next = head;
        head = tempNode;
        return tempNode;
    }

    private int getLinkedListLength(ListNode head) {
        int length = 0;

        while(head != null) {
            head = head.next;
            length++;
        }
        return length;
    }
}

