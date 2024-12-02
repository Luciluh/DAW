package EJ02;
import org.junit.Assert;
import org.junit.Test;

public class EJ02Test {
    /*
    En el primer test vamos a comprobar si el primer numero es mayor que el segundo
     */
    @Test
    public void testMayor_Menor_Igual_Numero_Mayor() {

        //Arrange  
        int num1 = 50;
        int num2 = 15;
        String valorEsperado = "El primer numero es mayor";

        //Act
        String valorReal = EJ02.Mayor_Menor_Igual(num1,num2);

        //Assert 
        Assert.assertEquals(valorEsperado, valorReal);
    }

        /*
    En el segundo test vamos a comprobar si el primer numero es igual que el segundo
     */
    @Test
    public void testMayor_Menor_Igual_Numero_Igual() {

        //Arrange
        int num1 = 50;
        int num2 = 50;
        String valorEsperado = "Ambos son iguales";

        //Act
        String valorReal = EJ02.Mayor_Menor_Igual(num1,num2);

        //Assert 
        Assert.assertEquals(valorEsperado, valorReal);
    }

            /*
    En el tercer test vamos a comprobar si el primer numero es menor que el segundo
     */
    @Test
    public void testMayor_Menor_Igual_Numero_Menor() {

        //Arrange
        int num1 = 30;
        int num2 = 50;
        String valorEsperado = "El primer numero es menor";

        //Act
        String valorReal = EJ02.Mayor_Menor_Igual(num1,num2);

        //Assert 
        Assert.assertEquals(valorEsperado, valorReal);
    }

    /*
     * Considero que no necesitamos mas test ya que hemos cubierto las tres posiblidades posibles:
     * 1. Num1 mayor que num2
     * 2. Num1 igual que num2
     * 3. Num1 menor que num2
     */
}
