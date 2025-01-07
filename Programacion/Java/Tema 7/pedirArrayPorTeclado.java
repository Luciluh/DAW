import java.util.Scanner;

public class pedirArrayPorTeclado {

    /**
     * Funcion para pedir por teclado valores de arrays simples
     * @param array
     */
    public static void pedirArraySimplePorTeclado(int array[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce valores y presiona INTRO para continuar: ");
        for (int i = 0; i < array.length; i++) {
            array [i] = sc.nextInt();
        }
    
    }


    /**
     * Funcion para pedir por teclado valores arrays bidimensionales
     * @param array
     */
    public static void pedirArrayBiPorTeclado(int array[][]){

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) { 
                System.out.printf("Introduce un valor para la celda (i, j) y presiona INTRO para continuar. ", i, j);
                array [i][j] = sc.nextInt();
            }
            
        }
    }


}
