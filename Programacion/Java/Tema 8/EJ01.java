/*
Ejercicio principal donde implementaremos las funciones de "Matematicas.java"
*/

import java.util.Scanner;

public class EJ01{
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        //Solicitamos un numero
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

        //Vamos a voltear un número
        System.out.println("El inverso es: " + Matematicas.volteaNum(num));


        //Vamos a ver si un numero es capicua 

        if (Matematicas.esCapicua(num)==true) {
            System.out.println(num + " es capicua");
        } else {
            System.out.println(num + " NO es capicua");
        }   

        //Vamos a ver si un numero es primo 

        if (Matematicas.esPrimo(num)==true) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " NO es primo");
        }

        //Vamos a ver el siguiente numero primo a uno que ingresemos

        System.out.println("El numero primo siguiente al ingresado es: " + Matematicas.siguientePrimo(num));
























        sc.close();

    }

}