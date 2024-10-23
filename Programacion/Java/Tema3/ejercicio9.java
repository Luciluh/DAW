
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura;
        double radio;
        double volumen;

        System.out.println("Volumen de un cono");
        System.out.println("----------------------------");
        System.out.println("Introduzca la altura (cm): ");
        altura = sc.nextDouble();
        System.out.println("Introduca el radio de la base (cm): ");
        radio = sc.nextDouble();
        double radiocuadrado = Math.pow(radio, 2);
        volumen = (double)1/3*Math.PI*radiocuadrado*altura;

        System.out.printf("El volumen del cono es de %f cm\u00b3\n",volumen);
        sc.close();

    }
}
