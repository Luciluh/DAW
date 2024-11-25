/*
Escribe un programa que lea una lista de diez números y determine cuántos son
positivos, y cuántos son negativos.
 */
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {

        int num ;
        int contNeg = 0;
        int contPos = 0; 
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Introduce 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            if (num<0) {
                contNeg ++ ; 
            } else {
                contPos ++ ;
            }
        }
        System.out.printf("Has introducido %d positivos y %d negativos", contNeg, contPos);

        sc.close();
    }
}
