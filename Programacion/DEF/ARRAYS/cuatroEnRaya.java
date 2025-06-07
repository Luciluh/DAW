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

        // creo el tablero vacío
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COL; j++) {
                tablero[i][j] = vacio;
            }
        }

        System.out.println("LAS CUATRO EN RAYA");
        System.out.println("===================");

        boolean juegoTerminado = false;  // Variable para controlar la terminación del juego

        while (!juegoTerminado) {
            // Turno de la máquina
            realizarMovimientoMaquina(tablero, vacio, cruz);
            mostrarTablero(tablero);

            if (comprobarGanador(tablero, cruz)) {
                System.out.println("¡Ha ganado el ORDENADOR!");
                juegoTerminado = true; // Termina el juego si la máquina gana
                break;
            }

            // Turno del jugador
            System.out.println("Turno del jugador:");
            System.out.print("Introduce la fila (a-d): ");
            eleccionFila = sc.nextLine();
            System.out.print("Introduce la columna (0-3): ");
            eleccionCol = sc.nextInt();
            sc.nextLine();  // limpio el escaner 

            // cambiar a número
            int x = convertirFilaANumero(eleccionFila);

            // posición válida o no
            if (x != -1 && tablero[x][eleccionCol] == vacio) {
                tablero[x][eleccionCol] = raya;
                mostrarTablero(tablero);

                if (comprobarGanador(tablero, raya)) {
                    System.out.println("¡Enhorabuena! ¡Me has ganado!");
                    juegoTerminado = true; // Termina el juego si el jugador gana
                    break;
                }
            } else {
                System.out.println("Posición inválida o ya ocupada, intenta nuevamente.");
            }

            // Verificamos si el tablero está lleno (empate)
            if (tableroLleno(tablero)) {
                System.out.println("El tablero está lleno, ¡empate!");
                juegoTerminado = true; // Termina el juego en empate
                break;
            }
        }

        sc.close(); // cerramos el scanner al finalizar el juego
    }

    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < FILA; i++) {
            switch (i) {
                case 0: System.out.print("a |"); break;
                case 1: System.out.print("b |"); break;
                case 2: System.out.print("c |"); break;
                case 3: System.out.print("d |"); break;
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

    public static int convertirFilaANumero(String fila) {
        int val;
        switch (fila) {
            case "a": val=0; break;
            case "b": val=1; break;
            case "c": val=2; break;
            case "d": val=3; break;
            default: val=-1; break;
        }
        return val;
    }

    public static void realizarMovimientoMaquina(char[][] tablero, char vacio, char cruz) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        // pausa antes de mostrar el movimiento de la máquina
        System.out.println("Pulsa ENTER para ver el movimiento de la máquina");
        sc.nextLine();

        do {
            x = (int) (Math.random() * FILA);
            y = (int) (Math.random() * COL);
        } while (tablero[x][y] != vacio); // se repite si la posición ya está ocupada
        tablero[x][y] = cruz;
    }

    public static boolean comprobarGanador(char[][] tablero, char jugador) {
        // filas
        for (int i = 0; i < FILA; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador && tablero[i][3] == jugador) {
                return true;
            }
        }
        // columnas
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

    // Método para comprobar si el tablero está lleno
    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COL; j++) {
                if (tablero[i][j] == '·') {  // Si encuentra una celda vacía
                    return false;  // El tablero no está lleno
                }
            }
        }
        return true;  // El tablero está lleno
    }
}
