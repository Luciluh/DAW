import org.junit.Test;

public class InvertirLetrasTest {
    @Test
    public void TestInvertirCadena(){

        //arrange
        String amigo = "amigo" ;
        
        String resultadoEsperado = "ogima" ;

        //act
        String resultadoReal = InvertirLetras.invertirCadena(amigo);

        //assert

        Assert.assertEquals(resultadoEsperado, resultadoReal);

    }
}
