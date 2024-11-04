package Tema4.Ejercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo 𝑎𝑥 + 𝑏 = 0).
 */
public class ejercicio4 {
    public static void main(String[] args) {

        float a;
        float b;
        float resultado;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("El programa resuelve ecuaciones de primer grado del tipo ax + b = 0" );
        System.out.print("Introduzca el valor de a: ");
        a = sc.nextFloat();
        System.out.print("Ahora introduzca el valor de b: ");
        b = sc.nextFloat();

        if (a>0) {
            resultado = (-b)/a;
            System.out.printf("x = %.1f", resultado);
        } else {
            System.out.println("Esta ecuación no tiene solución real.");
        }
        sc.close();
    }
}
