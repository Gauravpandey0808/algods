package Strings;

public class LongestSubStringPalindrome {

    public static void main(String[] args) {

    }

    public static String getLongestSubStringPalindrome(String word) {
        int n = word.length();
        int left, right;
        StringBuilder longestString = new StringBuilder();
        StringBuilder currentString = new StringBuilder();

        for(int i = 0; i < n; i++) {
            left = i - 1;
            right = i + 1;
            currentString.setLength(0);
            currentString.append(word.charAt(i));

            while(left >= 0 && right < n) {
                if(word.charAt(left) == word.charAt(right)) {
                    currentString.append(word.charAt(left));
                    left--;
                    right++;
                } else {
                    if(longestString.length() < currentString.length()) {
                        longestString = currentString;
                        break;
                    }
                }
            }
        }

        return longestString.toString();
    }
}
