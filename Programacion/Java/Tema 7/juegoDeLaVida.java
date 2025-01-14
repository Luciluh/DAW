import java.util.Scanner;

public class juegoDeLaVida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tamaño de la cuadrícula
        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        // Inicialización de la cuadrícula
        boolean[][] cuadricula = new boolean[filas][columnas];

        System.out.println("Introduce la cuadrícula inicial (1 para célula viva, 0 para célula muerta):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                cuadricula[i][j] = sc.nextInt() == 1;
            }
        }

        System.out.print("Introduce el número de generaciones a simular: ");
        int generaciones = sc.nextInt();

        // Simular generaciones
        for (int g = 0; g < generaciones; g++) {
            System.out.println("Generación " + (g + 1) + ":");
            imprimirCuadricula(cuadricula);
            cuadricula = siguienteGeneracion(cuadricula);
        }

        sc.close();
    }

    // Generar la siguiente generación
    private static boolean[][] siguienteGeneracion(boolean[][] cuadricula) {
        int filas = cuadricula.length;
        int columnas = cuadricula[0].length;
        boolean[][] nuevaCuadricula = new boolean[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int vecinosVivos = contarVecinosVivos(cuadricula, i, j);

                // Aplicar las reglas del juego
                if (cuadricula[i][j]) {
                    // Regla 1 y 3: Una célula viva con menos de 2 o más de 3 vecinos vivos muere
                    nuevaCuadricula[i][j] = vecinosVivos == 2 || vecinosVivos == 3;
                } else {
                    // Regla 4: Una célula muerta con exactamente 3 vecinos vivos revive
                    nuevaCuadricula[i][j] = vecinosVivos == 3;
                }
            }
        }

        return nuevaCuadricula;
    }

    // Contar vecinos vivos
    private static int contarVecinosVivos(boolean[][] cuadricula, int fila, int columna) {
        int contador = 0;
        int filas = cuadricula.length;
        int columnas = cuadricula[0].length;

        // Direcciones posibles (8 alrededor)
        int[] desplazamientoFila = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] desplazamientoColumna = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int nuevaFila = fila + desplazamientoFila[i];
            int nuevaColumna = columna + desplazamientoColumna[i];

            if (nuevaFila >= 0 && nuevaFila < filas && nuevaColumna >= 0 && nuevaColumna < columnas && cuadricula[nuevaFila][nuevaColumna]) {
                contador++;
            }
        }

        return contador;
    }

    // Imprimir la cuadrícula
    private static void imprimirCuadricula(boolean[][] cuadricula) {
        for (boolean[] fila : cuadricula) {
            for (boolean celula : fila) {
                System.out.print(celula ? "⬛" : "⬜");
            }
            System.out.println();
        }
    }
}
