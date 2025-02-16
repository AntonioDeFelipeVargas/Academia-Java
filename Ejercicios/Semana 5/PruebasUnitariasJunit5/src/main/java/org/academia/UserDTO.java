package org.academia;

public class UserDTO
{
    final Long id;
    final String nombre;

    public UserDTO(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
