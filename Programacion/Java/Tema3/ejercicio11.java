
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mb;
        double kb;

        System.out.println("Introduzca el numero de Kb:");
        kb = sc.nextDouble();
        mb = kb/1024;
        System.out.printf("%.1fKb son %.1fMb", kb,mb);
        sc.close();
    }
}
