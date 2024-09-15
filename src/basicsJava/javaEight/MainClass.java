package basicsJava.javaEight;

public class MainClass {

    public static void main(String[] args){

//        Sum of two numbers
        LamdaExpression addition = Integer::max;
        System.out.print(addition.addingNumber(2,5 ));
    }
}
