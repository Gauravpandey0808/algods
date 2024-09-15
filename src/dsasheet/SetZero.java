package dsasheet;

public class SetZero {

    private static int[][] createArray(int rowSize , int columnSize){
        int[][] array = new int[rowSize][columnSize];
        return array;
    }

    private int[][] insertData(int rowNo , int sizeOfColumn , int[] data , int[][] array) {
        for(int i = 0 ; i < sizeOfColumn ; i++) {
            array[rowNo][i] = data[i];
        }
        return array;
    }

    private void printArray(int[][] array) {
        for(int i = 0 ; i < array.length ; i++) {
            System.out.print("[");
            for(int j=0; j<array[0].length ; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        int[][] array = createArray(4,3);
        SetZero setZero = new SetZero();
        int[] data = new int[3];
        data[0]=1;
        data[1]=3;
        data[2]=5;
        array = setZero.insertData(0,3 ,data, array );
        setZero.printArray(array);
    }
}
