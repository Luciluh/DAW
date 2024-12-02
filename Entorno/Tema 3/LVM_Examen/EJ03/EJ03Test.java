package EJ03;
import org.junit.Assert;
import org.junit.Test;

public class EJ03Test {
    @Test
    public void testCuentaEspacios() {

        //Arrange 
        String frase = "Hola mundo";
        int valorEsperado = 1;

        //Act

        int valorReal = EJ03.cuentaEspacios(frase);

        //Assert
        Assert.assertEquals(valorEsperado, valorReal);


    }
}
