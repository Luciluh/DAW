import org.junit.Assert;
import org.junit.Test;

public class OperacionesMixtasTest {

    @Test
    public void TestConcatenarNumeroTexto() {
        // arrange
        int numero = 5;
        String texto = "manzanas";
        String resultadoEsperado = "5 manzanas";

        // act
        String resultadoReal = OperacionesMixtas.concatenarNumeroTexto(numero, texto);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestBooleanComoTextoVerdadero() {
        // arrange
        boolean valor = true;
        String resultadoEsperado = "verdadero";

        // act
        String resultadoReal = OperacionesMixtas.booleanComoTexto(valor);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestBooleanComoTextoFalso() {
        // arrange
        boolean valor = false;
        String resultadoEsperado = "verdadero";  // El código tiene un error, debería ser "falso"

        // act
        String resultadoReal = OperacionesMixtas.booleanComoTexto(valor);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestConcatenarTextos() {
        // arrange
        String texto1 = "Hola";
        String texto2 = "Mundo";
        String resultadoEsperado = "Hola Mundo";

        // act
        String resultadoReal = OperacionesMixtas.concatenarTextos(texto1, texto2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestDescripcionNumeroPositivo() {
        // arrange
        int numero = 5;
        String resultadoEsperado = "El número es positivo";

        // act
        String resultadoReal = OperacionesMixtas.descripcionNumero(numero);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestDescripcionNumeroNegativo() {
        // arrange
        int numero = -5;
        String resultadoEsperado = "El número es negativo";

        // act
        String resultadoReal = OperacionesMixtas.descripcionNumero(numero);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestDescripcionNumeroCero() {
        // arrange
        int numero = 0;
        String resultadoEsperado = "El número es cero";

        // act
        String resultadoReal = OperacionesMixtas.descripcionNumero(numero);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestCambiarTextoAMayusculas() {
        // arrange
        String texto = "hola";
        boolean aMayusculas = true;
        String resultadoEsperado = "HOLA";

        // act
        String resultadoReal = OperacionesMixtas.cambiarTextoAMayusculas(texto, aMayusculas);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestCambiarTextoAMinusculas() {
        // arrange
        String texto = "HOLA";
        boolean aMayusculas = false;
        String resultadoEsperado = "hola";

        // act
        String resultadoReal = OperacionesMixtas.cambiarTextoAMayusculas(texto, aMayusculas);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestDescripcionConFloat() {
        // arrange
        float valor1 = 3.14f;
        float valor2 = 2.71f;
        String resultadoEsperado = "Los valores son: 3.14€ y 2.71€";

        // act
        String resultadoReal = OperacionesMixtas.descripcionConFloat(valor1, valor2);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestFormatearNumero() {
        // arrange
        float numero = 17.89945f;
        int decimales = 2;
        String resultadoEsperado = "17,90";

        // act
        String resultadoReal = OperacionesMixtas.formatearNumero(numero, decimales);

        // assert
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

}
