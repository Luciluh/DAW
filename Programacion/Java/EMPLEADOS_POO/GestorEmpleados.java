import java.io.*;
import java.util.*;

public class GestorEmpleados {
    // HashMap para almacenar empleados activos (clave: DNI, valor: objeto Empleado)
    private HashMap<String, Empleado> empleados = new HashMap<>();
    // HashMap para almacenar empleados eliminados temporalmente
    private HashMap<String, Empleado> eliminados = new HashMap<>();
    // Nombres de los archivos donde se almacenarán los datos
    private final String ARCHIVO_EMPLEADOS = "empleados.txt";
    private final String ARCHIVO_ELIMINADOS = "eliminados.txt";

    // Constructor que carga los empleados y eliminados desde los archivos
    public GestorEmpleados() {
        cargarEmpleados();
        cargarEliminados();
    }

    // Método para añadir un empleado nuevo
    public void añadirEmpleado(String nombre, String dni) {
        if (empleados.containsKey(dni)) { // Verifica si el DNI ya existe
            System.out.println("Ya existe un empleado con este DNI.");
            return;
        }
        Empleado empleado = new Empleado(nombre, dni);
        empleados.put(dni, empleado);
        guardarEmpleados(); // Guarda los cambios en el archivo
        System.out.println("Empleado añadido con éxito.");
    }

    // Método para mostrar la lista de empleados activos
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
    
        System.out.println("\nLISTADO DE EMPLEADOS:");
        System.out.println("=========================");
    
        for (Empleado emp : empleados.values()) {
            System.out.println("Nombre: " + emp.getNombre());
            System.out.println("DNI: " + emp.getDni());
            System.out.println("-----------------------------");
        }
    
        System.out.println("Total de empleados: " + empleados.size());
    }
    

    // Método para eliminar un empleado y moverlo a la lista de eliminados
    public void eliminarEmpleado(String dni) {
        if (empleados.containsKey(dni)) {
            Empleado eliminado = empleados.remove(dni);
            eliminados.put(dni, eliminado);
            guardarEmpleados();
            guardarEliminados();
            System.out.println("Empleado eliminado con éxito.");
        } else {
            System.out.println("No se encontró un empleado con ese DNI.");
        }
    }

    // Método para modificar los datos de un empleado
    public void modificarEmpleado(String dni) {
        Scanner sc = new Scanner(System.in);
        if (empleados.containsKey(dni)) {
            Empleado empleado = empleados.get(dni);
            System.out.println("Introduce el nuevo nombre:");
            String nuevoNombre = sc.nextLine();
            System.out.println("Introduce el nuevo DNI:");
            String nuevoDni = sc.nextLine();

            empleados.remove(dni); // Elimina la entrada antigua
            empleado.setNombre(nuevoNombre);
            empleado.setDni(nuevoDni);
            empleados.put(nuevoDni, empleado); // Guarda con el nuevo DNI

            guardarEmpleados();
            System.out.println("Empleado modificado correctamente.");
        } else {
            System.out.println("No se encontró un empleado con ese DNI.");
        }
    }

    // Método para mostrar empleados eliminados
    // Método para mostrar empleados eliminados
    public void mostrarEliminados() {
        if (eliminados.isEmpty()) {
            System.out.println("No hay empleados eliminados.");
            return;
        }

        System.out.println("\nLISTADO DE EMPLEADOS ELIMINADOS:");
        System.out.println("===================================");

        for (Empleado emp : eliminados.values()) {
            System.out.println("Nombre: " + emp.getNombre());
            System.out.println("DNI: " + emp.getDni());
            System.out.println("-----------------------------");
        }

    }


    // Método para recuperar un empleado eliminado
    public void recuperarEmpleado(String dni) {
        if (eliminados.containsKey(dni)) {
            Empleado recuperado = eliminados.remove(dni);
            empleados.put(dni, recuperado);
            guardarEmpleados();
            guardarEliminados();
            System.out.println("Empleado recuperado con éxito.");
        } else {
            System.out.println("No se encontró un empleado con ese DNI en la lista de eliminados.");
        }
    }

    // Método para guardar la lista de empleados activos en un archivo
    private void guardarEmpleados() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_EMPLEADOS))) {
            for (Empleado emp : empleados.values()) {
                bw.write(emp.getNombre() + ":" + emp.getDni());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar empleados.");
        }
    }

    // Método para guardar la lista de empleados eliminados en un archivo
    private void guardarEliminados() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_ELIMINADOS))) {
            for (Empleado emp : eliminados.values()) {
                bw.write(emp.getNombre() + ":" + emp.getDni());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar empleados eliminados.");
        }
    }

    // Método para cargar los empleados desde un archivo
    private void cargarEmpleados() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_EMPLEADOS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(":");
                if (datos.length == 2) {
                    empleados.put(datos[1], new Empleado(datos[0], datos[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("No se encontró el archivo de empleados.");
        }
    }

    // Método para cargar la lista de eliminados desde un archivo
    private void cargarEliminados() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_ELIMINADOS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(":");
                if (datos.length == 2) {
                    eliminados.put(datos[1], new Empleado(datos[0], datos[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("No se encontró el archivo de empleados eliminados.");
        }
    }
}
