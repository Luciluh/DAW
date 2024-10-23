
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;

        System.out.println("Introduzca el numero de horas trabajadas durante la semana: ");
        horas = sc.nextInt();
        int salario = horas*12;
        System.out.printf("Su salario semanal es de %d euros.", salario);
        sc.close();
    }
}
