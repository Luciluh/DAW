import java.util.Scanner;

import libreria.*;
public class vecfy {
    private static final int MAXIMO = 10;
    public static void main(String[] args) {

        int [] vectorA = new int [MAXIMO];
        int [] vectorB = new int [MAXIMO];
        int min;
        int max;
        int opcion = -1;
        Scanner sc = new Scanner(System.in);

    
        do {
            //mostramos menu + preguntamos opcion
            recursos.mostrarMenu();
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
            
            //min y max de los valores del array
            System.out.print("¿Cual quiere que sea el valor minimo para los vectores?: ");
            min = sc.nextInt();
            System.out.print("¿Cual quiere que sea el valor maximo para los vectores?: ");
            max = sc.nextInt();
    
            //inicializamos los arrays a y b
            recursos.rellenarAleatorio(vectorA, min, max);
            recursos.rellenarAleatorio(vectorB, min, max);
    
            //mostramos los vectores
            recursos.mostrar(vectorA);
            recursos.mostrar(vectorB);
    
            //barajamos las opciones dadas
            switch (opcion) {
                case 0:
                System.out.println("Gracias por usar la aplicacion");            
                    break;
                case 1:
                System.out.printf("La suma acumulativa del vector A es: %d\n", recursos.sumaAcumulativa(vectorA));
                System.out.printf("La suma acumulativa del vector B es: %d\n", recursos.sumaAcumulativa(vectorB));
                
                System.out.println("Presione ENTER para continuar");
                sc.nextLine();
                sc.nextLine();
                break;
            
                default:
                    break;
            }





        } while (opcion!=0);
        sc.close();
    }
}
