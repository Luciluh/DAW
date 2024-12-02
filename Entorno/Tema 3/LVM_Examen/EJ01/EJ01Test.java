package EJ01;
import org.junit.Assert;
import org.junit.Test;

public class EJ01Test {
    @Test
    public void testSuman85_verdadero() {

        /*En este caso edad1 tomara el valor de 50 y edad2 55 
        ya que entre estos dos valores si que suman 85 añospor tanto boolean será true
        */

        //Arrange
        int edad1 = 50;
        int edad2 = 55;
        boolean valorEsperado = true;

        //Act

        boolean valorReal = EJ01.Suman85(edad1, edad2);


        //Assert

        Assert.assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void testSuman85_falso() {

        /*En este caso edad1 tomara el valor de 40 y edad2 20 
        ya que entre estos dos valores NO suman 85 añospor tanto boolean será false
        */

        //Arrange
        int edad1 = 40;
        int edad2 = 20;
        boolean valorEsperado = false;

        //Act

        boolean valorReal = EJ01.Suman85(edad1, edad2);


        //Assert

        Assert.assertEquals(valorEsperado, valorReal);
    }

    //Al tratarse de una variable de tipo boolean que solo puede tomar valores true o  false no necesito hacer mas pruebas
    //He realizado los dos posibles resultados.
}
