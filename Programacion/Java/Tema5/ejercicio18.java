
import java.util.Scanner;
/*
Realiza un programa que vaya pidiendo números hasta que se introduzca un número
negativo y nos diga cuántos números se han introducido, la media de los impares y
el mayor de los pares. El número negativo sólo se utiliza para indicar el final de la
introducción de datos pero no se incluye en el cómputo.
*/
public class ejercicio18 {
    public static void main(String[] args) {

        int num ;
        int i = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, vaya introduciendo números enteros.\nPuede terminar mediante la introducción de un número negativo.");

        do {
            num = sc.nextInt();

            if (num%2==0) {
                
            } else {
                
            }
            i++ ;


        } while (num>=0);

        sc.close();
    }
}

