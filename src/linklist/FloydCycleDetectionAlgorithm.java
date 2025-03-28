package linklist;

public class FloydCycleDetectionAlgorithm {
    public static void main(String[] args) {

    }


    public static void detectCycle(LL head) {
        LL slow, fast;
        fast = slow = head;

        while (slow != null && fast != null && slow.next == null && fast.next.next == null) {
            slow = slow.next;
            fast = fast.next.next;


        }


    }
}

class LL {

    Integer value;

    LL next;

    public LL(int value, LL nextNode) {
        this.value = value;
        this.next = nextNode;
    }

    public LL(int value) {
        this.value = value;
        this.next = null;
    }

    public LL() {
        this.value = null;
    }
}
