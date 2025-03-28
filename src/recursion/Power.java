package recursion;

import java.io.Serializable;

public class Power implements Serializable {

    public static void main(String[] args) {

        int answer = solution(2, 10);
        System.out.println(answer);
    }

    public static int solution(int x, int n) {
        if(n < 0) {
            x = 1 / x;
            n = Math.abs(n);
        }

        if(n == 0) return 1;
        if(n == 1) return x;

        return solution(x, n-1) * x;
    }
}
