package Arrays;

public class RemoveDuplicatesInPlace {

    public static void main(String[] args) {


    }


    public int[] getSortedArray(int[] array) {

        int n = array.length;
        int start = array[0];
        int end = array[n - 1];
        int i = 0;

        while(start <= end) {
            array[i] = start;
            start++;
            i++;
        }

        return array;
    }
}
