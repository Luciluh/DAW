import java.util.Scanner;

public class cuatroEnRaya {

    private static final int FILA = 4;
    private static final int COL = 4;
    
    public static void main(String[] args) {
        
        char[][] tablero = new char[FILA][COL];
        char vacio = '·';
        char cruz = 'X'; 
        char raya = 'O'; 
        String eleccionFila;
        int eleccionCol;
        Scanner sc = new Scanner(System.in);

        // creo el tablero vacio
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COL; j++) {
                tablero[i][j] = vacio;
            }
        }

        System.out.println("LAS CUATRO EN RAYA");
        System.out.println("===================");

        while (true) {
            realizarMovimientoMaquina(tablero,vacio,cruz);
            //mostrar el tablero actualo
            mostrarTablero(tablero);

            if (comprobarGanador(tablero, cruz)) {
                System.out.println("¡Ha ganado el ORDENADOR!");
            }

            // mi turno
            System.out.println("Turno del jugador:");
            System.out.print("Introduce la fila (a-d): ");
            eleccionFila = sc.nextLine();
            System.out.print("Introduce la columna (0-3): ");
            eleccionCol = sc.nextInt();
            sc.nextLine();  //limpio el escaner por si acaso

            // cambiar a numero
            int x = convertirFilaANumero(eleccionFila);

            // posicion buena o no
            if (x != -1 && tablero[x][eleccionCol] == vacio) {
                tablero[x][eleccionCol] = raya;
                //muestro el estado del tablero
                mostrarTablero(tablero);
                
                if (comprobarGanador(tablero, raya)) {
                    System.out.println("¡Enhorabuena! !Me has ganado¡");
                }

            } else {
                System.out.println("Posición inválida o ya ocupada, intenta nuevamente.");
            }
        }
    }

    /**
     * Funcion para mostrar el tablero
     * @param tablero
     */
    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < FILA; i++) {
            switch (i) {
                case 0: 
                System.out.print("a |"); 
                break;
                case 1:
                System.out.print("b |"); 
                break;
                case 2: 
                System.out.print("c |"); 
                break;
                case 3: 
                System.out.print("d |"); 
                break;
            }
            for (int j = 0; j < COL; j++) {
                System.out.printf("%3c", tablero[i][j]);
            }
            System.out.println();
        }
        System.out.println("   -------------");
        System.out.println("     0  1  2  3");
        System.out.println();
    }


    
    /**
     * Funcon para convertir la fila a numero
     * @param fila
     * @return
     */
    public static int convertirFilaANumero(String fila) {
        switch (fila) {
            case "a": 
            return 0;
            case "b": 
            return 1;
            case "c": 
            return 2;
            case "d": 
            return 3;
            default: return -1; 
        }
    }

    /**
     * Funcion para hacer el movimiento del pc
     * @param tablero
     */
    public static void realizarMovimientoMaquina(char[][] tablero, char vacio, char cruz) {

        int x;
        int y;
        Scanner sc = new Scanner(System.in);

        // creo una pausa antes de mostrar directamente el movimiento de la maquina para que se juegue mejor, no tan rapido
        System.out.println("Pulsa ENTER para ver el movimiento de la maquina");
        sc.nextLine();

        do {
            x = (int) (Math.random() * FILA);
            y = (int) (Math.random() * COL);
        } while (tablero[x][y] != vacio); // se repiter si la posicion ya estya ocupada
        tablero[x][y] = cruz;
    }


    /**
     * Funcion para comprobar que un jugador ha ganao o no
     * @param tablero
     * @param jugador
     * @return
     */
    public static boolean comprobarGanador(char[][] tablero, char jugador) {

        // filaa
        for (int i = 0; i < FILA; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador && tablero[i][3] == jugador) {
                return true;
            }
        }
        // olumna
        for (int i = 0; i < COL; i++) {
            if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador && tablero[3][i] == jugador) {
                return true;
            }
        }
        // diagonales
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador && tablero[3][3] == jugador) {
            return true;
        }
        if (tablero[0][3] == jugador && tablero[1][2] == jugador && tablero[2][1] == jugador && tablero[3][0] == jugador) {
            return true;
        }
        return false;
    }
}
