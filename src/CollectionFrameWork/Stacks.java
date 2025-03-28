package CollectionFrameWork;

import java.util.Stack;

public class Stacks {
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {


    }

    public void insertData() {
        for(int i = 0; i < 1000; i++) {
            stack.push(i);
        }
    }

    public int pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

}
