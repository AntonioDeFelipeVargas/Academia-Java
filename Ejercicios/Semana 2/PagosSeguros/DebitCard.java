public class DebitCard extends Pay
{
    //Si bien al hacer uso de string que so inmutables me protejo de cambios maliciosos
    //Hacer uso de copias a las referencias de tipos de datos como objetos o collections para asisgnar y
    //regresar info solicitada me parece la mejor alternativa
    private final String cardNumber;
    private final String expiryDate;
    private final String cvv;

    public DebitCard(double amount, String cardNumber, String expiryDate, String cvv) {
        super(amount);
        this.cardNumber = new String(cardNumber);//Para terminos de este ejemplo es redundante pero no lo es con otros
        this.expiryDate = new String(expiryDate);//tipos de datos que pueden ser vulnerables debido a sus referencias
        this.cvv = new String(cvv);              //Asi evitamos cambios por medio de referencias
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCvv() {
        return cvv;
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

    @Override
    public String toString() {
        return "DebitCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
