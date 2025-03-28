package streamApi.LamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class LamdaExampleImpl {

    public static void main(String[] args) {
        LamdaExample lamdaExample = String::concat;

        System.out.println(lamdaExample.concatString("Hello", "World"));

        List<String> names = Arrays.asList("Gaurav", "Saurav", "Deepak");

        names.forEach(System.out :: println);


    }
}
