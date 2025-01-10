import libreria.ArrayLib;

public class Buscar {

    private static final int MAXIMO = 30 ;

    public static void main(String[] args) {
        
        int i ;
        int num ;
        int[] numeros = new int[MAXIMO];
    
        // Rellenamos el array con valores aleatorios
        ArrayLib.rellenar(numeros, 0, 100) ;

        // Mostramos el array
        ArrayLib.mostrar(numeros) ;

        System.out.println();

        // 
        System.out.print("¿Qué valor quieres buscar? ") ;
        num = Integer.parseInt(System.console().readLine()) ; 

        // Buscamos el número en el array
        System.out.println(ArrayLib.buscar(numeros, num)?"SE HA ENCONTRADO!!!":"NO'STÁ :(");



    }
    
}
