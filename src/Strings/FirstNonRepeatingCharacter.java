package Strings;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        getFirstNonRepeatingCharacter("racecarxyz");

    }

    public static void getFirstNonRepeatingCharacter(String word) {
        int n = word.length();
        int[] array = new int[26];

        for(int i = 0; i < n; i++) {
            int currentChar = word.charAt(i);
            array[currentChar - 97] += 1;
        }

        for(int i = 0; i < n; i++) {
            int currentChar = word.charAt(i);
            if(array[currentChar - 97] == 1) {
                System.out.println("First non repeating char is : " + word.charAt(i));
                return;
            }
        }
        System.out.println("\0");
    }
}
