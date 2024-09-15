package CollectionFrameWork;

import java.util.Stack;
public class Stacking {

    Stack<Integer> stack = new Stack<>();

    void pushData(int data) {
        stack.push(data);
    }

    void peekStack() {
        System.out.println(stack.peek());
    }

    void popData() {
        stack.pop();
    }

    public static void main(String[] args) {
        Stacking stacking = new Stacking();
        stacking.pushData(10);
        stacking.pushData(11);
        stacking.pushData(12);
        stacking.pushData(13);
        stacking.pushData(14);
        stacking.pushData(15);
        stacking.pushData(16);
        stacking.pushData(17);
        stacking.pushData(18);
        stacking.pushData(19);
        stacking.peekStack();
        stacking.popData();
        stacking.peekStack();
        stacking.popData();
        stacking.peekStack();

    }
}
