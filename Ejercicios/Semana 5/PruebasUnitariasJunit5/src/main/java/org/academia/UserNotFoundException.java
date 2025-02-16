package org.academia;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String usuarioNoEncontrado) {
        super(usuarioNoEncontrado);
    }
}
