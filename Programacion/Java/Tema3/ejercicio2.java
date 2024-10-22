
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double euros;
        double pesetas; 

        System.out.println("Introduzca la cantidad de euros que quiere convertir: " );
        euros = sc.nextDouble();
        pesetas = euros * (166.386);
        System.out.printf("%.1f pesetas son %.1f euros.", pesetas, euros);

        sc.close();

    }
}
