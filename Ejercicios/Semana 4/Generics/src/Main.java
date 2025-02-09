public class Main {
    public static void main(String[] args)
    {
        System.out.println("generics");

        Cochera<Carro> v1= new Cochera<>(new Carro("Vocho"));

        Cochera<Moto> v2= new Cochera<>(new Moto("Mortalika"));
        v1.guardarEnCochera();
        v2.guardarEnCochera();

    }
}