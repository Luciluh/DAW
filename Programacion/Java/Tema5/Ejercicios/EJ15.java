/*
15. Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.

Ejemplo I:
Introduzca un número entero: 1
Introduzca otro número distinto al anterior: 71
1 8 15 22 29 36 43 50 57 64 71
*/

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int numMenor ;
        int numMayor;
        Scanner sc = new Scanner(System.in);
        
        // Leer los dos números
        System.out.print("Introduce un número entero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce otro número entero distinto al anterior: ");
        num2 = sc.nextInt();

        // Validar que los números sean distintos
        if (num1 == num2) {
            System.out.println("Número no válido, deben de ser distintos.");
        } else {
            // Asegurarnos de que num1 es el menor y num2 el mayor
            //Determinación del menor y mayor número: 
            //Utilizo Math.min(num1, num2) para obtener el menor de los dos números, y Math.max(num1, num2) para obtener el mayor.
        numMenor = Math.min(num1, num2);
        numMayor = Math.max(num1, num2);
            
            // Imprimir los números incrementando de 7 en 7
            for (int i = numMenor; i <= numMayor; i += 7) {
                System.out.print(i + " ");
            }
        }        
        sc.close();
    }
}

