import java.util.Scanner;

public class esPrimo {
    public static void main(String[] args) {

        int num ;
        boolean esPrimo = true ; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para ver si es primo o no");
        num = sc.nextInt() ; 

        for (int i = 2; i < (num-1); i++) {
            esPrimo = false ;
        }

        if (esPrimo) {
            System.out.println("El numero es primo");
        }else {
            System.out.println("El numero NO es primo");
        }
        sc.close();
    }
}
