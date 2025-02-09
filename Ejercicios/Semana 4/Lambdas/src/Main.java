import java.util.function.*;

public class Main {
    static IntFunction<Long> factorial;//Inicializo la variable para la ultima lambda
    public static void main(String[] args)
    {
        // 1.  Lambda que suma dos números
        BinaryOperator<Integer> suma = (a, b) -> a + b;
        System.out.println("Suma de 5+3: " + suma.apply(5, 3));

        // 2. Lambda que verifica si un número es par
        Predicate<Integer> esPar = numero -> numero % 2 == 0;
        System.out.println("Es par el 4? " + esPar.test(4)); //

        // 3. Lambda que convierte un String a mayusculas
        Function<String, String> convertirAMayusculas = str -> str.toUpperCase();
        System.out.println("Mayúsculas: " + convertirAMayusculas.apply("hola"));

        // 4. Lambda que imprime un mensaje
        Consumer<String> imprimirMensaje = mensaje -> System.out.println(mensaje);
        imprimirMensaje.accept("Hola desde una lambda!");

        // 5. Lambda que calcula el factorial de un numero

        factorial = n -> {
            if (n == 0) {
                return 1L;
            } else {
                return n * factorial.apply(n - 1);
            }
        };
        System.out.println("Factorial de 5: " + factorial.apply(5)); // Salida: 120
    }
}