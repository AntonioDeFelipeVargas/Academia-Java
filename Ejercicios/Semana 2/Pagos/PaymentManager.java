
public class PaymentManager
{
    public void paymentManager(Pay pay)
    {
        pay.processPayment();
        System.out.println(pay.getDetails());
    }
}
