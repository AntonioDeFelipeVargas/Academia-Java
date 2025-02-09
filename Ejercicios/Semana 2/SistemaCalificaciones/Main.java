import java.util.ArrayList;

public class Main
{
    public static int minCalif=6; //static para definir una calificacion minima
    public static void main(String[] args)
    {
        Integer calHistoria=2; //Autoboxing de int a Integer
        Double calQuimica=9.3; //Autoboxing de double a Double

        Double promedioDecimal = (calHistoria+calQuimica)/2;
        int promedioInt= promedioDecimal.intValue(); //Unboxing
        ArrayList<Integer> calificaciones = new ArrayList<>();
        calificaciones.add(calHistoria);
        calificaciones.add(calQuimica.intValue());//Unboxing de Double a int y autoboxing de int a Integer
        calificaciones.add(promedioInt);//autoboxing de int a Integer
        calificaciones.add(promedioDecimal.intValue());//Unboxing de Double a int y autoboxing de int a Integer
        if (promedioInt>=minCalif) //uso de static field para comparacion de aprobado
        {
            System.out.println("El promedio de calificaciones es: "+promedioDecimal);
            imprimirCalificaciones(calificaciones);  //Uso de metodo static para imprimi datos si paso
        }
        else
        {
            System.out.println("El promedio de calificaciones es: "+promedioInt);
            imprimirCalificaciones(calificaciones,false);//Uso de metodo static para imprimi datos si no paso haciendo overloading
        }

    }
    public static void imprimirCalificaciones(ArrayList<Integer> calificaciones)
    {
        System.out.println("Calificaciones");
        for (Integer cal : calificaciones)
        {
            System.out.println(cal);
        }
    }

    public static void imprimirCalificaciones(ArrayList<Integer> calificaciones, boolean paso)
    {
        System.out.println("Calificaciones no paso");
        for (Integer cal : calificaciones)
        {
            System.out.println(cal);
        }
    }

}