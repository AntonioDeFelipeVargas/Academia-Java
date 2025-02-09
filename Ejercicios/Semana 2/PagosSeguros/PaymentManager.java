
public class PaymentManager
{
    public void paymentManager(Pay pay)
    {   //No conoce nada
        pay.processPayment();
        System.out.println(pay.getDetails());
    }
}
