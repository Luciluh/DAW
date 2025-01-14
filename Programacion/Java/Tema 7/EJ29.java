import java.util.Scanner;

public class EJ29 {

    private static final int FILA = 4;
    private static final int COLUMNA = 5;
    public static void main(String[] args) {
        
        char[][] tablero = new char[FILA][COLUMNA];
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("¡BUSCA EL TESORO!\n");

        char vacio = ' ';
        char mina = 'M';
        char tesoro = 'T';
        char disparo = '*';

        // Generar posiciones aleatorias para la mina y el tesoro
        int posiMina = (int)(Math.random() * FILA);
        int posjMina = (int)(Math.random() * COLUMNA);
        int posiTesoro, posjTesoro;

        do {
            posiTesoro = (int)(Math.random() * FILA);
            posjTesoro = (int)(Math.random() * COLUMNA);
        } while (posiTesoro == posiMina && posjTesoro == posjMina);
        
        // Llamar a la función para mostrar el tablero vacio
        mostrarTablero(FILA, COLUMNA, vacio, vacio, vacio, posiMina, posjMina, posiTesoro, posjTesoro); //tengo que poner vacio en mina y tesoro antes de acabar
        
        do {
            
            //Pedimos coordenadas
            System.out.print("Coordenada x: ");
            x = FILA - 1 - sc.nextInt(); //HAY QUE RECORDAR QUE INVERTIMOS EL EJE X, Y SINO HACEMOS ESTE AJUSTE NO CONCUERDA
            System.out.print("Coordenada y: ");
            y = sc.nextInt();
    
            //Comprobamos que la coordenada no coincida con la mina o el tesoro
            if ((x == posiMina) && (y ==posjMina)) {
                System.out.println("¡BOOM! Lo siento has perdido\n");
                mostrarTablero(FILA, COLUMNA, disparo, mina, tesoro, posiMina, posjMina, posiTesoro, posjTesoro);
            } else if ((x == posiTesoro) && (y ==posjTesoro)) {
                System.out.println("ENHORABUENA! Has ganado el tesoro\n");
                mostrarTablero(FILA, COLUMNA, disparo, mina, tesoro, posiMina, posjMina, posiTesoro, posjTesoro);
            } else {
                mostrarTableroConDisparo(FILA, COLUMNA, vacio, vacio, vacio, disparo, x, y, posiMina, posjMina, posiTesoro, posjTesoro);
            }

        } while (!((x == posiMina && y == posjMina) || (x == posiTesoro && y == posjTesoro)));





        sc.close();
    }


        /**
         * Funcion que devuelve el tablero con el caracter de relleno que quieras
         * @param FILA
         * @param COLUMNA
         * @param icono
         * @param mina
         * @param tesoro
         * @param posiMina
         * @param posjMina
         * @param posiTesoro
         * @param posjTesoro
         * @return
         */
        public static char[][] mostrarTablero(int FILA, int COLUMNA, char icono, char mina, char tesoro,
        int posiMina, int posjMina, int posiTesoro, int posjTesoro) {

        char[][] tablero = new char[FILA][COLUMNA];

        // Rellenar el tablero con el icono
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
        tablero[i][j] = icono;
        }
        }

        // Asignar mina y tesoro
        tablero[posiMina][posjMina] = mina;
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
         * 
         * @param FILA
         * @param COLUMNA
         * @param icono
         * @param mina
         * @param tesoro
         * @param disparo
         * @param x
         * @param y
         * @param posiMina
         * @param posjMina
         * @param posiTesoro
         * @param posjTesoro
         * @return
         */
        public static char[][] mostrarTableroConDisparo(int FILA, int COLUMNA, char icono, char mina, char tesoro,char disparo,int x, int y,int posiMina, int posjMina, int posiTesoro, int posjTesoro) {

        char[][] tablero = new char[FILA][COLUMNA];

        // Rellenar el tablero con el icono
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUMNA; j++) {
        tablero[i][j] = icono;
        }
        }

        // Asignar mina y tesoro
        tablero[posiMina][posjMina] = mina;
        tablero[posiTesoro][posjTesoro] = tesoro;
        tablero [x][y] = disparo;
        
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

