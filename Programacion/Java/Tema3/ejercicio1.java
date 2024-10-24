
/*
 * Realiza un programa que pida dos numeros enteros y que luego muestre el resultado 
 * de la multiplicacion
 */
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num1;
    int num2; 
    int resultado;

    System.out.println("Este programa multiplica dos numeros enteros.");
    System.out.println("Por favor, introduzca el primer numero: ");
    num1 = scanner.nextInt();
    System.out.println("Introduzca el segundo numero: ");
    num2 = scanner.nextInt();
    resultado=num1*num2;
    /*OPCION2:   System.out.println(num1 + " * " + num2 + " = " + resultado);*/
    System.out.printf("%d * %d = %d\n", num1,num2,resultado);
    scanner.close();

    }
}
