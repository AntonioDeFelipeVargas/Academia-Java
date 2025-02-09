import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        Set<Cliente> clientes = new HashSet<>();
        clientes.add(new Cliente("Patrobas"));
        clientes.add(new Cliente("Herodion"));
        clientes.add(new Cliente("Urbano"));
        clientes.add(new Cliente("Nereo"));

        Almacen almacen = new Almacen("Neza",clientes);

        almacen.setCuenta(new Cuenta(new StringBuilder("cta1"),1));
        almacen.setCuenta(new Cuenta(new StringBuilder("cta2"),2));
        almacen.setCuenta(new Cuenta(new StringBuilder("cta3"),3));
        almacen.setCuenta(new Cuenta(new StringBuilder("cta4"),4));

        Cliente cliente = getCliente(clientes,"Nereo");

        assert cliente != null : "Cliente no encontrado";
        cliente.setBanco(new Banco("Azteca"));

        if (cliente!=null)
            System.out.println(cliente);
        cliente.pagar(300.50);

    }

    private static Cliente getCliente(Set<Cliente> clientes, String nombre){

        Iterator<Cliente> iterator = clientes.iterator();

        while(iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (nombre.equals(cliente.getNombre()))
                return cliente;
        }

        return null;
    }
}