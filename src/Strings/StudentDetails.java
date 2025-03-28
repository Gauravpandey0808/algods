package Strings;

public class StudentDetails {

    String name;

    int rollNo;

    String standard;

    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    StudentDetails(String name, int rollNo, String standard, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.standard = standard;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", standard='" + standard + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
