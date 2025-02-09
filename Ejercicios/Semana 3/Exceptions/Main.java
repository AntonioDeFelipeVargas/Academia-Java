import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("UncheckedExceptions");
        //Estas pueden o no ser manejadas por nosotros, no es obligatorio
       try
       {
           int resultado = 10 / 0; // Lanza ArithmeticException
       }
       catch(ArithmeticException e)
       {
           System.out.println("ArithmeticException"+e.getMessage());
       }
       try
       {
           int[] numeros = {1, 2, 3};
           int numero = numeros[5]; // Lanza IndexOutOfBoundsException
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("ArrayIndexOutOfBoundsException"+e.getMessage());
       }


       System.out.println("CheckedExceptions");
       //Son aquellas que nos es obligatorio manejar
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt")))
        {
            System.out.println("Leyendo data");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }

        try {
            Class.forName("com.example.MiClase");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
    }
}