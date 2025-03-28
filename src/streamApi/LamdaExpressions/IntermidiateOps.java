package streamApi.LamdaExpressions;

import java.util.List;


public class IntermidiateOps {

    public static void main(String[] args) {
        List<String> list = List.of("Gaurav",
                "Saurav",
                "Sagar",
                "Ravi",
                "Bhupesh",
                "Deepak",
                "Sachin",
                "Alok",
                "Arpit");
        List<String> ans = list.stream()
                .map(String::toUpperCase)
                .filter(x -> (x.startsWith("G") || x.startsWith("S")) && (x.endsWith("R") || x.endsWith("V")))
                .toList();
//        ans.forEach(System.out::println);

        List<String> arrayList = list.stream().map(String::toUpperCase).toList();
        arrayList.forEach(System.out::println);
    }
}
