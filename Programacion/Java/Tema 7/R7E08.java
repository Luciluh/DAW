/**
 *  
 */
public class R7E08 {

    private static final int MAXIMO = 12 ;
    
    public static void main(String[] args) {

        int i ;
        int j ;
        //int[] meses = new int[MAXIMO] ;
        int[] meses = {6, 10, 15, 20, 24, 30, 35, 36, 31, 21, 12, 7} ;
        String[] nombres = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"} ;

        // leemos la media de temperaturas de cada mes
        //for(i = 0; i < meses.length; i++) {
        //    System.out.printf("Introduzca la temperatura media de %s: ", nombres[i]) ;
        //    meses[i] = Integer.parseInt(System.console().readLine()) ;
       // }

        // mostramos la gráfica
        for(i=0; i < meses.length; i++) {

            // mostramos el nombre del mes
            System.out.printf("%15s | ", nombres[i]) ;

            // mostramos las barras por cada mes
            for(j = 1; j <= meses[i]; j++) { System.out.print("▄"); }

            // mostramos la temperatura media
            System.out.printf("  %dº C\n", meses[i]) ;
        }
    }
}
