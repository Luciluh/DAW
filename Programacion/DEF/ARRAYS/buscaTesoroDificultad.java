import java.util.Scanner;

public class buscaTesoroDificultad {

    private static final int FILA = 4;
    private static final int COLUMNA = 5;
    
    public static void main(String[] args) {
        
        char[][] tablero;
        boolean[][] disparos = new boolean[FILA][COLUMNA];  // Matriz para registrar los disparos
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("¡BUSCA EL TESORO!\n");

        char vacio = ' ';
        char mina = 'M';
        char tesoro = 'T';
        char disparo = '*';

        // Pedir al usuario la dificultad
        System.out.println("Elige el nivel de dificultad:");
        System.out.println("1. Dificultad 1: Una mina");
        System.out.println("2. Dificultad 2: Dos minas");
        System.out.println("3. Dificultad 3: Tres minas");
        int dificultad = sc.nextInt();

        int minas = 0;
        switch (dificultad) {
            case 1:
                minas = 1;
                break;
            case 2:
                minas = 2;
                break;
            case 3:
                minas = 3;
                break;
            default:
                System.out.println("Opción no válida. Se seleccionará Dificultad 1.");
                minas = 1;
                break;
        }

        // Generar posiciones aleatorias para las minas y el tesoro
        int posiTesoro, posjTesoro;
        int[][] posicionesMinas = new int[minas][2]; // Para almacenar las posiciones de las minas

        // Generar la posición del tesoro
        do {
            posiTesoro = (int)(Math.random() * FILA);
            posjTesoro = (int)(Math.random() * COLUMNA);
        } while (minas == 1 && (posiTesoro == posicionesMinas[0][0] && posjTesoro == posicionesMinas[0][1])); // Evitar que el tesoro esté en una mina

        // Generar las posiciones de las minas
        for (int i = 0; i < minas; i++) {
            int posiMina, posjMina;
            do {
                posiMina = (int)(Math.random() * FILA);
                posjMina = (int)(Math.random() * COLUMNA);
            } while ((posiMina == posiTesoro && posjMina == posjTesoro) || isMinaYaGenerada(posiMina, posjMina, posicionesMinas, i)); // Evitar que las minas coincidan entre ellas o con el tesoro
            posicionesMinas[i][0] = posiMina;
            posicionesMinas[i][1] = posjMina;
        }

        // Mostrar el tablero vacío
        System.out.println();
        mostrarTablero(FILA, COLUMNA, vacio, vacio, vacio, posicionesMinas, posiTesoro, posjTesoro, disparos);


        
        do {
            
            // Pedimos coordenadas
            System.out.print("Coordenada x: ");
            x = FILA - 1 - sc.nextInt(); // Invertir el eje X
            System.out.print("Coordenada y: ");
            y = sc.nextInt();
            System.out.println();
    
            // Comprobamos si el disparo ha tocado una mina
            boolean minaDetonada = false;
            for (int i = 0; i < minas; i++) {
                if (x == posicionesMinas[i][0] && y == posicionesMinas[i][1]) {
                    minaDetonada = true;
                    break;
                }
            }

            if (minaDetonada) {
                System.out.println("¡BOOM! Lo siento has perdido\n");
                mostrarTableroConDisparo(FILA, COLUMNA, vacio, mina, tesoro, disparo, disparos, posicionesMinas, posiTesoro, posjTesoro);


            } else if (x == posiTesoro && y == posjTesoro) {
                System.out.println("ENHORABUENA! Has ganado el tesoro\n");
                mostrarTableroConDisparo(FILA, COLUMNA, vacio, mina, tesoro, disparo, disparos, posicionesMinas, posiTesoro, posjTesoro);


            } else {
                // Marcar el disparo en la matriz
                disparos[x][y] = true;
                
                // Mostrar el tablero con los disparos realizados
                mostrarTableroConDisparo(FILA, COLUMNA, vacio, vacio, vacio, disparo, disparos, posicionesMinas, posiTesoro, posjTesoro);
            }

        } while (!((x == posiTesoro && y == posjTesoro)));

        sc.close();
    }

