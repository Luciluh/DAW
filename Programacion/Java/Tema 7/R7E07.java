import libreria.ArrayLib;
/**
 * 
 */

public class R7E07 {

    private static final int MAXIMO = 100 ;
    
    public static void main(String[] args) {
    
        int numero ;
        int sustituto ;
        int[] numeros = new int[MAXIMO] ;

        // rellenamos el array con valores aleatorios
        ArrayLib.rellenar(numeros, 0, 10);

        // mostramos el array
        ArrayLib.mostrar(numeros) ;

        // solicitamos los valores
        System.out.print("Introduzca un número de los que se han mostrado: ") ;
        numero = Integer.parseInt(System.console().readLine()) ;

        System.out.print("Introduzca el valor por el que quiere sustituirlo: ") ;
        sustituto = Integer.parseInt(System.console().readLine()) ;

        // sustituir en el array el NUMERO por el valor SUSTITUTO
        for(int i=0; i < numeros.length; i++) {
            //System.out.printf("%s  ", (numeros[i] == numero)?"\""+sustituto+"\"":numeros[i]+"" );
            if(numeros[i]==numero) { System.out.printf("\"%d\"  " , sustituto);}
            else                                  { System.out.printf("%d  ", numeros[i]); }
        }

    }
}
