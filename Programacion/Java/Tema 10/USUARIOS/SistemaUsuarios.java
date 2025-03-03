package USUARIOS;
import java.util.Scanner;

public class SistemaUsuarios {
    private static final String ARCHIVO_USUARIOS = "C:/USUARIOS/usuarios.txt";

    static final String COPIA_ARCHIVO = "copia_archivo.txt";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE AUTENTICACIÓN ===");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    recursos.registrarUsuario(scanner);
                    break;
                case 2:
                    recursos.iniciarSesion(scanner);
                    break;
                case 3:
                    recursos.eliminarUsuario(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
