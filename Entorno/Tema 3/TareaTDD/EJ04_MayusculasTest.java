import org.junit.Assert;
import org.junit.Test;

public class EJ04_MayusculasTest {

    @Test
    public void TestTieneMayusculasTrue() {
        // Arrange: Preparamos el dato de entrada (palabra en mayúsculas)
        String palabra = "HOLA";
        
        // Arrange: Definimos el resultado esperado
        boolean resultadoEsperado = true;
        
        // Act: Llamamos a la función que queremos probar
        boolean resultadoReal = Mayusculas.tieneMayusculas(palabra);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestTieneMayusculasFalse() {
        // Arrange: Preparamos el dato de entrada (palabra con una letra en minúscula)
        String palabra = "Hola";
        
        // Arrange: Definimos el resultado esperado
        boolean resultadoEsperado = false;
        
        // Act: Llamamos a la función que queremos probar
        boolean resultadoReal = Mayusculas.tieneMayusculas(palabra);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestTieneMayusculasVacia() {
        // Arrange: Preparamos el dato de entrada (palabra vacía)
        String palabra = "";
        
        // Arrange: Definimos el resultado esperado (una palabra vacía puede considerarse como sin mayúsculas)
        boolean resultadoEsperado = false;
        
        // Act: Llamamos a la función que queremos probar
        boolean resultadoReal = Mayusculas.tieneMayusculas(palabra);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestTieneMayusculasConEspacios() {
        // Arrange: Preparamos el dato de entrada (palabra con espacios en mayúsculas)
        String palabra = "HOLA MUNDO";
        
        // Arrange: Definimos el resultado esperado
        boolean resultadoEsperado = false;
        
        // Act: Llamamos a la función que queremos probar
        boolean resultadoReal = Mayusculas.tieneMayusculas(palabra);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}

