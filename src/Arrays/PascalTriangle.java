package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter what should be the length of the triangle :");
        int length = scanner.nextInt();
        ArrayList<ArrayList<Integer>> finalTriangle =createPascalTriangle(length);

        for(int i=0 ; i < length ; i++) {
            for(int j=0 ; j <= i ; j++) {
                System.out.print(finalTriangle.get(i).get(j)+" ");
            }
            System.out.print("\n");
        }
    }

    public static ArrayList<ArrayList<Integer>> createPascalTriangle(int length) {

        ArrayList<ArrayList<Integer>> data = new ArrayList<>();

        for(int i=0 ; i < length ; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0 ; j <= i ; j++) {
                if(j ==0 || i == j) {
                    temp.add(1);
                } else {
                    temp.add(data.get(i-1).get(j) + data.get(i-1).get(j-1));
                }
            }
            data.add(temp);
        }
        return data;
    }
}

