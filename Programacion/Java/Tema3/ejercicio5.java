 
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura; 
        double area;

        System.out.println("Area de un rectangulo");
        System.out.println("-------------------------");
        System.out.print("Introduzca la longitud de la base(cm): ");
        base = sc.nextDouble();
        System.out.print("Introduzca la longitud de la altura (cm): ");
        altura = sc.nextDouble();
        area = (base*altura);
        System.out.printf("El area del rectangulo es: %.2f cm\u00b2\n", area);
        
        sc.close();

    }
}
