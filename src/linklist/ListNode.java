package linklist;

public class ListNode {
    int data;
    ListNode next;
    ListNode() {
        data = Integer.MIN_VALUE;
        next = null;
    }

    ListNode(int data) {
        this.data = data;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
