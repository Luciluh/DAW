import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {

        int base;
        int expo;
        double resultado = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        base= sc.nextInt();

        System.out.print("Introduzca el exponente máximo: ");
        expo= sc.nextInt();
        
        for (int i = 1; i <= expo; i++) {
            resultado = base;
            for (int j = 1; j < i; j++) {
                resultado = resultado * base;
            }
            System.out.printf("%d^%d= %.0f\n",base, i, resultado);
        }
        sc.close();
    }
}
