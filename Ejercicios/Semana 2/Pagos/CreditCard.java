public class CreditCard extends Pay
{
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private String creditLimit;

    public CreditCard(Double amount,String cardNumber, String expiryDate, String cvv, String creditLimit) {
        super(amount);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
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

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
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
}
