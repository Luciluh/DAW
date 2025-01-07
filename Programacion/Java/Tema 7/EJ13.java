import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {

        int numOri[] = new int[100];
        int minMax;
        int destacado = -1;
        Scanner sc = new Scanner(System.in);

        // Generamos números aleatorios y los mostramos
        for (int i = 0; i < numOri.length; i++) {
            numOri[i] = (int) (Math.random() * 500); // Genera números entre 0 y 499
            System.out.print(numOri[i] + " ");
        }
        System.out.println();

        // Pedimos al usuario qué destacar
        System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
        minMax = sc.nextInt();

        // Determinamos el mínimo o el máximo del array
        destacado = numOri[0]; // Inicializamos con el primer elemento
        for (int i = 1; i < numOri.length; i++) {
            if (minMax == 1 && numOri[i] < destacado) {
                destacado = numOri[i]; // Actualizamos si encontramos un valor menor
            } else if (minMax == 2 && numOri[i] > destacado) {
                destacado = numOri[i]; // Actualizamos si encontramos un valor mayor
            }
        }

        // Mostramos el array con el valor destacado
        for (int i = 0; i < numOri.length; i++) {
            if (numOri[i] == destacado) {
                System.out.printf("**%d** ", numOri[i]);
            } else {
                System.out.printf("%d ", numOri[i]);
            }
        }
        System.out.println();

        sc.close();
    }
}
