import java.util.Scanner;

public class EJ32EquisFacil {
    public static void main(String[] args) {
        
        int fila ; 
        int columna ;
        int altura ; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la X: ");
        altura = sc.nextInt();

        if ((altura >= 3) &&(altura%2!=0)) {

            for (fila = 0; fila < altura; fila++) {
                for (columna = 0; columna < altura; columna++) {
                    if ((fila==columna) || (columna==altura-fila-1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            
        }
        sc.close();
    }
}
