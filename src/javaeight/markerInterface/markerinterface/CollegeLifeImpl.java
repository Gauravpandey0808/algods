package javaeight.markerInterface.markerinterface;

public class CollegeLifeImpl implements CollegeLife{

    public static void main(String[] args) {
        CollegeLife life = new CollegeLifeImpl();
        if(life instanceof CollegeLife) {
            System.out.println("Hello world");
        } else {
            System.out.println("Jai shree ram");
        }
    }
}
