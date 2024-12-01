import org.junit.Assert;
import org.junit.Test;

public class Evaluacion01Test {

    @Test
    public void testPalabra_Cuento() {

        //Arrange

        String palabra = "Cuento";
        int valorEsperado = 3;

        //Act

        int valorReal = Evaluacion01.numConsonantes(palabra);

        //Assert
        Assert.assertEquals(valorEsperado, valorReal);

    }

    @Test
    public void testPalabra_Adios() {

        //Arrange

        String palabra = "Adios";
        int valorEsperado = 2;

        //Act

        int valorReal = Evaluacion01.numConsonantes(palabra);

        //Assert
        Assert.assertEquals(valorEsperado, valorReal);

    }
}
