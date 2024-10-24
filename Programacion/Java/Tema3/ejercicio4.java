
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println("Introduzca el primer numero: ");
        num1 = sc.nextDouble();
        System.out.println("Introduzca el segundo numero: ");
        num2 = sc.nextDouble();
        
        System.out.printf("x = %.1f\n", num1);
        System.out.printf("y = %.1f\n", num2);
        System.out.printf("y + x = %.1f\n", num1 + num2);
        System.out.printf("y - x = %.1f\n", num1 - num2);
        System.out.printf("y / x = %.1f\n", num1 / num2);
        System.out.printf("y + x = %.1f\n", num1 * num2);

        /*
         * MAYUS + ALT + FLECHA ABAJO: COPIAR 
         */
        
        sc.close();
    }
}
