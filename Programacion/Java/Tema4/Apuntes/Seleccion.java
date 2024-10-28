package Java.Tema4;

import java.util.Scanner;

public class Seleccion {
    public static void main(String[] args) {

        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        edad = sc.nextInt();


        //CON SENTENCIA DE SELECCION
        if (edad>=18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }


        //CON OPERADOR TERNARIO//
        System.out.println((edad>=18)?"Eres mayor de edad":"Eres menor de edad");

        sc.close();
    }
}
