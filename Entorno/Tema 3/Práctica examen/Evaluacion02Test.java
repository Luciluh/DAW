import org.junit.Assert;
import org.junit.Test;

public class Evaluacion02Test {
    @Test
    public void testMayusculasSiNo_Comida() {

        //Arrange 

        String palabra = "Comida";
        boolean resultadoEsperado = true; 

        //Act
        boolean resultadoReal = Evaluacion02.mayusculasSiNo(palabra);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testMayusculasSiNo_campo() {

        //Arrange 

        String palabra = "campo";
        boolean resultadoEsperado = false; 

        //Act
        boolean resultadoReal = Evaluacion02.mayusculasSiNo(palabra);

        //Assert
         Assert.assertEquals(resultadoEsperado, resultadoReal);

    }
}
