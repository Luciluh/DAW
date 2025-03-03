import java.io.*;
import java.util.HashMap;

public class ArchivoHelper {

    public static HashMap<String, String> leerArchivo(String nombreArchivo) {
        HashMap<String, String> datos = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) { // Abrir archivo en modo lectura
            String linea;
            while ((linea = br.readLine()) != null) { // Leer línea por línea
                String[] partes = linea.split(":"); // Dividir la línea en palabra y definición
                if (partes.length == 2) {
                    datos.put(partes[0].trim(), partes[1].trim()); // Guardar en el HashMap
                }
            }
        } catch (IOException e) {
            System.out.println("No se encontró el archivo " + nombreArchivo + ", creando uno nuevo...");
        }
        return datos;
    }

    public static void guardarArchivo(String nombreArchivo, HashMap<String, String> datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) { // Abrir archivo en modo escritura
            for (HashMap.Entry<String, String> entry : datos.entrySet()) {
                bw.write(entry.getKey() + ":" + entry.getValue()); // Guardar cada palabra
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar en el archivo " + nombreArchivo);
        }
    }
}
