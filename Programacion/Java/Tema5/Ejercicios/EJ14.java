
import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {

        int num ;
        int numAux;
        int resultado = 0 ;
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Introduce un número entero positivo: ");
        num = sc.nextInt();
        numAux = num ; 

        if (num<0) {
            System.out.println("Número introducido incorrecto, debe introducir un número positivo");
        } else {
            for (int i = 0; i < 100; i++) {
                resultado = resultado + num;
                num++;            
            }
            System.out.printf("La suma de los 100 números siguientes a %d es %d", numAux, resultado);
        }
        sc.close();
    }
}
