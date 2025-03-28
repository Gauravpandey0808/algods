package Strings;

public class StringBasics {

    public static void main(String args[]) {
        String s1 = "Gaurav Pandey";
        String s2 = "Gaurav Pandey";
        String s3 = new String("Gaurav Pandey");
        String s4 = "Saurav Pandey";

        System.out.println("Comparision related to if the string is same or not");

        StringBasics obj1 = new StringBasics();
        System.out.println(obj1.compareString(s1,s2));
        System.out.println(obj1.compareString(s1,s3));
        System.out.println(obj1.compareString(s1,s4));

        System.out.println("------------------------------");
        System.out.println("Comparision if the string values are same or not");
        System.out.println(obj1.compareStringValues(s1,s2));
        System.out.println(obj1.compareStringValues(s1,s3));
        System.out.println(obj1.compareStringValues(s1,s4));

        System.out.println("------------------------------");
        System.out.println("Counting the vowels in the string "+ obj1.countVowel(s1));
    }

    public boolean compareString(String s1 , String s2) {
        return s1 == s2;

    }

    public boolean compareStringValues(String s1 , String s2) {
        return s1.equals(s2);
    }

    public int countVowel(String s1) {
        int length = s1.length();
        int count = 0;

        for(int i = 0; i < length; i++) {
            char currentChar = s1.charAt(i);
            if("aeiouAEIOU".indexOf(currentChar) != -1) {
                count +=1;
            }
        }
        return count;
    }
}
