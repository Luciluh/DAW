import org.junit.Assert;
import org.junit.Test;

public class ComparacionesEnterosTest {

    @Test
    public void TestSonIguales() {
        // arrange
        int num1 = 2;
        int num2 = 2;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.sonIguales(num1, num2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestEsMayor() {
        // arrange
        int num1 = 1;
        int num2 = 5;
        boolean resultadoEsperado = false;

        // act
        boolean resultadoReal = ComparacionesEnteros.esMayor(num1, num2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestEsMenor() {
        // arrange
        int num1 = 1;
        int num2 = 5;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.esMenor(num1, num2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestEsDivisible() {
        // arrange
        int num1 = 10;
        int num2 = 2;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.esDivisible(num1, num2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestEsDivisiblePorCero() {
        // arrange
        int num1 = 10;
        int num2 = 0;
        boolean resultadoEsperado = true;  // Según tu lógica en el método

        // act
        boolean resultadoReal = ComparacionesEnteros.esDivisible(num1, num2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestSonAmbosPares() {
        // arrange
        int num1 = 4;
        int num2 = 6;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.sonAmbosPares(num1, num2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestAlMenosUnoPositivo() {
        // arrange
        int num1 = -3;
        int num2 = 4;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.alMenosUnoPositivo(num1, num2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestSumaEsPar() {
        // arrange
        int num1 = 3;
        int num2 = 5;
        boolean resultadoEsperado = false;

        // act
        boolean resultadoReal = ComparacionesEnteros.sumaEsPar(num1, num2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestSumaEsParConIncremento() {
        // arrange
        int num1 = 3;
        int num2 = 3;
        boolean resultadoEsperado = true;

        // act
        boolean resultadoReal = ComparacionesEnteros.sumaEsPar(num1, num2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

}
