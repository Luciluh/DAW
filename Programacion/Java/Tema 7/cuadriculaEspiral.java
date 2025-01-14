public class cuadriculaEspiral {

    private static final int FILA = 5;
    private static final int COLUMNA = 5;
    public static void main(String[] args) {
        
        int cuadricula [][] = new int[FILA][COLUMNA];
        int num = 0;


        //Im
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                cuadricula[i][j]= num;
                System.out.printf(" %2d ",cuadricula[i][j]);
                num++;
            }
            System.out.println();
        }

        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j < 4; j++) {
                cuadricula[i][j] = cuadricula[i+1][j+1];

            }
        }
    }
}
