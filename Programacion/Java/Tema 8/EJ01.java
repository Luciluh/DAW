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
        System.out.println("El inverso es: " + Funciones.volteaNum(num));


        //Vamos a ver si un numero es capicua 

        if (Funciones.esCapicua(num)==true) {
            System.out.println(num + " es capicua");
        } else {
            System.out.println(num + " NO es capicua");
        }   

        //Vamos a ver si un numero es primo 

        if (Funciones.esPrimo(num)==true) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " NO es primo");
        }

        //Vamos a ver el siguiente numero primo a uno que ingresemos

        System.out.println("El numero primo siguiente al ingresado es: " + Funciones.siguientePrimo(num));

        //Vamos a ver las potencias
        System.out.print("Introduce un numero (calcularemos su potencia): ");
        int num2 = sc.nextInt(); 
        System.out.print("Introduce el exponente: ");
        int exponente = sc.nextInt(); 
        System.out.printf("%d ^ %d = %d\n", num2, exponente, Funciones.potencia(num2, exponente));

        //Vamos a ver el valor de una posicion de un numero indicado

        System.out.print("Introduce la posicion deseada: ");
        int posicion = sc.nextInt();

        System.out.println("La posicion del numero " + " es: " + Funciones.digitoN(num, posicion));























        sc.close();

    }

}