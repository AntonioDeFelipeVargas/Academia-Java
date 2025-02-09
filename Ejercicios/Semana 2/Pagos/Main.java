public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Ejemplo de Pomosfirmo y abstraccion");
        Pay creditCard= new CreditCard(500D,"123456","15/Enero","123","20000" );
        Pay debitCard= new DebitCard(700D,"67890123","29/Febrero","987");

        PaymentManager pagar = new PaymentManager();

        pagar.paymentManager(creditCard);
        pagar.paymentManager(debitCard);
    }
}