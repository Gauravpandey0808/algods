package Strings;

public class ReverseString {

    public static void main(String[] args) {

        String s = "Hello my name is Gaurav Pandey .I have done my graduation";

        String[] sArray = s.trim().split("\\s+");

        int length = sArray.length;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = length - 1; i >=0; i--) {
            stringBuilder.append(sArray[i]);
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder);
    }
}
