package Apuntes;
public class Arrays_Bidimensional {
    
    private static final int DIAS = 31; //suponiendo que todos los meses tienen 31 dias
    private static final int MESES = 12; //suponiendo que todos los meses tienen 31 dias
    public static void main(String[] args) {
        
        double[] [] temperaturas = new double[MESES][DIAS];
        double suma = 0.0;
        double numeros[]= {1,2};
        
        int [][] bidimensional = {{1,2,3},{4,5,6},{7,8,9}};

        //MESES SON LAS FILAS Y LOS DIAS LAS COLUMNAS

        for (int fila = 0; fila < MESES; fila++) {
            for (int columna = 0; columna < DIAS; columna++) {
                temperaturas[fila][columna] = Math.random()*45;
            }
            
        }

        //HACER EL FOREACH
        for (double item : numeros) {
            System.out.println(""+item);
        }




        //llamamos a la funcion
        mostrarMes(temperaturas, MESES);
    }

    /**
     * 
     * @param datos
     * @param mes
     */
    public static void mostrarMes (double [][] datos, int mes){
        for (int i = 0; i < DIAS; i++) {
            System.out.printf("%.3f",datos[mes-1][i]);
        }




        
    

    }
    
}
