import java.util.Scanner;

public class EJ07 {
    public static void main(String[] args) {
        
        int num [] = new int [100];
        int numEscogido;
        int numSustituir;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            num [i] = (int)(Math.random()*(20-0+1)+0);
            System.out.print(num[i] + " ");
        }

        System.out.println("");
        System.out.println("Introduzca un numero de los que se han mostrado");
        numEscogido = sc.nextInt();
        System.out.println("Introduzca el valor por el que quiere sustituirlo");
        numSustituir = sc. nextInt();

        for (int i = 0; i < 100; i++) {

            if (num [i] == numEscogido) {
                num [i] = numSustituir;
                System.out.printf("\"%d\" ",numSustituir);
            } else {
                System.out.print(num[i] + " ");
            }
        }

        sc.close();
    }
}
