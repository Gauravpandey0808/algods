package dependencyinjection;


import java.util.Map;

public class PaymentData {

    int totalAmount;

    Map<String,Integer> totalCourses;

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Map<String, Integer> getTotalCourses() {
        return totalCourses;
    }

    public void setTotalCourses(Map<String, Integer> totalCourses) {
        this.totalCourses = totalCourses;
    }
}


