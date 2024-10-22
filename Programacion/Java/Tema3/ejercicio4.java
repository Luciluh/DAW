
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
        System.out.printf("x = %.1f", num1);
        System.out.printf("y = %.1f", num2);
        System.out.println("x + y = " + (num1+num2));
        System.out.println("x - y = " + (num1-num2));
        System.out.println("x / y = " + (num1/num2));
        System.out.println("x * y = " + (num1*num2));
        
        sc.close();
    }
}
