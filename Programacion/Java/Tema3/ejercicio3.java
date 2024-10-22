
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euros;
        double pesetas; 

        System.out.println("Introduzca la cantidad de pesetas que quiere convertir: " );
        pesetas = sc.nextDouble();
        euros = pesetas / (166.386);
        System.out.printf("%.1f pesetas son %.1f euros.", pesetas, euros);

        sc.close();

    }
}
