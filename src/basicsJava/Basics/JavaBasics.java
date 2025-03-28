package basicsJava.Basics;

import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Table required upto : ");
        int n = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(j + " * " + i + " = " + (i * j)+"\t");
            }
            System.out.print("\n");
        }
    }
}
