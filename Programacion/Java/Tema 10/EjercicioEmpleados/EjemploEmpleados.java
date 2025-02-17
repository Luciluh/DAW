import clases.Empleado;
import java.io.*;
import java.util.*;

public class EjemploEmpleados {

    private static final String CARPETA_SALIDA = "salida/";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int op = -1;
        HashMap<String, Empleado> datos = new HashMap<>();

        if (args.length > 0) {
            leerListaEmpleados(args[0], datos);
        }

        do {
            menu();
            System.out.print("Opción? ");
            
            try {
                op = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("**ERROR: Ingresa un número válido.");
                continue;
            }

            switch (op) {
                case 0 -> System.out.println("Saliendo...");
                case 1 -> nuevoEmpleado(datos);
                case 2 -> buscarEmpleado(datos);
                case 3 -> listarEmpleados(datos);
                case 4 -> listarOrdenado(datos);
                case 5 -> guardarListaEmpleados(datos);
                default -> System.out.println("**ERROR: selecciona una opción correcta.");
            }
        } while (op != 0);
    }

    private static void menu() {
        System.out.println("GESTIÓN DE EMPLEADOS:\n====================");
        System.out.println("0. Salir");
        System.out.println("1. Añadir un empleado");
        System.out.println("2. Buscar empleado");
        System.out.println("3. Listar empleados");
        System.out.println("4. Listar empleados ordenados por DNI");
        System.out.println("5. Guardar lista de empleados");
    }

    private static void nuevoEmpleado(HashMap<String, Empleado> datos) {
        System.out.println("AÑADIR EMPLEADO:\n====================");

        System.out.print("DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad;
        try {
            edad = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("**ERROR: Ingresa una edad válida.");
            return;
        }

        System.out.print("Salario: ");
        double salario;
        try {
            salario = scanner.nextDouble();
        } catch (NumberFormatException e) {
            System.out.println("**ERROR: Ingresa un salario válido.");
            return;
        }

        Empleado empleado = new Empleado(dni, nombre, salario);
        empleado.setEdad(edad);
        datos.put(dni, empleado);
    }

    private static void buscarEmpleado(HashMap<String, Empleado> datos) {
        System.out.println("BUSCAR EMPLEADO:\n====================");
        System.out.print("DNI: ");
        String dni;
        dni = scanner.nextLine();

        Empleado empleado = datos.get(dni);

        if (empleado != null) {
            System.out.println(empleado);
        } else {
            System.out.println("No se ha encontrado el empleado con DNI " + dni);
        }

    }

    private static void listarEmpleados(HashMap<String, Empleado> datos) {
        System.out.println("LISTADO DE EMPLEADOS:\n====================");
        
        if (datos.isEmpty()) {
            System.out.println("Aún no hay empleados en la agenda.");
            return;
        }
        
        for (Empleado empleado : datos.values()) {
            System.out.println(empleado);
            System.out.println("-----------------------------");
        }
    }

    private static void listarOrdenado(HashMap<String, Empleado> datos) {
        List<Empleado> listaOrdenada = new ArrayList<>(datos.values());
        listaOrdenada.sort(Comparator.comparing(Empleado::getDni));
        
        System.out.println("LISTADO ORDENADO POR DNI:\n====================");
        for (Empleado empleado : listaOrdenada) {
            System.out.println(empleado);
            System.out.println("-----------------------------");
        }
    }

    private static void leerListaEmpleados(String nombreFichero, HashMap<String, Empleado> datos) {
        try (BufferedReader br = new BufferedReader(new FileReader(CARPETA_SALIDA + nombreFichero + ".txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] info = linea.split(",");
                if (info.length < 4) continue;
                
                Empleado empleado = new Empleado(info[0], info[1], Double.parseDouble(info[3]));
                empleado.setEdad(Integer.parseInt(info[2]));
                datos.put(info[0], empleado);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void guardarListaEmpleados(HashMap<String, Empleado> datos) {
        System.out.print("Fichero de salida: ");
        String nombreFichero = scanner.nextLine();
        
        File ruta = new File(CARPETA_SALIDA);
        if (!ruta.exists()) ruta.mkdirs();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CARPETA_SALIDA + nombreFichero + ".txt"))) {
            for (Empleado empleado : datos.values()) {
                bw.write(empleado.getDni() + "," + empleado.getNombre() + "," + empleado.getEdad() + "," + empleado.getSalario());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
