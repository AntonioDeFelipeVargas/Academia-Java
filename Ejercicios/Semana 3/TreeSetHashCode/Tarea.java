import java.time.LocalDate;
import java.util.Objects;

public class Tarea implements Comparable<Tarea>
{
    private String nombre;
    private String descripcion;
    private int prioridad;
    private LocalDate fechaLimite;
    //Constructor
    public Tarea(String nombre, String descripcion, int prioridad, LocalDate fechaLimite) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
    }
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    //toString @Override
    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad='" + prioridad + '\'' +
                ", fechaLimite=" + fechaLimite +
                '}';
    }
    //hashCode and Equals @Override

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return Objects.equals(getNombre(), tarea.getNombre()) && Objects.equals(getDescripcion(), tarea.getDescripcion()) && Objects.equals(getPrioridad(), tarea.getPrioridad()) && Objects.equals(getFechaLimite(), tarea.getFechaLimite());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getDescripcion(), getPrioridad(), getFechaLimite());
    }

    @Override
    public int compareTo(Tarea o) {
        return this.fechaLimite.compareTo(o.fechaLimite);
    }
}
