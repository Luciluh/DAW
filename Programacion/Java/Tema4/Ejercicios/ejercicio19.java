
import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {

        float nota1;
        float nota2;
        float media;
        String aptoNoApto;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota del primer examen: ");
        nota1 = sc.nextFloat();
        System.out.print("Nota del segundo examen: ");
        nota2 = sc.nextFloat();

        media = (nota1+nota2)/2;

        if (media>5) {
            System.out.printf("Tu nota en programación es %.1f ", media);
        } else if (media<5) {
            sc.nextLine();//hay que hacer doble sc.nextLine() cuando antes hemos operado con numeros 
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            aptoNoApto = sc.nextLine();
            if ((aptoNoApto.equals("apto"))) {
                System.out.println("Tu nota en programación es 5");
            } else {
                System.out.printf("Tu nota en programación es %.1f", media);
            }
        }
        sc.close();
    }
}
