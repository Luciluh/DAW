import java.util.Scanner;

public class EJ09Par {
    public static void main(String[] args) {
        int num [] = new int [8];
        Scanner sc = new Scanner(System.in);

        //Pedimos 8 numeros por teclado 
        System.out.println("Introduzca 8 numeros enteros, pulse INTRO despues de cada numero:");
        for (int i = 0; i < 8; i++) {
            num [i] = sc.nextInt();
        }

        System.out.println(" ");

        for (int i = 0; i < 8; i++) {
            if (num[i]%2==0) {
                System.out.println(num[i] + " par");
            } else {
                System.out.println(num[i] + " impar");
            }
        }
        sc.close();
    }
}
