package Strings;

import java.util.*;

public class SortString {

    private static Map<String, List<String>> ans;

    public static void main(String[] args) {
        ans = new HashMap<>();
        List<List<String>> finalAns = new ArrayList<>();

        String[] stringArray = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        int n = stringArray.length;

        for (String s : stringArray) {
            getAnagrams(s);
        }
        ans.forEach((key, value)-> {
            finalAns.add(value);
        });

        System.out.println(finalAns);
    }

    public static void getAnagrams(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String updatedChar = Arrays.toString(charArray);
        if(ans.containsKey(updatedChar)) {
            List<String>  tempData = ans.get(updatedChar);
            tempData.add(word);
            ans.put(updatedChar, tempData);
        } else {
            List<String> tempData = new ArrayList<>();
            tempData.add(word);
            ans.put(updatedChar, tempData);
        }
    }


}
