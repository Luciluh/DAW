import java.lang.classfile.CodeBuilder;
import java.util.Scanner;

public class EJ38 {
    public static void main(String[] args) {
        
        long num;
        int pares = 0;
        int impares = 0 ;
        long resultado = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero positivo: ");
        num = sc.nextLong();

        while (num>0) {
            resultado = num%10;
            if (resultado%2==0) {
                pares++;
            } else {
                impares++;
            }
            num = num/10;
        }
        System.out.printf("El %d contiene %d digitos pares y %d digitos impares.",num, pares, impares);

        sc.close();

    }
}
