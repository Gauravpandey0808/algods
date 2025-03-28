package Arrays;

public class DutchNationalFlag {

    public static void main(String args[]) {

        int[] arr = new int[]{0,1,2,1,1,0,2,2,1,0,1,0,0,0,1,2};
        sortArray(arr);

        for(int data : arr) {
            System.out.print(data +" ,");
        }
    }

    public static int[] sortArray(int[] arr) {
        int l = 0;
        int m = 0;
        int h = arr.length-1;

        while(h>=m) {
            if(arr[m] == 0) {
                arr[m] = arr[l];
                arr[l] = 0;
                m++;
                l++;
            } else if (arr[m] == 1) {
                m++;
            } else {
                arr[m] = arr[h];
                arr[h] = 2;
                h--;
            }
        }
        return arr;
    }

}
