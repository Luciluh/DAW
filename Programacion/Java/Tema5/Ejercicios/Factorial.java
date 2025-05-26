//package Java.Tema5.Ejercicios;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        int factorial=0;


        System.out.println("Introduzca un número para calcular su factorial: ");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            factorial = num * (num - 1);
            num--;
        }
        System.out.println("El factorial de " + num + "es: " + factorial);




    }
}

