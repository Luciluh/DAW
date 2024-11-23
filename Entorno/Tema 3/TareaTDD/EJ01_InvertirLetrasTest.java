import org.junit.Assert;
import org.junit.Test;

public class EJ01_InvertirLetrasTest {
    
    @Test
    public void TestInvertirCadena() {
        // Arrange: Preparamos el dato de entrada
        String amigo = "amigo";
        
        // Arrange: Definimos el resultado esperado
        String resultadoEsperado = "ogima";
        
        // Act: Llamamos a la función que queremos probar
        String resultadoReal = EJ01_InvertirLetras.invertirCadena(amigo);
        
        // Assert: Comprobamos que el resultado real coincide con el esperado
        Assert.assertEquals(resultadoEsperado, resultadoReal);
    }
}
