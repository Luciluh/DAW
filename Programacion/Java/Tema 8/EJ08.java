import java.util.Scanner;

public class EJ08 {
    public static void main(String[] args) {
        
        int num; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero para convertirlo en codigo morse: ");
        num = sc.nextInt();

        System.out.printf("El %d es el %s en morse.", num, EJ08_Funcion.convierteEnMorse(num));

        sc.close();
    }
}
