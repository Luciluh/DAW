import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("\nMENU EMPLEADO:");
            System.out.println("1. Añadir empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Eliminar empleado");
            System.out.println("4. Modificar empleado");
            System.out.println("5. Mostrar empleados eliminados");
            System.out.println("6. Recuperar empleado eliminado");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            // Ejecutar la opción elegida
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Introduce el DNI: ");
                    String dni = sc.nextLine();
                    gestor.añadirEmpleado(nombre, dni);
                    break;
                case 2:
                    gestor.mostrarEmpleados();
                    break;
                case 3:
                    System.out.print("Introduce el DNI del empleado a eliminar: ");
                    String dniEliminar = sc.nextLine();
                    gestor.eliminarEmpleado(dniEliminar);
                    break;
                case 4:
                    System.out.print("Introduce el DNI del empleado a modificar: ");
                    String dniModificar = sc.nextLine();
                    gestor.modificarEmpleado(dniModificar);
                    break;
                case 5:
                    gestor.mostrarEliminados();
                    break;
                case 6:
                    System.out.print("Introduce el DNI del empleado a recuperar: ");
                    String dniRecuperar = sc.nextLine();
                    gestor.recuperarEmpleado(dniRecuperar);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        sc.close();
    }
}
