import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        Tarea tarea1= new Tarea(
                "CEntrega lunes",
                "Progrma encargado con Exceptions",
                1, LocalDate.now().plusDays(1));
        Tarea tarea2=new Tarea(
                "BEntrega miercoles",
                "Programa con Inyeccionde Dependencias",
                2, LocalDate.now().plusDays(2));
        Tarea tarea3=new Tarea(
                "AEntrega viernes",
                "Entrega general de programas",
                 3,
                 LocalDate.now().plusDays(3)    //El ordenamiento sera por dias
        );
        TreeSet<Tarea> tareas = new TreeSet<>(); //TreeSet vacio
        tareas.add(tarea1);
        tareas.add(tarea2);
        tareas.add(tarea3);                     //Se agregan tareas
        System.out.println(tareas);             //Imprimi en consola contenido de TreeSet
        System.out.println("-------------------------");
        tareas.remove(tarea3);
        tareas.forEach(System.out::println);    //Solo dos tareas, se imprimen con foreach
        System.out.println("-------------------------");
        Comparator<Tarea> comparator =
                Comparator.comparing(Tarea::getNombre).reversed();  //Ordena lista por nombre y la revierte

        Set<Tarea> tareaSet = new TreeSet<>(comparator);
        tareaSet.addAll(tareas);
        System.out.println(tareaSet);


    }//Fin metodo main
}//Fin clase main