package streamApi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Groupingby {
    public static void main(String[] args) {
        String name = "Shsssashank".toLowerCase();
        Map<Character, Long> ans1 = name
                .chars().filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .collect(groupingBy(
                c -> c, TreeMap::new, collectingAndThen(
                        counting(), Long::valueOf)));

        TreeMap<Character, Integer> ans2 = getCharCount(name);

        int[] array = new int[]{1,11,13,15,22,24,18,91,44,51,101};

        int[] ans = Arrays.stream(array)
                .mapToObj(Integer::toString)
                .filter(c -> c.startsWith("1"))
                .mapToInt(Integer::parseInt).toArray();

        for(int a : ans) {
            System.out.println(a);
        }

        Map<Character, Long> ans3 = name.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())  // Value ke basis pe sort
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println(ans3);

    }

    public static TreeMap<Character, Integer> getCharCount(String name) {
        int n = name.length();
        TreeMap<Character, Integer> ans = new TreeMap<>();

        for(int i = 0; i < n; i++) {
            char currentChar = name.charAt(i);
            if(ans.containsKey(currentChar)) {
                ans.put(currentChar ,ans.get(currentChar) + 1);
            } else {
                ans.put(currentChar, 1);
            }
        }
        return ans;
    }
}
