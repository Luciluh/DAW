import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {

        int num;
        int resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero (de 5 cifras como máximo): ");
        num = sc.nextInt();

        if (num>=0 && num < 10) {
            System.out.println("El primer dígito del número introducido es el " + num);
        } else if (num < 100)  {
            resultado = num/10;
            System.out.println("El primer dígito del número introducido es el " + resultado);
        } else if (num < 1000)  {
            resultado = num/100;
            System.out.println("El primer dígito del número introducido es el " + resultado);    
        } else if (num < 10000)  {
            resultado = num/1000;
            System.out.println("El primer dígito del número introducido es el " + resultado);            
        } else if (num < 100000)  {
            resultado = num/10000;
            System.out.println("El primer dígito del número introducido es el " + resultado);            
        }
        sc.close();
    }
}
