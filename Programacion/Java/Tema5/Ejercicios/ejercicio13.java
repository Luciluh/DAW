import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

        boolean esPrimo = true ;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        for (int i = 2; i < num/2; i++) {
            if (num%i==0) {
                esPrimo = false;
            }
        }

        if (!esPrimo) { //la ! indica que es primo es falso
            System.out.println("El numero NO ES PRIMO");
        } else{
            System.out.println("El numero ES PRIMO");
        }
        sc.close();
    }
}
