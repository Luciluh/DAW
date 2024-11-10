import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        float base;
        float exponente;
        double resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cálculo de una potencia\nIntroduzca la base: ");
        base= sc.nextFloat();

        System.out.print("Introduzca el exponente: ");
        exponente= sc.nextFloat();

        resultado = Math.pow(base, exponente);

        System.out.printf("%.0f ^ %.0f = %.0f", base,exponente,resultado);
        sc.close();
    }
}
