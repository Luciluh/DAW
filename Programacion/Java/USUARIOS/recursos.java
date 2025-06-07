import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class recursos {

    
    public static void añadirUsuario (){
        HashMap<String,String> usuario = new HashMap <String,String>();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce el DNI:");
        String dni = sc.nextLine();

        usuario.put(nombre,dni);

        //forzamos el guardado en el txt tras añadir el usuario 
        guardarLista(usuario);

        }
        
    public static void guardarLista (HashMap<String,String> usuario){

        try {
            FileWriter datos = new FileWriter("datos.txt", true);
            BufferedWriter bw = new BufferedWriter(datos);

            for (String nombre : usuario.keySet()) {
                bw.write(nombre + ":" + usuario.get(nombre)); // Escribimos nombre:DNI correctamente
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            System.out.println("Error al guardar los usuarios.");
        }
    }

    public static HashMap<String, String> mostrarUsuarios() {

        HashMap<String, String> mostrarUsu = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(":");
                if (partes.length == 2) {
                    String dni = partes[0].trim(); //trim() es para eliminar los espacions en blanco al incicio y al final de la cadena
                    String nombre = partes[1].trim();
                    mostrarUsu.put(dni, nombre);
                }
            }
        } catch (IOException e) {
            System.out.println("No se encontró el archivo de usuarios.");
        }

        return mostrarUsu;
    }

    // public static void eliminarUsuario() {
    //     HashMap<String, String> usuarios = mostrarUsuarios();
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Introduce el DNI del usuario que deseas eliminar:");
    //     String dniEliminar = sc.nextLine();

    //     // Buscar el nombre asociado al DNI
    //     String nombreEliminar = null;
    //     for (Map.Entry<String, String> entry : usuarios.entrySet()) {
    //         if (entry.getValue().equals(dniEliminar)) { // Buscamos el DNI en los valores
    //             nombreEliminar = entry.getKey(); // Obtenemos el nombre asociado
    //             break;
    //         }
    //     }

    //     if (nombreEliminar != null) {
    //         usuarios.remove(nombreEliminar); // Eliminamos el usuario encontrado

    //         try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"))) {
    //             for (Map.Entry<String, String> entry : usuarios.entrySet()) {
    //                 bw.write(entry.getKey() + ":" + entry.getValue()); // Guardamos los restantes
    //                 bw.newLine();
    //             }
    //             System.out.println("Usuario con DNI " + dniEliminar + " eliminado correctamente.");
    //         } catch (IOException e) {
    //             System.out.println("Error al eliminar el usuario.");
    //         }
    //     } else {
    //         System.out.println("No se encontró un usuario con el DNI ingresado.");
    //     }
    //     }



        /**
         *Esta funcion elimina usuarios y los guarda en otro txt
         */
        public static void eliminarUsuario() {
            HashMap<String, String> usuarios = mostrarUsuarios();
            Scanner sc = new Scanner(System.in);
        
            System.out.println("Introduce el DNI del usuario que deseas eliminar:");
            String dniEliminar = sc.nextLine();
        
            String nombreEliminar = null;
            for (Map.Entry<String, String> entry : usuarios.entrySet()) {
                if (entry.getValue().equals(dniEliminar)) {
                    nombreEliminar = entry.getKey();
                    break;
                }
            }
        
            if (nombreEliminar != null) {
                usuarios.remove(nombreEliminar); // Eliminamos el usuario
                guardarEliminados(nombreEliminar, dniEliminar); // Guardamos en "eliminados.txt"
        
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"))) {
                    for (Map.Entry<String, String> entry : usuarios.entrySet()) {
                        bw.write(entry.getKey() + ":" + entry.getValue());
                        bw.newLine();
                    }
                    System.out.println("Usuario con DNI " + dniEliminar + " eliminado correctamente.");
                } catch (IOException e) {
                    System.out.println("Error al eliminar el usuario.");
                }
            } else {
                System.out.println("No se encontró un usuario con el DNI ingresado.");
            }
        }

        /**
         * Esta funcion guarda los eliminados
         * @param nombre
         * @param dni
         */
        public static void guardarEliminados(String nombre, String dni) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("eliminados.txt", true))) {
                bw.write(nombre + ":" + dni);
                bw.newLine();
            } catch (IOException e) {
                System.out.println("Error al guardar en la lista de eliminados.");
            }
        }
        
        

        /**
         * 
         */
        public static void modificarUsuario() {
            HashMap<String, String> usuarios = mostrarUsuarios();
            Scanner sc = new Scanner(System.in);
        
            System.out.println("Introduce el DNI del usuario que deseas modificar:");
            String dniModificar = sc.nextLine();
        
            // Buscar el nombre asociado al DNI
            String nombreActual = null;
            for (Map.Entry<String, String> entry : usuarios.entrySet()) {
                if (entry.getValue().equals(dniModificar)) { // Buscamos el DNI en los valores
                    nombreActual = entry.getKey(); // Obtenemos el nombre asociado
                    break;
                }
            }
        
            if (nombreActual != null) {
                System.out.println("Usuario encontrado: " + nombreActual + " - " + dniModificar);
                System.out.println("Introduce el nuevo nombre:");
                String nuevoNombre = sc.nextLine();
        
                System.out.println("Introduce el nuevo DNI:");
                String nuevoDNI = sc.nextLine();
        
                // Eliminar el usuario actual y añadirlo con los nuevos datos
                usuarios.remove(nombreActual);
                usuarios.put(nuevoNombre, nuevoDNI);
        
                // Escribir los cambios en el archivo
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos.txt"))) {
                    for (Map.Entry<String, String> entry : usuarios.entrySet()) {
                        bw.write(entry.getKey() + ":" + entry.getValue());
                        bw.newLine();
                    }
                    System.out.println("Usuario modificado correctamente.");
                } catch (IOException e) {
                    System.out.println("Error al modificar el usuario.");
                }
            } else {
                System.out.println("No se encontró un usuario con el DNI ingresado.");
            }
        }

        
        /**
         * 
         */
        public static void mostrarUsuariosEliminados() {
            try (BufferedReader br = new BufferedReader(new FileReader("eliminados.txt"))) {
                String linea;
                System.out.println("LISTADO DE USUARIOS ELIMINADOS");
                System.out.println("================================");
        
                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(":");
                    if (partes.length == 2) {
                        System.out.println("Nombre: " + partes[0]);
                        System.out.println("DNI: " + partes[1]);
                        System.out.println("-----------------------------");
                    }
                }
            } catch (IOException e) {
                System.out.println("No se encontraron usuarios eliminados.");
            }
        }

        /**
         * 
         */
        public static void recuperarUsuarioEliminado() {
            HashMap<String, String> eliminados = obtenerUsuariosEliminados();
            Scanner sc = new Scanner(System.in);
        
            System.out.println("Introduce el DNI del usuario que deseas recuperar:");
            String dniRecuperar = sc.nextLine();
        
            String nombreRecuperar = null;
            for (Map.Entry<String, String> entry : eliminados.entrySet()) {
                if (entry.getValue().equals(dniRecuperar)) {
                    nombreRecuperar = entry.getKey();
                    break;
                }
            }
        
            if (nombreRecuperar != null) {
                // Recuperar el usuario y guardarlo en datos.txt
                HashMap<String, String> usuarioRecuperado = new HashMap<>();
                usuarioRecuperado.put(nombreRecuperar, dniRecuperar);
                guardarLista(usuarioRecuperado);
        
                // Eliminarlo de eliminados.txt
                eliminados.remove(nombreRecuperar);
                actualizarArchivoEliminados(eliminados);
        
                System.out.println("Usuario con DNI " + dniRecuperar + " recuperado correctamente.");
            } else {
                System.out.println("No se encontró un usuario con el DNI ingresado en la lista de eliminados.");
            }
        }

        /**
         * 
         * @return
         */
        public static HashMap<String, String> obtenerUsuariosEliminados() {
            HashMap<String, String> eliminados = new HashMap<>();
            try (BufferedReader br = new BufferedReader(new FileReader("eliminados.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] partes = linea.split(":");
                    if (partes.length == 2) {
                        eliminados.put(partes[0].trim(), partes[1].trim());
                    }
                }
            } catch (IOException e) {
                System.out.println("No se encontró el archivo de eliminados.");
            }
            return eliminados;
        }

        /**
         * 
         * @param eliminados
         */
        public static void actualizarArchivoEliminados(HashMap<String, String> eliminados) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("eliminados.txt"))) {
                for (Map.Entry<String, String> entry : eliminados.entrySet()) {
                    bw.write(entry.getKey() + ":" + entry.getValue());
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error al actualizar la lista de eliminados.");
            }
        }
        
        
        
        

        


}
