package Strings;

import java.util.Scanner;

public class MinBracketReversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bracket you want to test with : ");

        String brackets = sc.nextLine();
        int bracketsLength = brackets.length();

        if(bracketsLength % 2 != 0) {
            System.out.println(-1);
            return;
        }

        int open = 0, close = 0;

        for(int i = 0; i < bracketsLength; i++) {
            char currentBracket = brackets.charAt(i);

            if(currentBracket == '(') {
                open++;
            } else {
                if(open > 0) open--;
                else close++;
            }
        }
        int ans = (open / 2) + (open % 2) + (close / 2) + (close % 2);
        System.out.println(ans);
    }
}
