import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    // Instanciamos la clase Calculadora
    Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {
        // Arrange
        double num1 = 5;
        double num2 = 3;
        double resultadoEsperado = 8;

        // Act
        double resultadoReal = calculadora.sumar(num1, num2);

        // Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal, 0.001); // El tercer parámetro es la tolerancia en el caso de decimales
    }

    @Test
    public void testRestar() {
        // Arrange
        double num1 = 5;
        double num2 = 3;
        double resultadoEsperado = 2;

        // Act
        double resultadoReal = calculadora.restar(num1, num2);

        // Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    @Test
    public void testMultiplicar() {
        // Arrange
        double num1 = 5;
        double num2 = 3;
        double resultadoEsperado = 15;

        // Act
        double resultadoReal = calculadora.multiplicar(num1, num2);

        // Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    @Test
    public void testDividir() {
        // Arrange
        double num1 = 6;
        double num2 = 3;
        double resultadoEsperado = 2;

        // Act
        double resultadoReal = calculadora.dividir(num1, num2);

        // Assert
        Assert.assertEquals(resultadoEsperado, resultadoReal, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        // Arrange
        double num1 = 6;
        double num2 = 0;

        // Act
        calculadora.dividir(num1, num2); // Esto debería lanzar una ArithmeticException
    }
}
