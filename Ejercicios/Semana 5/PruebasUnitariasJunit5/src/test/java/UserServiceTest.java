import org.academia.UserDTO;
import org.academia.UserNotFoundException;
import org.academia.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserServiceTest
{

    private UserService userService;
    private UserDTO esperado;

    //Se realizara antes de ejecutar cada test, por lo que se tendra siempre un usuario con los datos esperados
    @BeforeEach
    public void setUp()
    {
        userService = new UserService();
        esperado = new UserDTO(1L,"Manuel");
    }

    @DisplayName("Dado un usuario creado comparar si el retornado es igual")
    @Test
    public void usuarioAddTest()
    {
        final UserDTO resultado = userService.addUser(1L,"Manuel");
        //----------------------------Pruebas----------------------------------------
        Assertions.assertNotEquals(esperado,resultado);//Correcto si los objetos son diferentes
        Assertions.assertEquals(esperado.getNombre(),resultado.getNombre());//Correcto si los nombres coinciden
        Assertions.assertEquals(esperado.getId(),resultado.getId());//Correcto si los id coinciden
    }

    @DisplayName("Pruebas de getUser(Long id)")
    @Test
    public void getUserTest()
    {   final UserDTO resultado = userService.addUser(1L,"Manuel");
        String username = userService.getUser(1L).getNombre();
        Assertions.assertNotNull(username);

        Assertions.assertEquals(esperado.getId(),resultado.getId());
    }
    @Test
    void getUser_withNonExistingId_shouldReturnNull()
    {
        UserDTO user = userService.getUser(1L);
        Assertions.assertNull(user);
    }
    @Test
    void updateUser_withNullName_shouldUpdateName() throws UserNotFoundException, UserNotFoundException {
        userService.addUser(1L, "John Doe");
        UserDTO updatedUser = userService.updateUser(1L, null);
        Assertions.assertNotNull(updatedUser.getNombre()); // Verifica que el usuario se actualizó en el servicio
    }
}
