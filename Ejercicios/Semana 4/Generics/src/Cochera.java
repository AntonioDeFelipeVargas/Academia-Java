public class Cochera<T>
{
    private T t;

    public Cochera(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void guardarEnCochera()
    {
        System.out.println("Se guardo " +this.t.getClass().getName()+" en cochera");
    }

}
