/**
 * PROGRAMACIÓN
* Tema 7 - Arrays
 * Antonio J. Sánchez
 * curso 2024|25
 */

public class Arrays {

    private static final int MAXIMO = 50 ;

    public static void main(String[] args) {

        float suma ;

        /* int[] numeros ;                 // definimos un array de números enteros que se llama numeros
        numeros = new int[3] ;  // reserva memoria para 3 valores de tipo entero.

        int[] datos = {0, 3, 0, 3, 4, 5, 6, 7 , 8, 9} ; // definimos, creamos e inicializamos un array    

        System.out.println("Introduce tres valores y pulsa enter tras cada uno de ellos: ");
        numeros[0] = Integer.parseInt(System.console().readLine()) ;    // guardamos un valor en la celda 0
        numeros[1] = Integer.parseInt(System.console().readLine()) ;     // guardamos un valor en la celda 1
        numeros[2] = Integer.parseInt(System.console().readLine()) ;    // guardamos un valor en la celda 2

        // mostramos los valores del array
        System.out.printf("Los valores del array son: %d, %d, %d\n", numeros[0], numeros[1], numeros[2]) ;

        // sumamos los valores del array
        suma = (numeros[0] + numeros[1] + numeros[2]) / 3f ;
        System.out.printf("El resultado de la suma es: %.3f\n", suma) ;
        
        // cambiamos el valor de la posición 5 del array datos
        System.out.print("Dame un valor para la posición 5 del array datos: ");
        datos[5] = Integer.parseInt(System.console().readLine()) ; */

        int[] numeros  = new int[MAXIMO] ;        
        int[][] bidimensional = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} } ;

        // inicializamos el array con valores aleatorios
        for(int i=0; i < numeros.length; i++) {  numeros[i] = (int) (Math.random() * 20) ; }

        System.out.println("Los valores del array unidimensional son: ") ; 
        //for(int i=0; i < MAXIMO; i++) { System.out.print(numeros[i] + "  ") ; }
        for(int item : numeros) { System.out.print(item + "  ") ; }


        System.out.println("Los valores del array bidimensional son: ") ; 

        for(int[] fila: bidimensional) {
            for(int item: fila) {
                System.out.printf("%d  ", item) ;
            }
        }
        
    }

}