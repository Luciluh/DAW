import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {
    private static final String ARCHIVO_DICCIONARIO = "diccionario.txt"; // Nombre del archivo que almacena las palabras
    private static final String ARCHIVO_ELIMINADOS = "eliminados.txt"; // Nombre del archivo que almacena palabras eliminadas

    public static void añadirPalabra() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la palabra: ");
        String palabra = sc.nextLine(); // Leer la palabra ingresada por el usuario

        System.out.print("Introduce la definición: ");
        String definicion = sc.nextLine(); // Leer la definición ingresada por el usuario

        // Leer el diccionario desde el archivo
        HashMap<String, String> palabras = ArchivoHelper.leerArchivo(ARCHIVO_DICCIONARIO);
        palabras.put(palabra, definicion); // Añadir la nueva palabra y su definición
        ArchivoHelper.guardarArchivo(ARCHIVO_DICCIONARIO, palabras); // Guardar los cambios en el archivo

        System.out.println("Palabra añadida con éxito.");
    }

    public static HashMap<String, String> mostrarPalabras() {
        return ArchivoHelper.leerArchivo(ARCHIVO_DICCIONARIO); // Devolver el contenido del diccionario
    }

    public static void eliminarPalabra() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> palabras = ArchivoHelper.leerArchivo(ARCHIVO_DICCIONARIO); // Cargar palabras
        HashMap<String, String> eliminados = ArchivoHelper.leerArchivo(ARCHIVO_ELIMINADOS); // Cargar palabras eliminadas

        System.out.print("Introduce la palabra a eliminar: ");
        String palabra = sc.nextLine(); // Leer la palabra que se desea eliminar

        if (palabras.containsKey(palabra)) { // Verificar si la palabra existe en el diccionario
            eliminados.put(palabra, palabras.remove(palabra)); // Mover la palabra a eliminados
            ArchivoHelper.guardarArchivo(ARCHIVO_DICCIONARIO, palabras); // Guardar cambios en diccionario
            ArchivoHelper.guardarArchivo(ARCHIVO_ELIMINADOS, eliminados); // Guardar cambios en eliminados
            System.out.println("Palabra eliminada correctamente.");
        } else {
            System.out.println("La palabra no existe en el diccionario.");
        }
    }

    public static void modificarPalabra() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> palabras = ArchivoHelper.leerArchivo(ARCHIVO_DICCIONARIO); // Cargar palabras

        System.out.print("Introduce la palabra a modificar: ");
        String palabra = sc.nextLine(); // Leer la palabra que se quiere modificar

        if (palabras.containsKey(palabra)) { // Verificar si existe
            System.out.print("Introduce la nueva definición: ");
            String nuevaDefinicion = sc.nextLine(); // Leer la nueva definición
            palabras.put(palabra, nuevaDefinicion); // Actualizar la definición
            ArchivoHelper.guardarArchivo(ARCHIVO_DICCIONARIO, palabras); // Guardar cambios
            System.out.println("Palabra modificada con éxito.");
        } else {
            System.out.println("La palabra no existe en el diccionario.");
        }
    }

    public static void mostrarPalabrasEliminadas() {
        HashMap<String, String> eliminados = ArchivoHelper.leerArchivo(ARCHIVO_ELIMINADOS); // Cargar eliminados
        System.out.println("\n===== PALABRAS ELIMINADAS =====");
        for (Map.Entry<String, String> entry : eliminados.entrySet()) {
            System.out.println("Palabra: " + entry.getKey() + " - Definición: " + entry.getValue()); // Mostrar palabras eliminadas
        }
    }

    public static void recuperarPalabra() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> palabras = ArchivoHelper.leerArchivo(ARCHIVO_DICCIONARIO); // Cargar palabras
        HashMap<String, String> eliminados = ArchivoHelper.leerArchivo(ARCHIVO_ELIMINADOS); // Cargar eliminados

        System.out.print("Introduce la palabra a recuperar: ");
        String palabra = sc.nextLine(); // Leer la palabra que se quiere recuperar

        if (eliminados.containsKey(palabra)) { // Verificar si está en eliminados
            palabras.put(palabra, eliminados.remove(palabra)); // Restaurar la palabra
            ArchivoHelper.guardarArchivo(ARCHIVO_DICCIONARIO, palabras); // Guardar cambios
            ArchivoHelper.guardarArchivo(ARCHIVO_ELIMINADOS, eliminados); // Guardar cambios en eliminados
            System.out.println("Palabra recuperada con éxito.");
        } else {
            System.out.println("La palabra no se encuentra en la lista de eliminados.");
        }
    }
}
