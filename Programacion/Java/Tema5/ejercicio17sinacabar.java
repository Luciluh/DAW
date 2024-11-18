
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

            // pinto los espacios
            for (int j = 1; j <= (num-i); j++) {
                System.out.print(" ");
            }
        //pinto un * cada vez que termino de pintar los espacios
        System.out.println("*");

            //pinto los espacios del interior de la piramide
            for (int j = 2; j < num ; j++) {
                for (int j2 = 1; j2 < (i-1); j2++) {
                    System.out.print(" ");
                }
            
            }
        System.out.println("*");
        
        }

    

        sc.close();

    }

}
