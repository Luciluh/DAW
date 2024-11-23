import org.junit.Assert;
import org.junit.Test;

public class EJ02_PalindromoTest {

    @Test
    public void TestPalindromoTrue() {
        // Arrange: Preparamos el dato de entrada (palabra que sí es palíndromo)
        String palabra = "reconocer";
        
        // Arrange: Definimos el resultado esperado
        boolean resultadoEsperado = true;
        
        // Act: Llamamos a la función que queremos probar
        boolean resultadoReal = Palindromo.esPalindromo(palabra);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestPalindromoFalse() {
        // Arrange: Preparamos el dato de entrada (palabra que NO es palíndromo)
        String palabra = "amigo";
        
        // Arrange: Definimos el resultado esperado
        boolean resultadoEsperado = false;
        
        // Act: Llamamos a la función que queremos probar
        boolean resultadoReal = Palindromo.esPalindromo(palabra);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
