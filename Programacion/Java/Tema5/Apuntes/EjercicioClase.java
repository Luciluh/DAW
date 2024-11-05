package Tema5;

import java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) {
        
        int num; 
        int total = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca número y pulse ENTER. Para acabar, introduce un numero negativo.");

        System.out.print("?");
        num = sc.nextInt();

        while (num>=0) { 

            total = total + num;
            contador++;
            
            System.out.print("?");
            num = sc.nextInt();
        }

        System.out.printf("Se han introducido %d números en total y la suma de todos ellos es %d", contador,total);

        sc.close();
    }
}