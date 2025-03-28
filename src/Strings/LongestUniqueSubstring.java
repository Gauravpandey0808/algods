package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        System.out.println(getLongestSubstringLength("abcabcbb"));

    }

    public static int getLongestSubstringLength(String word) {
        int n = word.length();
        if(n == 0) return 0;

        Set<Character> data = new HashSet<>();
        int left = 0, max = 0;

        for(int right = 0; right < n; right++) {
            char currentChar = word.charAt(right);
                while(data.contains(currentChar)) {
                    data.remove(word.charAt(left));
                    left++;
                }
            data.add(currentChar);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
