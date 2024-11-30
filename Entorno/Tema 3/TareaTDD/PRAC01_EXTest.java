import org.junit.Assert;
import org.junit.Test;

public class PRAC01_EXTest {
    @Test
    public void testInvertirPalabra() {
        //Arrange 

        String palabra = "hola";
        String valorEsperado = "aloh";

        //Act

        String valorReal = PRAC01_EX.InvertirPalabra(palabra);


        //Assert 
        Assert.assertEquals(valorEsperado, valorReal);

    }
}
