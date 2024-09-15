package dependencyinjection;

public class PayPalImpl implements   PaymentMethods{



    @Override
    public boolean makePayment(int totalAmount) {
        System.out.println("Making payment from Paypal and the total amount that needs to be done is :" +totalAmount);
        return true;
    }

}
