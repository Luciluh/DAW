import org.junit.Assert;
import org.junit.Test;

public class EJ01Test {
    @Test
    public void testEsPar_7() {

        //Arrange
        int num = 7;
        boolean resultadoEsperado = false;


        //Act
        boolean resultadoReal = EJ01.esPar(num);


        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }

    @Test
    public void testEsPar_8() {

        //Arrange
        int num = 8;
        boolean resultadoEsperado = true;


        //Act
        boolean resultadoReal = EJ01.esPar(num);


        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }
}
