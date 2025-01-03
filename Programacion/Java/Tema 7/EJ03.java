
import java.util.Scanner;

public class EJ03 {
    public static void main(String[] args) {

        int [] num = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, introduzca 10 numeros enteros.\nPulse la tecla INTRO despues de introducir cada numero");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();        
        }

        System.out.println("Los numeros introducidos, al reves, son los siguientes: ");

        for (int j = 9; j >= 0; j--) {
            System.out.println(num[j]);
        }

        sc.close();
    }
}
