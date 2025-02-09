import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Almacen
{
    //HAS-A
    private String nombre;
    private List<Cuenta> listaCuentas;
    private Set<Cliente> listaClientes;

    public Almacen(String nombre, Set<Cliente> listaClientes ) {
        this.nombre = nombre;
        listaCuentas = new LinkedList<>();
        this.listaClientes = listaClientes;
    }

    @Override
    public String toString() {
        System.out.println( "Almacen: " + nombre );
        listaCuentas.forEach(c -> System.out.println(c));
        listaClientes.forEach(c -> System.out.println(c));
        return "";
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
        Almacen other = (Almacen) obj;
        return Objects.equals(nombre, other.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuenta(Cuenta cta) {
        listaCuentas.add(cta);
    }

    public Cuenta getCuenta(int numerocuenta) {
        int i = listaCuentas.indexOf(new Cuenta(null,numerocuenta));
        System.out.println("Indice: "+i);
        Cuenta cta = null;
        if (i == -1)
            return null;
        else
            cta = listaCuentas.get(i); //<==
        return new Cuenta(cta.getCveCuenta(),cta.getNumeroCuenta());
        //return cta;
    }

    public Set<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Set<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void setCliente(Cliente cli) {
        listaClientes.add(cli);
    }
}
