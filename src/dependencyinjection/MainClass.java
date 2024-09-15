package dependencyinjection;

public class MainClass {

    public static void main(String[] args) {
        PaymentData paymentData = new PaymentData();
        MakeOrder makeOrder = new MakeOrder();
        makeOrder.addClasses("traffic Rules Classes" , 1000 , paymentData );
        makeOrder.addClasses("Gear Classes" , 2500 , paymentData);
        PaymentMethods paymentMethods = new PayPalImpl();
        boolean isPaymentDone =  paymentMethods.makePayment(paymentData.getTotalAmount());
        if(isPaymentDone) {
            System.out.println(paymentData.getTotalCourses());
        }



    }
}
