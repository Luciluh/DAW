package RepasoExamen;

import java.util.Locale;
import java.util.Scanner;
/*
 * - Solicite al usuario ingresar una cantidad en euros y un tipo de conversión (por ejemplo, a dólares, libras, yenes). 1 euro = 1,08 dolar; 1 euro = 165,75 yenes
- Use printf para mostrar la cantidad convertida en el formato de moneda correcto (por ejemplo, $12.34).
- Realice los cálculos con precisión y muestre las cantidades con dos decimales.
- Asegúrate de usar un estilo de texto para destacar el tipo de moneda y, si es posible, personaliza el color de fondo y de texto en la consola.
 */
public class ejer2 {

    private static final float CONV_YENES = 165.75f;
    private static final float CONV_DOLARES = 1.08f;
    public static void main(String[] args) {

        float euros;
        float dolares;
        float yenes;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.print("Introduzca la cantidad en euros (€) a convertir: \n");
        euros = sc.nextFloat();

        dolares = euros * CONV_DOLARES;
        yenes = euros * CONV_YENES;

        System.out.printf("\033[41m%.2f €\033[0m son: \033[44m%.2f dólares ($)\033[0m y \033[36m%.2f yenes\033[0m \u263B", euros, dolares,yenes);


        sc.close();
    }
}
