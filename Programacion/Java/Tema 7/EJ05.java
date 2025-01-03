import java.util.Scanner;

public class EJ05 {
    public static void main(String[] args) {
        
        int num [] = new int [10];
        int esMaximo = Integer.MIN_VALUE;
        int esMinimo = Integer.MAX_VALUE; //para dar el maximo valor de la variable
        Scanner sc = new Scanner(System.in);

        System.out.println("Vaya introduciendo números enteros y pulsando INTRO");
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();

            if (num[i]> esMaximo) {
                esMaximo = num[i];
            }
            if (num[i]< esMinimo) {
                esMinimo = num[i];
            }
        }

        for (int j = 0; j < 10; j++) {
            if (num[j]==esMaximo) {
                System.out.println(num[j] + " maximo");
            } else if (num[j]==esMinimo) {
                System.out.println(num[j] + " minimo");
            } else {
            System.out.println(num[j]);
            }
        }

        sc.close();
    }
}
