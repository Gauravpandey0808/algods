package staticfinalkeyword;

// If the method has some static values and some calculations or some static functionality need to be executed then
// we use the static function or the method
public class StaticMethod {

    static String getData() {
        int age = 20 ;
        String name = "Gaurav Pandey";
        String dob = "08/08/1996";

        return "name : "+name+" age : "+age+" dob : "+dob;
    }
}
