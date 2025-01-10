import libreria.MathLib;

public class R7E29 {

    private static final int FILAS = 4 ;
    private static final int COLUMNAS = 5 ;

    private static final char VACIO = ' ' ;
    private static final char DISPARO = 'X' ;
    private static final char TESORO = '€' ;
    private static final char MINA = '*' ;

    public static void main(String[] args) {

        int x ;
        int y ;
        boolean terminado = false ;
        char[][] tablero = new char[FILAS][COLUMNAS] ;

        // inicializamos el tablero
        inicializar(tablero) ;

        // comienza el juego!
        System.out.println("¡BUSCA EL TESORO!") ;

        do {

            mostrarTablero(tablero, terminado) ;

            System.out.print("Coordenada x: ");
            x = Integer.parseInt(System.console().readLine()) ;
            System.out.print("Coordenada y: ");
            y = Integer.parseInt(System.console().readLine()) ;

            


            terminado = true ;

        } while (!terminado) ;

        // mostramos el tablero final
        mostrarTablero(tablero, terminado) ;
    }

    /**
     * Vacía el tablero
     * @param tablero
     */
    public static void vaciar(char[][] tablero) {
        for(int f = 0; f < FILAS; f++) {
            for(int c = 0; c < COLUMNAS; c++) { tablero[f][c] = VACIO ;  }
        }
    }

    /**
     * Coloca un elemento en el tablero
     * @param tablero
     * @param item
     */
    public static void colocar(char[][] tablero, char item) {

        int fila ;
        int columna ;

        do {
            fila = MathLib.aleatorio(0, FILAS - 1) ;
            columna = MathLib.aleatorio(0, COLUMNAS - 1) ;
        } while (tablero[fila][columna] != VACIO) ;

        // 
        tablero[fila][columna] = item ;
    }

    /**
     * Rellenamos el tablero
     * @param tablero
     */
    public static void inicializar(char[][] tablero) {

        // vaciar el tablero
        vaciar(tablero) ;

        // colocamos el tesoro 
        colocar(tablero, TESORO) ;

        // colocamos la mina
        colocar(tablero, MINA) ;
    }

    /**
     * Muestra el tablero en pantalla
     * @param tablero
     */
    public static void mostrarTablero(char[][] tablero, boolean fin) {

        for(int f = 0 ; f < FILAS; f++) {

            System.out.printf("%d | " , FILAS - f - 1) ;

            for(int c = 0 ; c < COLUMNAS; c++) {

                // Mostramos todo el tablero o únicamente las casillas vacías y disparos
                if (fin) {
                    System.out.printf("%c ", tablero[f][c]) ;
                } else {
                    if ((tablero[f][c] == VACIO) || (tablero[f][c] == DISPARO)) {
                        System.out.printf("%c ", tablero[f][c]) ;
                    }
                }
            }

            System.out.println();
        }

        // mostramos la barra de separación
        System.out.print("   ") ;
        for(int c = 0; c < COLUMNAS; c++) { System.out.print("--") ; }

        // mostramos el número de las columnas
        System.out.print("\n   ") ;
        for(int c = 0; c < COLUMNAS; c++) { System.out.printf("%d ", c) ; }
    }
    
}
