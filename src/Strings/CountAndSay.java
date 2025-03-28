package Strings;

public class CountAndSay {

    public static void main(String[] args) {

        CountAndSay countAndSay = new CountAndSay();
        int n = 6;
        String recursiveAns = countAndSay.getTheSequenceIterative(n, "1");
        String iterativeAns = "1";
        for(int i = 1; i < n; i++) {
            iterativeAns = countAndSay.getTheSequenceRecursive(i, iterativeAns);
        }

        System.out.println(recursiveAns);
        System.out.println(iterativeAns);

    }

    public String getTheSequenceIterative(int n, String s) {
        int sLength = s.length();
        if(n == 1) {
            return s;
        }

        StringBuilder stringBuilder = new StringBuilder();
        char previousChar = s.charAt(0);
        int counter = 1;

        for(int i = 1; i < sLength; i++) {
            char currentChar = s.charAt(i);
            if(previousChar == currentChar) {
                counter++;
            } else {
                stringBuilder.append(counter).append(previousChar);
                counter = 1;
            }
            previousChar = currentChar;
        }
        stringBuilder.append(counter).append(previousChar);
        return getTheSequenceIterative(n-1, stringBuilder.toString());
    }

    public String getTheSequenceRecursive(int n, String s) {
        int length = s.length();
        char previousChar = s.charAt(0);
        int counter = 1;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 1; i < length; i++) {
            char currentChar = s.charAt(i);

            if(previousChar == currentChar) {
                counter++;
            } else {
                stringBuilder.append(counter).append(previousChar);
                counter = 1;
            }
            previousChar = currentChar;
        }

        stringBuilder.append(counter).append(previousChar);
        return stringBuilder.toString();
    }
}
