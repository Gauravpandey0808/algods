package searializationinjava;

import java.io.Serializable;

public class OfficeData implements Serializable {

    private final String firstName;

    private final String lastName;

    private final String enrollNo;

    private final String experience;

    public OfficeData(String firstName, String lastName, String enrollNo, String experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrollNo = enrollNo;
        this.experience = experience;
    }

    public void printData() {
        System.out.println("F_Name : " + firstName + " " + "lastName : " + lastName + " " + "enrollNo : " + enrollNo + " " + "experience : " + experience);

    }
}
