public class CreditCard extends Pay
{   //Se declararon con final
    private final String cardNumber;
    private final String expiryDate;
    private final String cvv;
    private final String creditLimit;

    public CreditCard(double amount,String cardNumber, String expiryDate, String cvv, String creditLimit) {
        super(amount);
        this.cardNumber = cardNumber;//Al usar tipos primitivos no deberia haber problemas, pero uso string que son inmutables
        this.expiryDate = expiryDate;//Si quisiera usar otro tipo de datos como SB y hacerlos inmutables podria ser algo como
        this.cvv = cvv;              //this.cvv= new StringBuilder(cvv)
        this.creditLimit = creditLimit;
    }
    //Se eliminaron setters
    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    @Override
    public void processPayment()
    {
        System.out.println("Procesando Tarjeta de credito");
    }

    @Override
    public String getDetails()
    {
        return "Pago con tarjeta de credito numero; "+ getCardNumber()+ "Y limite de credito de: "+getCreditLimit() ;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv='" + cvv + '\'' +
                ", creditLimit='" + creditLimit + '\'' +
                '}';
    }
}
