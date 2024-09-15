package dependencyinjection;

public class UpiPaymentImpl implements PaymentMethods{

    @Override
    public boolean makePayment(int totalAmount) {
        System.out.println("Done payment from Upi and total cost is :"+ totalAmount);
        return true;
    }
}
