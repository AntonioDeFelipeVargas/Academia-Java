import java.util.Objects;

public class Cliente
{
    private String nombre;
    private Banco banco;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, Banco banco) {
        super();
        this.nombre = nombre;
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        return Objects.equals(nombre, other.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void pagar(double cantidad) {
        System.out.println(nombre+ "aplica pago");
        banco.aplicarPago(cantidad);
    }

}
