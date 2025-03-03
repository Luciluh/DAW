import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in); // Crear un Scanner para leer la entrada del usuario

        do {
            // Mostrar el menú de opciones
            System.out.println("===== CRUD DICCIONARIO =====");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Mostrar palabras");
            System.out.println("3. Eliminar palabra");
            System.out.println("4. Modificar palabra");
            System.out.println("5. Mostrar palabras eliminadas");
            System.out.println("6. Recuperar palabra eliminada");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt(); // Leer la opción seleccionada
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    Diccionario.añadirPalabra(); // Llamar a la función para añadir una palabra
                    break;
                case 2:
                    // Obtener el diccionario actual y mostrarlo en pantalla
                    HashMap<String, String> palabras = Diccionario.mostrarPalabras();
                    System.out.println("\n===== DICCIONARIO =====");
                    for (Map.Entry<String, String> entry : palabras.entrySet()) {
                        System.out.println("Palabra: " + entry.getKey() + " - Definición: " + entry.getValue());
                    }
                    break;
                case 3:
                    Diccionario.eliminarPalabra(); // Llamar a la función para eliminar una palabra
                    break;
                case 4:
                    Diccionario.modificarPalabra(); // Llamar a la función para modificar una palabra
                    break;
                case 5:
                    Diccionario.mostrarPalabrasEliminadas(); // Llamar a la función para mostrar palabras eliminadas
                    break;
                case 6:
                    Diccionario.recuperarPalabra(); // Llamar a la función para recuperar una palabra eliminada
                    break;
                case 7:
                    System.out.println("Saliendo del programa..."); // Mensaje de salida
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo."); // Manejo de opción inválida
                    break;
            }
        } while (opcion != 7); // Repetir hasta que el usuario elija salir

        sc.close(); // Cerrar el Scanner para evitar fugas de memoria
    }
}
