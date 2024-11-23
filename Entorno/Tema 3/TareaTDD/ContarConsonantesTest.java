import org.junit.Assert;
import org.junit.Test;

public class ContarConsonantesTest {

    @Test
    public void TestContarConsonantes() {
        // Arrange: Preparamos el dato de entrada (palabra "amigo")
        String palabra = "amigo";
        
        // Arrange: Definimos el resultado esperado (la cantidad de consonantes en "amigo" es 2)
        int resultadoEsperado = 2;
        
        // Act: Llamamos a la función que queremos probar
        int resultadoReal = ContarConsonantes.contarConsonantes(palabra);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestContarConsonantesVacia() {
        // Arrange: Preparamos el dato de entrada (palabra vacía)
        String palabra = "";
        
        // Arrange: Definimos el resultado esperado (no hay consonantes)
        int resultadoEsperado = 0;
        
        // Act: Llamamos a la función que queremos probar
        int resultadoReal = ContarConsonantes.contarConsonantes(palabra);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestContarConsonantesSoloVocales() {
        // Arrange: Preparamos el dato de entrada (palabra "aeiou")
        String palabra = "aeiou";
        
        // Arrange: Definimos el resultado esperado (no hay consonantes)
        int resultadoEsperado = 0;
        
        // Act: Llamamos a la función que queremos probar
        int resultadoReal = ContarConsonantes.contarConsonantes(palabra);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void TestContarConsonantesConEspacios() {
        // Arrange: Preparamos el dato de entrada (palabra "hola mundo")
        String palabra = "hola mundo";
        
        // Arrange: Definimos el resultado esperado (la cantidad de consonantes en "hola mundo" es 6)
        int resultadoEsperado = 6;
        
        // Act: Llamamos a la función que queremos probar
        int resultadoReal = ContarConsonantes.contarConsonantes(palabra);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }

    public class ContarConsonantes {

    // Implementamos la función que cuenta las consonantes
    public static int contarConsonantes(String palabra) {
        int contador = 0;
        
        // Convertimos la palabra a minúsculas para hacer la comparación insensible a mayúsculas
        palabra = palabra.toLowerCase();
        
        // Iteramos sobre cada letra de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            
            // Verificamos si la letra es una consonante (es una letra y no es vocal)
            if (Character.isLetter(letra) && !"aeiou".contains(String.valueOf(letra))) {
                contador++;
            }
        }
        
        return contador;
    }
}

}
