package Apuntes;
public class Temperaturas {

    private static final int DIAS = 372; //suponiendo que todos los meses tienen 31 dias
    public static void main(String[] args) {
        
        double[] numeros = new double[DIAS];
        double suma = 0.0;
        /* Es lo mismo que: 
        int[] numeros; 
        numeros = new int[MAXIMO];
        */


        for (int i = 0; i < DIAS; i++) {
            numeros [i] = (Math.random() * 45) ; 
            suma += numeros[i];
            //Llenamos el array entre valores aleatorios de 0 y 9
            System.out.printf("Las temperaturas durante el año son: %.2f\n ", numeros[i]);
            
        }
        System.out.println("La media de las temperaturas son: " + suma/DIAS);

        //Llamamos a la funcion
        mostrarMes(numeros,11);
    }
        //lA FUNCION MUESTRA LAS TEMPERATURA DE UN MES DADO 
        /*
        Las funciones pueden:
            - Recibir parametros de dos tipos:
                * PArametros por valor (por defecto)
                * Parametros por referencia (arrays y objetos)
            - Devuelven un valor (opcional)
         */
        /*
         * Array unidimensional - Vector
         * Array bidimensional - Tabla/Matriz
         */

         //CUIDADO: ArrayIndexOutBoundsException es un error común y nos dice:
         // Nos hemos excedido en el limite del array. 
    /**
     * 
     * PARA CREAR ESTO ES /** + ENTER 
     * @param datos
     * @param mes
     */
    public static void mostrarMes (double[] datos, int mes){
        
        int ini = (mes-1)*31 ;
        int fin = ini + 31;

        for (int i = ini; i < fin; i++) {
            System.out.printf("Las temperaturas del mes son: %.3f\n",datos[i]);            
        }


        }
    
}
