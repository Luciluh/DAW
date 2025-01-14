

public class EJ25 {

    private static final int FILA = 4;
    private static final int COLUMNA = 5;
    private static final int MAX = 999;
    private static final int MIN = 100;


    public static void main(String[] args) {

        int num[][] = new int[FILA][COLUMNA];
        int suma = 0;
        int sumaTotal = 0;

        // Llenamos el array de numeros aleatorios
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                num[i][j] = (int)(Math.random()*(MAX-MIN+1)+MIN);
            }
        }

        // Mostramos el array y la suma de las filas
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                System.out.printf("%6d", num[i][j]); // Cada número ocupa 6 espacios para alinear
                suma += num[i][j];
                sumaTotal += num[i][j]; // Sumar directamente al total
            }
            System.out.printf(" |%6d\n", suma); // Mostrar suma de la fila
            suma = 0; // Reiniciar suma para la siguiente fila
        }

        // Línea divisoria para separar filas de columnas
        System.out.println("----------------------------------------------"); // Línea adaptada al formato

        // Mostramos la suma de las columnas
        for (int i = 0; i < COLUMNA; i++) {
            for (int j = 0; j < FILA; j++) {
                suma += num[j][i];
            }
            System.out.printf("%6d", suma); // Cada suma ocupa 6 espacios para alinear
            suma = 0; // Reiniciar suma para la siguiente columna
        }
        System.out.printf(" |%6d\n", sumaTotal); // Mostrar la suma total al final

    }
}
