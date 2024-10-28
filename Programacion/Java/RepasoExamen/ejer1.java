package RepasoExamen;
import java.util.Scanner;
/*
 * Escribe un programa que solicite tu nombre y apellido e imprima un saludo usando print, println y printf
 */
public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom;
        String ape; 

        System.out.print("Introduce tu nombre: ");
        nom = sc.nextLine();
        System.out.print("Introduce tu apellido: ");
        ape = sc.nextLine();
        System.out.printf("Tu nombre es %s y tu apellido es %s.", nom, ape);
        sc.close();
    }
}
