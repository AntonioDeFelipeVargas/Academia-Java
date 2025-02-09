public class DebitCard extends Pay
{
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public DebitCard(double amount, String cardNumber, String expiryDate, String cvv) {
        super(amount);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    //Metodos especificos
    @Override
    public void processPayment()
    {
        System.out.println("Procesando Tarjeta de credito");
    }

    @Override
    public String getDetails()
    {
        return "Pago con tarjeta de credito numero; "+ getCardNumber() ;
    }
}
