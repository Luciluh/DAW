import java.util.Scanner;

public class EJ09 {
    public static void main(String[] args) {

        int num ; 
        int a = 0;
        int b = 1 ;
        int resultado ; 
        Scanner sc = new Scanner(System.in) ;

        System.out.println("N PRIMERO NUMEROS DE LA SERIE DE FIBONACCI");
        System.out.print("Introduce un numero: ");
        num = sc.nextInt();


        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            resultado = a + b ;
            b = a ;
            a = resultado ;        
        }

        sc.close();
    }
}
