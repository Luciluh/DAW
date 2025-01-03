import java.util.Scanner;

public class EJ06 {
    public static void main(String[] args) {
        
        int num [] = new int [15];
        int numRotado [] = new int [15];
        Scanner sc = new Scanner(System.in);

        System.out.println("Vaya introducioendo numeros enteros y pulsando INTRO");
        for (int i = 0; i < 15; i++) {
            num [i] = sc.nextInt();
        }

        System.out.println("Array original:");

        for (int i = 0; i < 15; i++) {
            if (i!=14) {
                System.out.printf("| %d ", i);
            }
            if (i==14) {
                System.out.printf("| %d |\n", i);
            }
        }

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < 15; i++) {
            if (i!=14) {
                System.out.printf("| %d ", num[i]);
            }
            if (i==14) {
                System.out.printf("| %d |\n", num[i]);
            }
        }
        
        
        for (int i = 0; i < 15; i++) {

            if (i != 14) {
                numRotado[i + 1] = num [i];
            }

            if (i == 14) {
                numRotado[0] = num[14];
            }
        }

        System.out.println("Array rotado a la derecha una posicion:");

        for (int i = 0; i < 15; i++) {
            if (i!=14) {
                System.out.printf("| %d ", i);
            }
            if (i==14) {
                System.out.printf("| %d |\n", i);
            }
        }

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < 15; i++) {
            if (i!=14) {
                System.out.printf("| %d ", numRotado[i]);
            }
            if (i==14) {
                System.out.printf("| %d |\n", numRotado[i]);
            }
        }
    

        sc.close();
    }
}
