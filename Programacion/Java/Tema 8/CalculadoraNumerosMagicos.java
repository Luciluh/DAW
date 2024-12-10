import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraNumerosMagicos {
    public static void main(String[] args) {
        
        long num; 
        long copiaNum;
        long invertido;
        long suma = 0;
        long multi;
        long i = 0;

        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        try {
            System.out.println("Introduce un número positivo:");
            num = sc.nextLong();  // Usamos nextLong() para permitir números grandes
            copiaNum = num;

            if (num < 0) {
                throw new NumeroNegativoException("No se permiten números negativos.");
            }
            System.out.println("El número introducido es: " + num);

            // Obtener el número invertido, se mantiene como String y luego se convierte a long
            String numeroInvertidoStr = Funciones.InvertirNumerosConCeros((int)num);
            invertido = Long.parseLong(numeroInvertidoStr);  // Convertimos el String a long

            // Sumar los dígitos del número original
            suma = Funciones.SumaDigitos((int) copiaNum);  // Función de suma de dígitos para int

            do {
                // Multiplicamos el invertido por la suma 
                multi = invertido * suma; 
                i++;    
            } while (multi >= 10);

            System.out.printf("El número mágico es: %d\n", multi);
            System.out.println("Número de iteraciones realizadas: " + i);

        } catch (NumeroNegativoException e) {
            System.out.println("***Error: " + e.getMessage() + "***");
        } catch (InputMismatchException e) {
            System.out.print("***Error: Ingrese un número entero***");
        } finally {
            sc.close();
        }
    }
}
