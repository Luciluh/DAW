package Tema4.Ejercicios;
/*
 * Amplía el programa anterior para que diga la nota del boletín 
 * (insuficiente, suficiente, bien, notable o sobresaliente).
 */
import java.util.Locale;
import java.util.Scanner;

/*Escribe un programa que calcule la media de tres notas introducidas por teclado. */
public class ejercicio7 {
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
            System.out.printf("La media es: %.2f \n", media);
        } else {
            System.out.print("Algunas de las notas introducidas era negativa. Vuelva a intentarlo.");
        }

        //Con el switch no me dejaba poner rango de valores
        
        if (media>=0 && media <5) {
            System.out.println("Insuficiente");
        } else if (media == 5){
            System.out.println("Suficiente");
        } else if (media == 6){
            System.out.println("Bien");
        } else if (media>=7 && media <=8){
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
        sc.close();
    }
}
