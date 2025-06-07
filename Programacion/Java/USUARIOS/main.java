import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        

        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("MENU EMPLEADO:");
            System.out.println("1. Añadir usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Eliminar usuarios");
            System.out.println("4. Modificar usuarios");
            System.out.println("5. Mostrar usuarios eliminados");
            System.out.println("6. Recuperar usuario eliminado");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opcion: ");
            op = sc.nextInt();
            

            switch (op) {
                case 1: 
                    recursos.añadirUsuario();
                    break;
            
                case 2:
                    HashMap<String, String> usuarios = recursos.mostrarUsuarios();

                    // Convertimos el HashMap en una lista de entradas ordenadas por DNI
                    List<Map.Entry<String, String>> listaOrdenada = new ArrayList<>(usuarios.entrySet());
                    listaOrdenada.sort(Map.Entry.comparingByKey()); // Ordenamos por clave (DNI)

                    // Mostramos los datos ordenados de manera clara
                    System.out.println("LISTADO DE EMPLEADOS");
                    System.out.println("======================================");

                    for (Map.Entry<String, String> entry : listaOrdenada) {
                        System.out.println("Nombre: " + entry.getKey());
                        System.out.println("DNI: " + entry.getValue());
                        System.out.println("-----------------------------");
                    }
                
                    break;

                case 3: 
                    recursos.eliminarUsuario();
                
                    break;
                    
                case 4: 
                    recursos.modificarUsuario();
                    
                    break;

                case 5: 
                    recursos.mostrarUsuariosEliminados();
                    
                    break;
                case 6: 
                    recursos.recuperarUsuarioEliminado();
                    
                    break;
                case 7: System.out.println("El programa ha finalizado");
                    
                    break;
            
                default:
                    break;
            }
            
        } while (op!=7);

        
    }
}
