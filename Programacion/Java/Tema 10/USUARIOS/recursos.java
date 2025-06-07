package USUARIOS;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class recursos {
    
    private static final String ARCHIVO_USUARIOS = "C:/USUARIOS/usuarios.txt";

    private static final String COPIA_ARCHIVO = "USUARIOS/copia_archivo.txt";
    
    
        /**
         * Carga los usuarios desde el archivo en un HashMap.
         * @return HashMap con los usuarios y sus contraseñas en texto plano.
         */
        public static HashMap<String, String> cargarUsuarios() {
            HashMap<String, String> usuarios = new HashMap<>();
    
            try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_USUARIOS))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(":");
                    if (partes.length == 2) {
                        usuarios.put(partes[0], partes[1]); // Guardar usuario y contraseña en texto plano
                    }
                }
            } catch (IOException e) {
                System.out.println("No se encontró el archivo de usuarios. Se creará uno nuevo.");
            }
    
            return usuarios;
        }
    
        /**
         * Registra un nuevo usuario en el sistema sin cifrado de contraseña.
         * @param scanner Scanner para leer la entrada del usuario.
         */
        public static void registrarUsuario(Scanner scanner) {
            HashMap<String, String> usuarios = cargarUsuarios();
    
            System.out.print("Ingresa un nombre de usuario: ");
            String usuario = scanner.nextLine();
    
            if (usuarios.containsKey(usuario)) {
                System.out.println("Error: El usuario ya está registrado.");
            } else {
                System.out.print("Ingresa una contraseña: ");
                String contrasena = scanner.nextLine(); // Guardar contraseña en texto plano
    
                usuarios.put(usuario, contrasena);
                guardarUsuarios(usuarios); // Guardar en archivo
                System.out.println("Usuario registrado exitosamente.");
            }
        }
    
        /**
         * Inicia sesión verificando la contraseña sin cifrado.
         * @param scanner Scanner para leer la entrada del usuario.
         */
        public static void iniciarSesion(Scanner scanner) {
            HashMap<String, String> usuarios = cargarUsuarios();
    
            System.out.print("Ingresa tu nombre de usuario: ");
            String usuario = scanner.nextLine();
    
            if (!usuarios.containsKey(usuario)) {
                System.out.println("Error: Usuario no encontrado.");
            } else {
                System.out.print("Ingresa tu contraseña: ");
                String contrasena = scanner.nextLine();
    
                // Comparación directa, sin hash
                if (usuarios.get(usuario).equals(contrasena)) {
                    System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + usuario + "!");
                } else {
                    System.out.println("Error: Contraseña incorrecta.");
                }
            }
        }
    
        /**
         * Guarda los usuarios en un archivo en texto plano.
         * @param usuarios HashMap con los usuarios y sus contraseñas en texto plano.
         */
        public static void guardarUsuarios(HashMap<String, String> usuarios) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_USUARIOS))) {
                for (String usuario : usuarios.keySet()) {
                    bw.write(usuario + ":" + usuarios.get(usuario));
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("⚠ Error al guardar los usuarios.");
            }
        }
    
    
/**
 * Elimina un usuario del archivo sin borrar el resto del contenido.
 * @param scanner Scanner para leer la entrada del usuario.
 */
public static void eliminarUsuario(Scanner scanner) {
    System.out.print("Introduce el nombre de usuario a eliminar: ");
    String usuario = scanner.nextLine().trim(); // Se asegura de eliminar espacios innecesarios

    File archivo = new File("usuarios.txt"); // Ruta del archivo
    File tempFile = new File("usuarios_temp.txt");

    boolean usuarioEncontrado = false;

    try (
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        PrintWriter writer = new PrintWriter(new FileWriter(tempFile))
    ) {
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(":");
            if (partes[0].trim().equals(usuario)) { // Verifica si el usuario coincide
                usuarioEncontrado = true;
                continue; // Omite escribir esta línea en el nuevo archivo
            }
            writer.println(linea); // Escribe todas las demás líneas
        }
    } catch (IOException e) {
        System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        return;
    }

    // Si el usuario fue encontrado, reemplazamos el archivo original
    if (usuarioEncontrado) {
        if (archivo.delete()) {
            if (tempFile.renameTo(archivo)) {
                System.out.println("Usuario eliminado exitosamente.");
            } else {
                System.out.println("Error al renombrar el archivo.");
            }
        } else {
            System.out.println("Error al eliminar el archivo original.");
        }
    } else {
        System.out.println("Usuario no encontrado.");
        tempFile.delete(); // Borra el archivo temporal si no se encontró el usuario
    }
}


}


