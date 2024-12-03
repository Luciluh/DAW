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


























        sc.close();

    }

}