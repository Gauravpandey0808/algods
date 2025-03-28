package staticfinalkeyword;

public class MainClass {

    public static void main(String[] args) {
//    Created two object of class named StaticVariable which contains static variable
        StaticVariables staticVariables = new StaticVariables();
        StaticVariables staticVariables1 = new StaticVariables();
//    Changed the name of the static variable from the first object
        StaticVariables.name= "Vikram";
//     Accessing the variable via different object from which value was changed as static variable shares space
//     if changed from the first object then it will be changed for all the objects
//        It will print name as  Vikram
        System.out.println(staticVariables1.name);
        StaticVariables.finalName = "Batra";
        System.out.println(staticVariables.finalName);

//  ----------------------------------------------------------------------------------------------
//        For static method
        String information = StaticMethod.getData();
        System.out.println(information);

//  ---------------------------------------------------------------------------------------------
//      Static block
        StaticBlock block = new StaticBlock();
        System.out.println(block);


    }
}
