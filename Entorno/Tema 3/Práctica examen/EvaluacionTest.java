import org.junit.Assert;
import org.junit.Test;

public class EvaluacionTest {

    @Test
    public void testResultado_15_años_80_años() {

        //Arrange
        int num1 = 15;
        int num2 = 80;  
        boolean resultadoEsperado = true;
        
        //Act

        boolean resultadoReal = Evaluacion.compruebaEdad40(num1, num2);


        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testResultado_15_años_20_años() {

        //Arrange
        int num1 = 15;
        int num2 = 20;  
        boolean resultadoEsperado = false;
        
        //Act

        boolean resultadoReal = Evaluacion.compruebaEdad40(num1, num2);


        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);


    }
}
