package staticfinalkeyword.assignment;

import java.time.Year;
import java.util.Objects;

public class GenerateRollNo {

    private static String uniqueCode = "Amity_University";

    private static Year year = Year.now();

    private static Integer  counter = 0 ;


    private static GenerateRollNo generateRollNo = null ;

    private GenerateRollNo() {
        System.out.println("hello i have called constructor");
    }

    public static GenerateRollNo generateSingletonObject() {
        if(Objects.isNull(generateRollNo)) {
            generateRollNo = new GenerateRollNo();
        }
        return generateRollNo;
    }

    public String generateRollNo() {
        counter +=1;
        return uniqueCode+"_"+year+"_"+counter;

    }
}
