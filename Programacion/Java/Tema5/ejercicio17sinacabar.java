
import java.util.Scanner;

public class ejercicio17sinacabar {
    public static void main(String[] args) {
        char caracter;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduczca un caracter para pintar la piramide: ");
        caracter = sc.next().charAt(0);

        System.out.print("Ingresa la altura de la piramide que deseas: ");
        num = sc. nextInt();
        
        System.out.println();

        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= (num-i); j++) {
                System.out.print(" ");
            }
        
        System.out.println("*");

            for (int j2 = 2; j2 < args.length; j2++) {
                
            }
                
        }

            

        sc.close();

    }

}
