import java.util.Scanner;
/*
Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo.

 */

public class ejercicio17 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        num = sc.nextInt();

        if (num <10 && num > -10) {
            System.out.println("El número introducido tiene 1 digito");
        } else if ((num >= 10 && num <= 99) || (num <= -10 && num >=-99)) {
            System.out.println("El número introducido tiene 2 digitos");
        } else if ((num >= 100 && num <= 999) || (num <= -100 && num >= -999)) {
            System.out.println("El número introducido tiene 3 dígitos");
        } else if ((num >= 1000 && num <= 9999) || (num <= -1000 && num >= -9999)) {
            System.out.println("El número introducido tiene 4 dígitos");
        } else if ((num >= 10000 && num <= 99999) || (num <= -10000 && num >= -99999)) {
            System.out.println("El número introducido tiene 4 dígitos");
        } else {
            System.out.println("El número introducido tiene más de 5 dígitos");
        }
            

        sc.close();
    }
}