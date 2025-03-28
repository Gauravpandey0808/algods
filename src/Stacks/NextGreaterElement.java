package Stacks;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 4};

        NextGreaterElement obj1 = new NextGreaterElement();
        int[] ans = obj1.solution(arr);

        for (int i : ans) {
            System.out.println(i);
        }

    }


    public int[] solution(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0 ; i--) {
            int currentData = arr[i];

            while (!s.isEmpty() && s.peek() <= currentData) {
                s.pop();
            }
            if (s.isEmpty()) ans[i] = -1;
            else ans[i] = s.peek();

            s.push(currentData);
        }
        return ans;
    }
}
