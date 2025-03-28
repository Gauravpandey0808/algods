package Strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringSet {
    public static void main(String[] args) {

        LongestSubstringSet obj1 = new LongestSubstringSet();
        System.out.println((obj1.getLongestSubStringLength("abba")));
    }

    public int getLongestSubStringLength(String word) {
        char[] charArray = word.toCharArray();
        int n = charArray.length, left = 0, maxLength = 0;
        Map<Character, Integer> charIndex = new HashMap<>();

        for(int right = 0; right < n; right++) {
            if(charIndex.containsKey(charArray[right])) {
                left = Math.max(left, charIndex.get(charArray[right]) + 1);
            }
            charIndex.put(charArray[right], right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}