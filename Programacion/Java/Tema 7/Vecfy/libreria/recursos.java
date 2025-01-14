package libreria;

import java.util.Arrays;

public class recursos {

    /**
     * funcion para mostrar el menu
     */
    public static void mostrarMenu (){
            System.out.println("1. Suma acumulativa");
            System.out.println("2. Sumar vectores");
            System.out.println("3. Restar vectores");
            System.out.println("4. Producto escalar");
            System.out.println("5. Calcular frecuencia de un elemento");
            System.out.println("6. Buscar elemento");
            System.out.println("7. Encontrar maximo");
            System.out.println("8. Enconctrar minimo");
            System.out.println("9. Calcular media aritmetica");
            System.out.println("10. Invertir vector");
            System.out.println("11. Comparar vectores");
            System.out.println("12. Eliminar duplicados");
            System.out.println("13. Ordenacion metodo de la burbuja");
            System.out.println("14. Ordenacion por seleccion");
            System.out.println("15. Concatenar vectores");
            System.out.println("0. Salir");
    }

    /**
     * Rellena un array con numeros aleatorios pidiendo el rango de los numeros aleatorios
     * @param a
     * @param min
     * @param max
     */
    public static void rellenarAleatorio(int[]a, int min, int max){

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*(max-min+1)+min);
        }
    }

    /**
     * La funcion muestra el array
     * @param a
     */
    public static void mostrar (int[]a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    /**
     * Sumamos los parametros del array 
     * @param a
     * @return
     */
    public static int sumaAcumulativa (int[]vector){

        int resultado = 0;

        for (int i = 0; i < vector.length; i++) {
            resultado += vector[i];
        }
        return resultado;
    } 


    /**
     * Funcion para sumar dos vectores
     * @param vectorA
     * @param vectorB
     * @return
     */
    public static int[] sumaVectores (int [] vectorA, int [] vectorB){

        int [] resultado = new int[10];

        for (int i = 0; i < vectorA.length; i++) {
            resultado[i] = vectorA[i] + vectorB[i];
        }
        return resultado;
    }

    /**
     * Funcion para restar dos vectores
     * @param vectorA
     * @param vectorB
     * @return
     */
    public static int[] restaVectores (int [] vectorA, int [] vectorB){

        int [] resultado = new int[10];

        for (int i = 0; i < vectorA.length; i++) {
            resultado[i] = vectorA[i] - vectorB[i];
        }
        return resultado;
    }

    /**
     * Funcion para calcular el producto escalar de vectores
     * @param vector
     * @param producto
     * @return
     */
    public static int[] productoEscalar (int[] vector, int producto){

        int resultado [] = new int [10];

        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i]*producto;
        }
        return resultado;
    }


    /**
     * Funcion para calcular la frecuencia de un numero por vector
     * @param vector
     * @param num
     * @return
     */
    public static int calcularFrecuencia (int [] vector, int num){

        int resultado = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i]==num) {
                resultado++;
            }
        }
        return resultado;
    }

    /**
     * Buscamos un numero en el vector
     * @param vector
     * @param num
     * @return
     */
    public static boolean buscarElemento (int [] vector, int num){

        boolean seEncuentra = false;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                seEncuentra = true;
            } 
        }
        return seEncuentra;    
    }

    /**
     * Funcion para calcular el maximo
     * @param vector
     * @return
     */
    public static int maximo(int[]vector){

        int numMaximo = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i]>numMaximo){
                numMaximo=vector[i];
            }
        }
        return numMaximo;
    }

    /**
     * Funcion que calcula el minimo
     * @param vector
     * @return
     */
    public static int minimo(int[]vector){

        int numMinimo = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i]<numMinimo){
                numMinimo=vector[i];
            }
        }

        return numMinimo;
    }

    /**
     * Calcula la media del vector
     * @param vector
     * @return
     */
    public static int mediaAritmetica (int[]vector){

        int resultado = 0;

        resultado = sumaAcumulativa(vector)/10;
        return resultado;
    }

    /**
     * Esta funcion invierte el orden del array
     * @param vector
     * @return
     */
    public static int[] invertir(int[] vector) {
        
        int[] resultado = new int[vector.length];
    
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[vector.length - 1 - i];
        }   
        return resultado;
    }

    /**
     * Funcion que te dice si los valores i del vecto A y B son iguales o no 
     * @param vectorA
     * @param vectorB
     * @return
     */
    public static boolean comparar(int[]vectorA, int[]vectorB){

        boolean sonIguales = true;

        for (int i = 0; i < vectorA.length; i++) {
            if (vectorA[i]!=vectorB[i]) {
                sonIguales=false;
            }
        }
        return sonIguales;
    }

    /**
     * Funcion para eliminar los duplicados 
     * @param vector
     */
    public static int[] eliminarDuplicados (int[]vector){

        int[] resultado = vector;

        for (int i = 0; i < vector.length; i++) {
            int aux = vector[i];
            for (int j = i+1; j < vector.length; j++) {
                if (aux==vector[j]) {
                    resultado[i]=0;
                    resultado[j]=0;
                }
            }
        }
        return resultado;
    }

    /**
     * Esta funcion ordena el vector con el metodo de la burbuja
     * @param vector
     * @param debug
     * @return
     */
    public static int[] burbuja(int[] vector, boolean debug) {
    int[] resultado = vector;
    
    for (int i = 0; i < resultado.length - 1; i++) { 
        for (int j = 0; j < resultado.length - 1 - i; j++) { 
            if (resultado[j] > resultado[j + 1]) {
                int temp = resultado[j];
                resultado[j] = resultado[j + 1];
                resultado[j + 1] = temp;
            }
        }
        
        if (debug==true) {
            System.out.println("Iteración " + (i + 1) + ": " + Arrays.toString(resultado));
        }
    }
    
    return resultado;
}

/**
 * Concatena dos arrays
 * @param vectorA
 * @param vectorB
 * @return
 */
public static void concatenar (int[]vectorA,int[]vectorB){
    // int[] resultado = new int[vectorA.length + vectorB.length];

    for (int i = 0; i < vectorA.length; i++) {
        System.out.print(vectorA[i] + " ");
    }
    for (int i = 0; i < vectorB.length; i++) {
        System.out.print(vectorB[i]+ " ");
    }

}


}
