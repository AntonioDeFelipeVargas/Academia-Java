public class Cuenta
{
    private StringBuilder cveCuenta;
    private int numeroCuenta;

    public Cuenta(StringBuilder cveCuenta, int numeroCuenta) {
        super();
        this.cveCuenta = cveCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public int hashCode() {
        return numeroCuenta;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cuenta other = (Cuenta) obj;
        return numeroCuenta == other.numeroCuenta;
    }

    public StringBuilder getCveCuenta() {
        return cveCuenta;
    }

    public void setCveCuenta(StringBuilder cveCuenta) {
        this.cveCuenta = cveCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta [cveCuenta=" + cveCuenta + ", numeroCuenta=" + numeroCuenta + "]";
    }
}
