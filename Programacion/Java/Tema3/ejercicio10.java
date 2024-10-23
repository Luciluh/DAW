
import java.util.Scanner;
/*1 MB = 1024 KB */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mb;
        double kb;

        System.out.println("Introduzca el numero de Mb:");
        mb = sc.nextDouble();
        kb = mb*1024;
        System.out.printf("%.1fMb son %.1fKb", mb,kb);
        sc.close();
    }
}
