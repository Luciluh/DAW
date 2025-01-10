package libreria;

public class ArrayLib {

    /**
     * @param numeros
     */
    public static void mostrar(int[] numeros) {
        for(int i = 0; i < numeros.length ; i++) { System.out.printf("%d  ", numeros[i]) ; }
    }

    /**
     * @param numeros
     */
    public static void rellenar(int[] numeros, int minimo, int maximo) {
        for(int i=0; i < numeros.length; i++) { numeros[i] = (int) (Math.random() * (maximo-minimo) + minimo) ; }
    }

    /**
     * @param numeros
     * @param valor
     * @return
     */
    public static boolean buscar(int[] numeros, int valor) {
        
        int  i = 0 ;
        while ((i < numeros.length) && (numeros[i] != valor )) { i++ ;  }

        return (i < numeros.length);
    }

    /**
     * Lee un array numérico
     * @param numeros
     */
    public static void leer(int[] numeros) throws NumberFormatException {

        try { 
            for(int i = 0; i < numeros.length ; i++) {
                numeros[i] = Integer.parseInt(System.console().readLine()) ;
            }
        } catch(NumberFormatException excepcion) {
            throw excepcion ;
        } 
    }


    
}
