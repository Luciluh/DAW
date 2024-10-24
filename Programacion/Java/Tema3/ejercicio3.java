
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double euros;
        int pesetas; 

        System.out.println("Introduzca la cantidad de pesetas que quiere convertir: " );
        pesetas = sc.nextInt();
        euros = pesetas / (166.386);
        System.out.printf("%d pesetas son %.1f euros.\n", pesetas, euros);

        sc.close();

    }
}
