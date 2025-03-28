package sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many data you want in your array");
        int counter =scanner.nextInt();
        int[] data = new int[counter];

        for(int i = 1 ; i <= counter ; i++) {
            System.out.println("Enter the" + i +"st number");
            data[i-1] = scanner.nextInt();
        }

        for(int i = 1 ; i < data.length ; i++) {
            int j = i;
            while(j > 0 && data[j] < data[j-1]) {
                int temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
                j -= 1;
            }
        }
        System.out.println("------------------------------------------------------------------");
        for(int number : data) {
            System.out.println(number);
        }
    }
}
