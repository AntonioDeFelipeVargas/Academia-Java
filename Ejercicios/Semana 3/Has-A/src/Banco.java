import java.util.Objects;

public class Banco
{
    private String nombreBanco;

    public Banco(String nombreBanco) {
        super();
        this.nombreBanco = nombreBanco;
    }

    @Override
    public String toString() {
        return "Banco [nombreBanco=" + nombreBanco + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreBanco);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Banco other = (Banco) obj;
        return Objects.equals(nombreBanco, other.nombreBanco);
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void aplicarPago(double cantidad) {
        System.out.println(nombreBanco +" realizar pago: "+cantidad);
    }
}
