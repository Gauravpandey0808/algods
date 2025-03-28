package Generics;

public class PublicDataGeneric <T extends Number,V extends Number>{

    public void getData(T data, V data2) {

        System.out.println("The addition of no is " + (data.doubleValue() + data2.doubleValue()));
        
    }

    public static void main(String[] args) {
        PublicDataGeneric<Integer,Integer> obj1 = new PublicDataGeneric<>();
        obj1.getData(3, 4);



    }
}
