import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        //Lista para tener datos con que probar los predicate
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Antonio", 28, "Programador"));
        empleados.add(new Empleado("Jose", 47, "Analista"));
        empleados.add(new Empleado("Pablo", 22, "Programador"));
        empleados.add(new Empleado("Juan", 25, "Proyect Manager"));
        empleados.add(new Empleado("Patrobas", 60, "Proyect Manager"));

        //Declaracion de los Predicate, que devolveran un valor booleano\

        Predicate<Empleado> edadMayor25 = empleado -> empleado.getEdad() > 25;
        Predicate<Empleado> esProgramador = empleado -> empleado.getCargo().equals("Programador");

        //Personas mayores que 25 y programadores
        Predicate<Empleado> mayorProgramador = edadMayor25.and(esProgramador);
        List<Empleado> programadoresGrandes = filter(empleados, mayorProgramador);
        System.out.println("Programadores grandes: " + programadoresGrandes);

        //Personas mayores de 25 o analistas
        Predicate<Empleado> mayorOAnalista = edadMayor25.or(empleado -> empleado.getCargo().equals("Analista"));
        List<Empleado> analistasOGrandes = filter(empleados, mayorOAnalista);
        System.out.println("Analistas O grandes: " + analistasOGrandes);

        //Personas que no son Programadores
        Predicate<Empleado> noProgramadores=esProgramador.negate();
        List<Empleado> noSonProgramadores = filter(empleados, noProgramadores);
        System.out.println("No son programadores: " + noSonProgramadores);
    }

    //Metodo con generics para filtrar las listas, recibe la lista y el predicate para trabajar
    public static <T> List<T> filter(List<T> lista, Predicate<T> predicado) {
        List<T> resultado = new ArrayList<>();
        for (T elemento : lista) {
            if (predicado.test(elemento)) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }
}