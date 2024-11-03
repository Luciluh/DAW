
import java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) {

        int dia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia de la semana");
        dia = sc.nextInt();

            switch (dia) {
                case 1,2,3,4,5: System.out.println("Es un dia entre semana");
                    break;
                case 6,7: System.out.println("Es fin de semana");
                    break;
                default:
                System.out.println("Este valor no corresponde a ningun dia");
            }

            /*
             * En otras versiones de java y en php no podemos ponerlo asi (case 1,2,3,4..) por lo que lo pondremos:
             * case1:
             * case2:
             * case3:
             * case4: System.out.println("Es un dia entre semana");
             * break;
             * 
             * De esta forma desde caso 1 hasta caso 4 imprimirá "Es un dia entre semana" hasta que se encuentre un brake; 
             */


        sc.close();


        }
        
    }
    
