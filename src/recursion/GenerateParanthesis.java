package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParanthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many paranthesis combination \n you need to generate ");
        int n =scanner.nextInt();

        List<String> arrayList = new ArrayList<>();
        int open = 0;
        int close = 0;

        solution(arrayList,"",n, open, close);

        for(String answer : arrayList) {
            System.out.println(answer);
        }
    }

    public static void solution(List<String> arrayList, String paranthesis, int n, int open, int close) {
        if(open == close && open + close == 2 * n) arrayList.add(paranthesis);

        if(close > open) return;

        if(open < n) solution(arrayList, paranthesis + "(", n, open + 1, close);

        if(close < open) solution(arrayList, paranthesis + ")", n, open, close + 1);
    }
}
