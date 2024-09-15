package CollectionFrameWork;

public class LLAnswers {

    private static LinkedList createNode(int x  ) {
        LinkedList linkList = new LinkedList(x);
        return linkList;
    }

    public LinkedList createLL(){
        LinkedList startingCycle = null;
        LinkedList head = null;
        LinkedList currentNode = null;
        for(int i =1 ; i <=20 ; i=2* i ) {
            LinkedList linkedList =createNode(i);
            if(i==1) {
                head = linkedList;
            } else if(i ==4) {
                startingCycle = linkedList;
            }else if (i ==20) {
                linkedList.next = startingCycle;
            } else {
               currentNode.next = linkedList;
            }
            currentNode = linkedList;
        }

        return head;
    }

    public void printLinkedList(LinkedList header) {
        System.out.println(header);

    }

    public static void main(String[] args) {
        LLAnswers llAnswers = new LLAnswers();
        LinkedList header = llAnswers.createLL();
        llAnswers.printLinkedList(header);
    }
}
