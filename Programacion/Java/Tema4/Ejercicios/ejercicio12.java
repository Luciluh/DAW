import java.util.Scanner;
/*
Realiza un programa que diga si un número entero introducido por teclado es par y/o divisible entre 5.
Ejemplo I:
Introduce un número entero: 19
El número introducido es impar y no es divisible entre 5.

 */
public class ejercicio12 {
    public static void main(String[] args) {

        int num;
        String solucion;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        num = sc.nextInt();

        if (num%2==0) {
            solucion = "es par";
        } else {
            solucion = "es impar";
        }

        if (num%5==0) {
            solucion = solucion + " y es divisible entre 5";
        } else {
            solucion = solucion + " y NO es divisible entre 5";
        }

        System.out.println("El numero introducido " + solucion);

        sc.close();
    }
}

/*
Podriamos haber hecho el ejercicio con operadores ternarios y sería mucho mas rapido, quedaria algo como:

String divisor;
String paridad;

paridad = (num % 2 == 0) ? "es par" : "es impar";
divisor = (num % 5 == 0) ? " es divisor" : "NO es divisor";

System.out.printf("El numero introducido %s y %s", paridad, divisor);

*/