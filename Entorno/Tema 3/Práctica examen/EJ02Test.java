import org.junit.Assert;
import org.junit.Test;

public class EJ02Test {
    @Test
    public void testFahrenheit_0_Celsius() {

        //Arrange 

        int Celsius = 0;
        int resultadoEsperado = 32;

        //Act 

        int resultadoReal = EJ02.Fahrenheit(Celsius);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testFahrenheit_100_Celsius() {

        //Arrange 

        int Celsius = 100;
        int resultadoEsperado = 212;

        //Act 

        int resultadoReal = EJ02.Fahrenheit(Celsius);

        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
