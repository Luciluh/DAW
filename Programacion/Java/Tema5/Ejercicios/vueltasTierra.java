import java.util.Scanner;

public class vueltasTierra {
    public static void main(String[] args) {
        
        long años ; 
        long vueltas = 0 ; 
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Introduzca un numero de años: ");
        años = sc.nextLong();

       vueltas = años * 365;
    

        System.out.printf("La tierra ha dado un total de %d vueltas en %d años", vueltas, años);

        sc.close();
    }
}
