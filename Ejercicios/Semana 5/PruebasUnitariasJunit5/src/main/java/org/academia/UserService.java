package org.academia;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.HashMap;
import java.util.Objects;

public class UserService
{
    private final HashMap<Long, UserDTO> users = new HashMap<>();

    public UserDTO addUser (Long id, String user)
    {
        users.put(id, new UserDTO(id,user));
        return users.get(id);
    }

    public UserDTO getUser(Long id)
    {
        return users.get(id);
    }
    //Cree la clase UserNotFoundException para manejar el caso en que se quiera modificar un id que
    //no existe
    public UserDTO updateUser(Long id, String user) throws UserNotFoundException {
        UserDTO userDTO = users.get(id);
        if (userDTO == null)
            throw new UserNotFoundException("Usuario no encontrado");
        return users.put(id, new UserDTO(id,user));
    }


}
