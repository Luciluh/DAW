import libreria.ArrayLib;

public class R7E10 {

    private static final int MAXIMO = 20 ;

    public static void main(String[] args) {

        int[] numeros = new int[MAXIMO] ;

        // rellenamos con valores aleatorios
        ArrayLib.rellenar(numeros,0, 100) ;

        // mostramos el array
        System.out.println("Array original: ") ;
        ArrayLib.mostrar(numeros) ;

        // ordenamos pares e impares
        ordenarParImpar(numeros) ;

        // mostramos el array
        System.out.println("\nArray con los pares al principio: ") ;
        ArrayLib.mostrar(numeros) ;
    }

    /**
     * @param num
     * @return
     */
    public static boolean esPar(int num) {
        return num%2==0 ;
    }
    
    /**
     * @param numeros
     */
    public static void ordenarParImpar(int[] numeros) {

        int i ;
        int j ;
        int temp ;

        for (i = 0 ; i < numeros.length; i++) {

            if (!esPar(numeros[i])) {

                // cuando el número es impar tengo que buscar un par para reemplazarlo
                j = i + 1 ;
                while ((j < numeros.length) && (!esPar(numeros[j]))) { j++ ; }

                if (j < numeros.length) {
                    temp = numeros[j] ;
                    numeros[j] = numeros[i] ;
                    numeros[i] = temp ;
                }
            }
        }
    }


    /*public static void ordenarParImpar(int[] numeros) {        
    
        int j =  0 ;
        int k = numeros.length - 1 ;
        int[] temporal = numeros.clone() ;

        for(int item : temporal) {
            if (esPar(item)) { numeros[j++] = item ; }
            else                  { numeros[k--] = item ;  }            
        }    
    }*/


    /* public static void ordenarParImpar(int[] numeros) {
        
        int j = 0 ;
        int[] aux = new int[numeros.length] ;

        // recorrer el array para los pares        
        for(int item : numeros) {
            if (item%2==0) { aux[j++] = item ; }
        }

        // recorrer el array para los pares
        for(int item : numeros) {
            if (item%2!=0) { aux[j++] = item ; }
        }

        // actualizamos el array 
    for(j=0; j < numeros.length; j++) { numeros[j] = aux[j] ; }        
    } */

}
