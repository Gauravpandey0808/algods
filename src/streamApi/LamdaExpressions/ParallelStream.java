package streamApi.LamdaExpressions;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(1, x -> x+1).limit(20000).toList();

        long start = System.currentTimeMillis();
        List<Integer> factorialList =  numbers.stream().map(ParallelStream::getFactorial).toList();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long parallelStart = System.currentTimeMillis();
        List<Integer> parallelFactorialList = numbers.parallelStream().map(ParallelStream::getFactorial).toList();
        long parallelEnd = System.currentTimeMillis();
        System.out.println(parallelEnd - parallelStart);

    }

    public static int getFactorial(int n) {
        int number = 1;
        for(int i = 2; i <= n ; i++) {
            number *= i;
        }

        return number;
    }
}
