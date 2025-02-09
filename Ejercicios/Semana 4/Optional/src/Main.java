import java.util.Optional;

public class Main {
    public static void main(String[] args)
    {
        //Definen un valor u accion por defecto en caso de valores nulos, previniendo errores
        //NullPointerException
        //Por lo que son objetos que pueden o no contener un valor
        //Proporciona metodos para
        //Verificar si hay un valor presente, obtener valor presente, manejar valores no presentes

        String nombre = "Antonio";
        Optional<String> optionalNombre = Optional.of(nombre);

        if(optionalNombre.isPresent())
        {
            System.out.println("El nombre es: "+optionalNombre.get());
        }
        else
        {
            System.out.println("Error en el nombre");
        }

        String apellido = null;
        String apellido2 = "De Felipe";
        String optionalApellido = Optional.ofNullable(apellido)
                                                    .orElse(apellido2);
        System.out.println("El apellido es: "+optionalApellido);
    }
}