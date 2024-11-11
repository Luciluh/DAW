/*
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5
primeros números enteros a partir de uno que se introduce por teclado.
 */
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        double num;
        String n = "n";
        String n2 = "n2";
        String n3 = "n3";
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        System.out.printf("%-8s|%8s  |%8s\n----------------------------\n",n,n2,n3);

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-8.0f|%8.0f  |%8.0f\n", num, Math.pow(num, 2), Math.pow(num, 3));
            num++ ;
        }


        sc.close();
    }
}
