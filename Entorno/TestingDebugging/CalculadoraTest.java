import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertEquals(-1, calculadora.sumar(-2, 1));
        assertEquals(0, calculadora.sumar(0, 0));
    }

    @Test
    void testRestar() {
        assertEquals(1, calculadora.restar(3, 2));
        assertEquals(-3, calculadora.restar(-2, 1));
        assertEquals(0, calculadora.restar(0, 0));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-2, calculadora.multiplicar(-2, 1));
        assertEquals(0, calculadora.multiplicar(0, 5));
    }

    @Test
    void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(-2, calculadora.dividir(-6, 3));
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0));
    }
}
