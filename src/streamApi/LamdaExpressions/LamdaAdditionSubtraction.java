package streamApi.LamdaExpressions;

import java.util.function.Function;

public class LamdaAdditionSubtraction {

    public static void main(String[] args) {
        Solution solution = Integer :: sum;

        Solution solution1 = (a, b) -> a * b;

        System.out.println(solution.getSolution(2, 4));
        System.out.println(solution1.getSolution(2, 5));

        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;

        int y = doubleIt.andThen(tripleIt).apply(20);
        System.out.println(y);
    }



}


interface Solution {
    int getSolution(int a, int b);
}
