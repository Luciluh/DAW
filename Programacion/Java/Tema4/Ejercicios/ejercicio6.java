package Tema4.Ejercicios;

import java.util.Locale;
import java.util.Scanner;

/*Escribe un programa que calcule la media de tres notas introducidas por teclado. */
public class ejercicio6 {
    public static void main(String[] args) {
        float not1;
        float not2;
        float not3;
        float media;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.print("Introduzca la primera nota: ");
        not1 = sc.nextFloat();
        System.out.print("Introduzca la segunda nota: ");
        not2 = sc.nextFloat();
        System.out.print("Por último introduzca la tercera nota: ");
        not3 = sc.nextFloat();

        media = (not1 + not2 + not3)/3;

        if (not1>= 0 && not2>= 0 && not3>= 0) {

            media = (not1 + not2 + not3)/3;
            System.out.printf("La media es: %.2f ", media);
        } else {
            System.out.print("Algunas de las notas introducidas era negativa. Vuelva a intentarlo.");
        }
        sc.close();
    }
}
