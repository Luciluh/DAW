import java.util.Scanner;

public class EJ09 {
    public static void main(String[] args) {
        int num [] = new int [8];
        boolean esPrimo = true;
        Scanner sc = new Scanner(System.in);

        //Pedimos 8 numeros por teclado 
        System.out.println("Introduzca 8 numeros enteros, pulse INTRO despues de cada numero:");
        for (int i = 0; i < 8; i++) {
            num [i] = sc.nextInt();
        }

        System.out.println(" ");

        for (int i = 0; i < 8; i++) {
            for (int j = 2; j < num[i]/2; j++) {
                if (num[i]%j==0) {
                    esPrimo = false;
                } else {
                    esPrimo = true;
                }
            }

            if (esPrimo == true) {
                System.out.println(num[i] + " es primo");
            } else {
                System.out.println(num[i] + " NO es primo");
            }
        }




        sc.close();
    }
}
