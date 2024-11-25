
import java.util.Scanner;

public class EJ30pintarU {
    public static void main(String[] args) {
        
        int alt; 
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una altura: ");
        alt = sc.nextInt();
        int espacios = alt - 2 ;
        int asteriscos = alt - 2 ;

        //Recorremos el bucle segun altura:
        for (int i = 0; i < alt-1; i++) {
            //pintamos todas las filas sin incluir la ultima que es distinta
            System.out.print("*");
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //pintamos la ultima fila 
        for (int i = alt-1; i < alt; i++) {
            System.out.print(" ");
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
        }
        sc.close();
    }
}
