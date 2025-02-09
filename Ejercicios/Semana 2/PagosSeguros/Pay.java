abstract public class Pay
{

    private final double amount;

    public Pay(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    //Metodos abstractos para aplicar polimorfismo
    public abstract void processPayment();
    public abstract String getDetails();



}
