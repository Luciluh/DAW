package Tema4.Ejercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. 
 * Aplica la fórmula t = (raiz cuadrada)2h/g siendo g = 9.81 m/s2.
 */
public class ejercicio5 {

    private static final double GRAVEDAD = 9.81f;
    public static void main(String[] args) {
        
        double h; //altura
        double t; //tiempo
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);


        System.out.println("Cálculo del tiempo de caída de un objeto");
        System.out.print("Introduce la altura (en metros) desde la que cae el objeto: ");
        h = sc.nextFloat();

        t = Math.sqrt((2*h)/GRAVEDAD);

        //La raiz cuadrara no admite valores nulos, por lo que hacemos un if para filtrar el resultado
        if (t>0) {
            System.out.printf("El objeto tarda %.2f segundos.", t);
        } else {
            System.out.print("***VALORES INTRODUCIDOS ERRÓNEOS***");

            sc.close();
        }
    }
}
