import java.util.InputMismatchException;
import libreria.ArrayLib ;
/**
 * 
 */


public class R7E06 {

    private static final int MAXIMO = 15 ;

    public static void main(String[] args) {
    
        //int[] numeros = new int[MAXIMO] ;
        int[] numeros =  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 } ;

        try {

            System.out.println("Vaya introduciendo números enteros y pulsando INTRO: ");

            // leemos los valores y los guardamos en el array
            //ArrayLib.leer(numeros) ;

            // mostramos el contenido del array
            System.out.print("Array original: ");
            ArrayLib.mostrar(numeros) ;

            // rotamos el array
            rotar(numeros) ;            

            // mostramos el contenido del array
            System.out.print("\nArray rotado una posición a la derecha: ");
            ArrayLib.mostrar(numeros) ;

        } catch(NumberFormatException excepcion) {
            System.out.println("Introduce únicamente valores de tipo entero.") ;
        }
    }

    /**
     * Rotamos una posición a la derecha
     * @param numeros
     */
    public static void rotar(int[] numeros) {

        int i ;
        int ultimo = numeros[numeros.length-1] ;    // guardamos el último valor del array

        for(i = numeros.length - 1; i > 0; i--) { numeros[i] = numeros[i-1] ; }
        numeros[0] = ultimo ;
    }
  
}