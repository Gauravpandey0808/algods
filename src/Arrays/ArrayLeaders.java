package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    public static ArrayList<Integer> getArrayLeader(int[] array) {
        int n = array.length;
        int max=array[n-1];
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(max);
        for(int i= n-2 ; i>=0 ; i--) {
            if(array[i] > max) {
                max = array[i];
                arrayList.add(array[i]);
            }
        }

        Collections.reverse(arrayList);
        return arrayList;
    }

    public static void main(String args[]) {

        ArrayList<Integer> data = getArrayLeader(new int[]{11,4,1,2,-4,1});

        for(int num : data) {
            System.out.println(num);
        }


    }
}