    /**
     * Función que comprueba si la mina ya ha sido generada
     * @param x Coordenada x de la mina a verificar
     * @param y Coordenada y de la mina a verificar
     * @param posicionesMinas Array que contiene las posiciones de las minas generadas
     * @param minas Número de minas generadas
     * @return true si la mina ya está generada en alguna posición, false en caso contrario
     */
    public static boolean isMinaYaGenerada(int x, int y, int[][] posicionesMinas, int minas) {
        for (int i = 0; i < minas; i++) {
            if (posicionesMinas[i][0] == x && posicionesMinas[i][1] == y) {
                return true;
            }
        }
        return false;
    }

    /**
     * Función que devuelve el tablero con el caracter de relleno que quieras
     * @param FILA
     * @param COLUMNA
     * @param icono
     * @param mina
     * @param tesoro
     * @param posicionesMinas
     * @param posiTesoro
     * @param posjTesoro
     * @return
     */
    public static char[][] mostrarTablero(int FILA, int COLUMNA, char icono, char mina, char tesoro, int[][] posicionesMinas,
            int posiTesoro, int posjTesoro, boolean[][] disparos) {


        char[][] tablero = new char[FILA][COLUMNA];

        // Rellenar el tablero con el icono
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                tablero[i][j] = icono;
            }
        }

        // Asignar minas y tesoro
        for (int i = 0; i < posicionesMinas.length; i++) {
            tablero[posicionesMinas[i][0]][posicionesMinas[i][1]] = mina;
        }
        tablero[posiTesoro][posjTesoro] = tesoro;

        // Mostrar el tablero
        for (int i = 0; i < FILA; i++) {
            System.out.print((FILA - i - 1) + "|");
            for (int j = 0; j < COLUMNA; j++) {
                System.out.print(" " + tablero[i][j]);
            }
            System.out.println();
        }

        // Línea inferior para las columnas
        System.out.print("  ");
        for (int i = 0; i < COLUMNA; i++) {
            System.out.print("--");
        }
        System.out.println();

        // Números de las columnas
        System.out.print("  ");
        for (int i = 0; i < COLUMNA; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        return tablero;
    }

    /**
     * Función que muestra el tablero con los disparos realizados
     * @param FILA
     * @param COLUMNA
     * @param icono
     * @param mina
     * @param tesoro
     * @param disparo
     * @param disparos
     * @param posicionesMinas
     * @param posiTesoro
     * @param posjTesoro
     * @return
     */
    public static char[][] mostrarTableroConDisparo(int FILA, int COLUMNA, char icono, char mina, char tesoro, 
        char disparo, boolean[][] disparos, int[][] posicionesMinas, int posiTesoro, int posjTesoro) {


        char[][] tablero = new char[FILA][COLUMNA];

        // Rellenar el tablero con el icono
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                tablero[i][j] = icono;
            }
        }

        // Asignar minas y tesoro
        for (int i = 0; i < posicionesMinas.length; i++) {
            tablero[posicionesMinas[i][0]][posicionesMinas[i][1]] = mina;
        }
        tablero[posiTesoro][posjTesoro] = tesoro;

        // Marcar los disparos
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                if (disparos[i][j]) {  // Si ha habido un disparo en esa posición
                    tablero[i][j] = disparo;
                }
            }
        }

        // Mostrar el tablero
        for (int i = 0; i < FILA; i++) {
            System.out.print((FILA - i - 1) + "|");
            for (int j = 0; j < COLUMNA; j++) {
                System.out.print(" " + tablero[i][j]);
            }
            System.out.println();
        }

        // Línea inferior para las columnas
        System.out.print("  ");
        for (int i = 0; i < COLUMNA; i++) {
            System.out.print("--");
        }
        System.out.println();

        // Números de las columnas
        System.out.print("  ");
        for (int i = 0; i < COLUMNA; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        return tablero;
    }
}
