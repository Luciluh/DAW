package libreria;

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
        System.out.print("El vector es: ");
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

    public static boolean buscarElemento (int [] vector, int num){

        boolean seEncuentra = true;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != num) {
                seEncuentra = false;
            } else {  
                seEncuentra = true;
            }
        }

        return seEncuentra;
    }
}
