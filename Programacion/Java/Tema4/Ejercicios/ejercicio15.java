import java.util.Scanner;
/*
Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
Ejemplo I:
Introduce un número entero: 1972
El último dígito del número introducido es el 2

Ejemplo II:
Introduce un número entero: 0
El último dígito del número introducido es el 0

 */
public class ejercicio15 {
    public static void main(String[] args) {

        int num;
        int resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        num = sc.nextInt();

        resultado = num%10;

        System.out.println("El último dígito del número introducido es el " + resultado);

        sc.close();
    }
}
