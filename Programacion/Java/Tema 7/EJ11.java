import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        int num [] = new int[10];
        int aux [] = new int[10];
        boolean esPrimo = true;
        Scanner sc = new Scanner(System.in);

        //Bucle para el array original
        for (int i = 0; i < num.length; i++) {
            num [i] = sc.nextInt();
        }
        
        //Mostramos array original
        System.out.println("Array original:");
        mostrarArrayConIndice.mostrarArrayConIndice(num);


        //Bucle para el array con los primos principio
        System.out.println("Array con los primos primero:");
        for (int i = 0; i < num.length; i++) {
            esPrimo=true;
            for (int j = 2; j < num[i]; j++) {
                if (num[i]%j==0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.print(num[i] + " ");
            }
        }

        for (int i = 0; i < num.length; i++) {
            esPrimo=true;
            for (int j = 2; j < num[i]; j++) {
                if (num[i]%j==0) {
                    esPrimo = false;
                }
            }
            if (!esPrimo) {
                System.out.print(num[i] + " ");
            }
        }
        
        sc.close();
    }
}
