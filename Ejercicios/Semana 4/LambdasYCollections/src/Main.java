import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", "Electronica", 1200.0));
        productos.add(new Producto("Teléfono", "Electronica", 800.0));
        productos.add(new Producto("Camiseta", "Ropa", 25.0));
        productos.add(new Producto("Pantalón", "Ropa", 50.0));
        productos.add(new Producto("Libro", "Libros", 15.0));

        //Filtrado de productos
        Predicate<Producto> precioMayor100 = producto -> producto.getPrecio() > 100;
        List<Producto> productosCaros= productos.stream()
                .filter(precioMayor100)
                .toList();
        System.out.println("Productos Caros: "+productosCaros);
        //Modificar nombres de la lista
        Function<Producto,String> aMayuscula= producto -> producto.getNombre().toUpperCase();
        List<String> productoMayuscula= productos.stream()
                .map(aMayuscula)
                .toList();
        System.out.println("Productos en Mayuscula: "+productoMayuscula);
        //Imprimir elementos de una categoria
        System.out.println("Productos en Electronica: ");
        Consumer<Producto> imprimirProductosElectronica= producto -> System.out.println(producto.getNombre());
        productos.stream()
                .filter(producto -> producto.getCategoria().equals("Electronica"))
                .forEach(imprimirProductosElectronica);

        //Suma de los precios de los productos listados
        double total= productos.stream().mapToDouble(Producto::getPrecio).sum();
        System.out.println("Total: "+total);
    }
}