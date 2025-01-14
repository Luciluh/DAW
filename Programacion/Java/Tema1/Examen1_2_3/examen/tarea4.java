
import java.util.Locale;
import java.util.Scanner;

public class tarea4 {
    public static void main(String[] args) {

        float lit;
        float gal;
        float cuaGal;
        float pin;
        float onzLiq;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.printf("\033[1mCALCULADORA DE MEDIDAS IMPERIALES\033[0m\n");
        System.out.println("=========================");
        System.out.print("Introduce la cantidad en litros: ");
        lit = sc.nextFloat();

        gal = lit * 0.264172f;
        cuaGal = lit * 1.0568f;
        pin = lit * 2.1132f;
        onzLiq = lit * 33.814f;

        System.out.printf("\033[4m%.0f litros\033[0m son: \n", lit);
        System.out.printf("\033[1m\033[43m%.2f\033[0m galones (gal)\n",gal);
        System.out.printf("\033[1m\033[42m%.2f\033[0m cuartos de galon (qt)\n",cuaGal);
        System.out.printf("\033[1m\033[41m%.2f\033[0m pintas (pt)\n",pin);
        System.out.printf("\033[1m\033[46m%.2f\033[0m onzas liquidas (fl oz)\n",onzLiq);

        sc.close();

    }
}
