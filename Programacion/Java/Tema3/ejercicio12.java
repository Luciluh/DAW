
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priNot;
        double segNot;
        double notTot;

        System.out.println("Introduzca la nota del primer examen: ");
        priNot = sc.nextDouble();
        System.out.println("¿Qué nota quiere sacar en el trimestre?");
        notTot = sc.nextDouble();
        segNot=((notTot) - (priNot*0.4))/0.6;
        System.out.printf("Para tener un %.1f en el trismestre necesita sacar un %.2f en el segundo examen", notTot, segNot);
        sc.close();
    }
}
