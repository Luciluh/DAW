/*
Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. 
Se permiten números de hasta 5 cifras.
 */
import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero (de 5 cifras como máximo): ");
        num = sc.nextInt();

        if (num<10) { //numeros de una cifra
            System.out.println("El numero introducido es capicua");
        } else if (num<1000 && (num%10 == num/10) ) { //numeros de dos(XY) y tres cifras (XZY)-> solo serán capicuas si X=Y, por tanto hacemos la igualdad
            System.out.println("El numero introducido es capicua");
        } else if (num<10000 && (num%10 == num/1000) && (((num%100)/10)) == ((num%1000)/100)) {
            System.out.println("El numero introducido es capicua");
        } else if (num<100000 && (num%10 == num/10000) && (((num%100)/10)) == ((num/1000)%10)) {
            System.out.println("El numero introducido es capicua");
        } else{
            System.out.println("El numero introducido NO es capicua");

        }
        sc.close();
    }
}

