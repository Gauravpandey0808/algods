package dependencyinjection;


import java.util.HashMap;
import java.util.Map;

public class MakeOrder {


    void addClasses(String drivingClass , int cost , PaymentData paymentData) {
        Map<String , Integer> currentAddedClasses = paymentData.getTotalCourses();
        currentAddedClasses = new HashMap<>();
        currentAddedClasses.put(drivingClass,cost);
        int totalAmount = paymentData.getTotalAmount();
        paymentData.setTotalAmount(totalAmount + cost);
        paymentData.setTotalCourses(currentAddedClasses);
    }

    int getTotal(PaymentData paymentData) {
        return paymentData.getTotalAmount();

    }




}
