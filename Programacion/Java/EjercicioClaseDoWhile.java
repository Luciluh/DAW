
import java.util.Scanner;

public class EjercicioClaseDoWhile {
    public static void main(String[] args) {
        
        int num; 
        int total = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca número y pulse ENTER. Para acabar, introduce un numero negativo.");

        do { 


                System.out.print("?");
                num = sc.nextInt();

                if (num>=0) {
                total = total + num;
                contador++;
                }

        }while (num>=0);
                
    

        System.out.printf("Se han introducido %d números en total y la suma de todos ellos es %d", contador,total);

        sc.close();
        }
    }