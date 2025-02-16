import org.academia.Calculadora;
import org.academia.CalculadoraCloud;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculadoraTest
{   @InjectMocks //Inyecta los @Mock
    Calculadora calculadora= new Calculadora();
    @Mock CalculadoraCloud calculadoraCloud;


    //Comportamiento de Mockito
    @Test
    public  void probarSumaCloud()
    {
        when(calculadoraCloud.operacionEnCloud(5,20)).thenReturn(25.0);
        lenient().when(calculadoraCloud.operacionEnCloud(5,5)).thenReturn(10.0);
        //lenient indica que puede o no ejecutarse
        Assertions.assertEquals(25,calculadora.sumarEnCloud(5,20));
    }
}
