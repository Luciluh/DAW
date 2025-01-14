public class EJ27 {

    private static final int FILA = 6;
    private static final int COLUMNA = 10;
    private static final int MAX = 1000;
    private static final int MIN = 0;

    public static void main(String[] args) {
        int num[][] = new int[FILA][COLUMNA];
        int auxMax = MIN;
        int auxMin = MAX;
        int iMax = 0;
        int jMax = 0;
        int iMin = 0;
        int jMin = 0;

        // Imprimir cabecera de columnas
        System.out.print("    "); // Espacio para alinear con los índices de fila
        for (int j = 0; j < COLUMNA; j++) {
            System.out.printf("%6d", j);
        }
        System.out.println(); // Salto de línea
        System.out.println("    " + "---------------------------------------------------------------"); // Línea separadora

        // Rellenamos el array
        for (int i = 0; i < FILA; i++) {
            System.out.printf("%2d |", i); // Índice de la fila
            for (int j = 0; j < COLUMNA; j++) {
                num[i][j] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
                System.out.printf("%6d", num[i][j]);
            }
            System.out.println("");
        }

        // Buscamos el máximo y el mínimo
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                if (num[i][j] > auxMax) {
                    auxMax = num[i][j];
                    iMax = i;
                    jMax = j;
                }
                if (num[i][j] < auxMin) {
                    auxMin = num[i][j];
                    iMin = i;
                    jMin = j;
                }
            }
        }
        System.out.println();
        System.out.printf("El máximo es %d y está en la fila %d, columna %d\n", auxMax, iMax, jMax);
        System.out.printf("El mínimo es %d y está en la fila %d, columna %d\n", auxMin, iMin, jMin);
    }
}
