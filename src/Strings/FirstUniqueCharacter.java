package Strings;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        FirstUniqueCharacter obj1 = new FirstUniqueCharacter();
        System.out.println(obj1.getFirstUniqueCharacterIndex( "leetcode"));
        System.out.println(obj1.getFirstUniqueCharacterIndex( "loveleetcode"));
        System.out.println(obj1.getFirstUniqueCharacterIndex( "aabb"));
        System.out.println(obj1.getFirstUniqueCharacterIndex( "system"));

    }

    public int getFirstUniqueCharacterIndex(String word) {
        char[] wordArray = word.toCharArray();
        int n = wordArray.length;

        int[] smallCharData = new int[26];

        for(char c : wordArray) {
            smallCharData[c - 'a']++;
        }

        for(int i = 0; i < n; i++) {
         if(smallCharData[wordArray[i] - 97] == 1) return i;
        }
        return -1;
    }
}
