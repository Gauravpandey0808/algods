package Strings;

import java.util.Arrays;

public class LongestCommonSubString {

    public static void main(String[] args) {
        String[] stringArray = new String[]{ "flowers", "flow", "flowing", "flowering"};

        LongestCommonSubString subString = new LongestCommonSubString();
        String commonSubString = subString.getLongestCommonSubString(stringArray);

        System.out.println(commonSubString);
    }

    private String getLongestCommonSubString(String[] stringArray) {

        StringBuilder st = new StringBuilder();

        Arrays.sort(stringArray);

        String first = stringArray[0];
        String last = stringArray[stringArray.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return st.toString();
            }

            st.append(first.charAt(i));
        }
        return st.toString();
    }
}
