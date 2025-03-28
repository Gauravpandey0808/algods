package Arrays;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] data = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedMatrix = rotateMatrix(data);
        System.out.println("[");
        for(int i=0 ; i < rotatedMatrix.length ; i++) {
            System.out.print("[");
            for(int j=0 ; j < rotatedMatrix[i].length ; j++) {
                System.out.print(rotatedMatrix[i][j]);
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    public static int[][] rotateMatrix(int[][] arr) {
        int n = arr.length;
        for(int i=0 ; i < n ; i++) {
            for(int j=0 ; j <i ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0 ; i < n ;i++) {
            for(int j=0 ; j < n/2 ; j++) {
                int k = n -(j+1);
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
            }
        }
        return arr;
    }
}
