package EjercicioVehiculo;
import EjercicioVehiculo.clases.Vehiculo;
import java.util.*;

public class GestorVehiculos {
    private static final HashMap<String, Vehiculo> vehiculos = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n1. Añadir vehículo\n2. Consultar disponibilidad\n3. Alquilar\n4. Devolver\n5. Listar\n0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> agregarVehiculo();
                case 2 -> consultarDisponibilidad();
                case 3 -> alquilarVehiculo();
                case 4 -> devolverVehiculo();
                case 5 -> listarVehiculos();
            }
        } while (opcion != 0);
    }

    private static void agregarVehiculo() {
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        vehiculos.put(matricula, new Vehiculo(matricula, marca, modelo));
    }

    private static void listarVehiculos() {
        // Este método recorre todos los vehículos y los imprime
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            vehiculos.values().forEach(System.out::println); // Imprime todos los vehículos registrados
        }
    }

    private static void consultarDisponibilidad() {
        System.out.print("Introduce la matrícula del vehículo: ");
        String matricula = scanner.nextLine();
        Vehiculo vehiculo = vehiculos.get(matricula); // Busca el vehículo por su matrícula
        if (vehiculo == null) {
            System.out.println("Vehículo no encontrado.");
        } else {
            System.out.println(vehiculo.isDisponible() ? "El vehículo está disponible." : "El vehículo no está disponible.");
        }
    }

    private static void alquilarVehiculo() {
        System.out.print("Introduce la matrícula del vehículo que deseas alquilar: ");
        String matricula = scanner.nextLine();
        Vehiculo vehiculo = vehiculos.get(matricula); // Busca el vehículo por su matrícula
        if (vehiculo == null) {
            System.out.println("Vehículo no encontrado.");
        } else {
            if (vehiculo.isDisponible()) {
                vehiculo.alquilar();
                System.out.println("Vehículo alquilado con éxito.");
            } else {
                System.out.println("El vehículo no está disponible para alquiler.");
            }
        }
    }

    private static void devolverVehiculo() {
        System.out.print("Introduce la matrícula del vehículo que deseas devolver: ");
        String matricula = scanner.nextLine();
        Vehiculo vehiculo = vehiculos.get(matricula); // Busca el vehículo por su matrícula
        if (vehiculo == null) {
            System.out.println("Vehículo no encontrado.");
        } else {
            if (!vehiculo.isDisponible()) {
                vehiculo.devolver();
                System.out.println("Vehículo devuelto con éxito.");
            } else {
                System.out.println("El vehículo no estaba alquilado.");
            }
        }
    }
}
