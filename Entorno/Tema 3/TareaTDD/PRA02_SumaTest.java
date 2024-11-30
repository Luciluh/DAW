import org.junit.Assert;
import org.junit.Test;

public class PRA02_SumaTest {
    @Test
    public void testSumarNumeros() {

        //Arrange  
        int resultadoEsperado = 3;

        //Act
        int resultadoReal = PRA02_Suma.SumarNumeros();

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }
}
