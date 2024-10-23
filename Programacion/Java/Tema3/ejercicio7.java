
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double iva;
        double total;

        System.out.println("Introduzca la base imponible (precio del articulo sin IVA):");
        base = sc.nextDouble();
        iva = (base * 0.21);
        total = base + iva;

        System.out.printf("Base imponible            %.2f €\n" , base);
        System.out.printf("IVA (21%%)                  %.2f €\n" , iva);
        System.out.println("-----------------------------------" );
        System.out.printf("Total                     %.2f €", total);

        sc.close();
        }
    }

