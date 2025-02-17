package EjercicioProductos;
import java.io.*;
import java.util.*;

public class GestorProductos {
    private static final String ARCHIVO = "productos.txt";
    private static final Scanner scanner = new Scanner(System.in);
    private static final HashMap<String, Producto> productos = new HashMap<>();

    public static void main(String[] args) {
        cargarProductos();
        int opcion;
        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> agregarProducto();
                case 2 -> buscarProducto();
                case 3 -> actualizarStock();
                case 4 -> eliminarProducto();
                case 5 -> listarOrdenado();
                case 6 -> guardarProductos();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Gestión de Productos ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Buscar producto");
        System.out.println("3. Actualizar stock");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Listar productos ordenados");
        System.out.println("6. Guardar productos");
        System.out.println("0. Salir");
    }

    private static void agregarProducto() {
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(scanner.nextLine());
        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());

        productos.put(codigo, new Producto(codigo, nombre, cantidad, precio));
        System.out.println("Producto agregado.");
    }

    private static void buscarProducto() {
        System.out.print("Código del producto: ");
        String codigo = scanner.nextLine();
        Producto producto = productos.get(codigo);
        System.out.println((producto != null) ? producto : "Producto no encontrado.");
    }

    private static void actualizarStock() {
        System.out.print("Código del producto: ");
        String codigo = scanner.nextLine();
        Producto producto = productos.get(codigo);
        if (producto != null) {
            System.out.print("Nueva cantidad: ");
            producto.setCantidad(Integer.parseInt(scanner.nextLine()));
            System.out.println("Stock actualizado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void eliminarProducto() {
        System.out.print("Código del producto: ");
        if (productos.remove(scanner.nextLine()) != null) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void listarOrdenado() {
        List<Producto> lista = new ArrayList<>(productos.values());
        lista.sort(Comparator.comparing(Producto::getNombre));

        System.out.println("\n--- Productos ordenados ---");
        lista.forEach(System.out::println);
    }

    private static void guardarProductos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO))) {
            for (Producto p : productos.values()) {
                writer.write(p.getCodigo() + "," + p.getNombre() + "," + p.getCantidad() + "," + p.getPrecio());
                writer.newLine();
            }
            System.out.println("Productos guardados en archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar productos.");
        }
    }

    private static void cargarProductos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                productos.put(datos[0], new Producto(datos[0], datos[1], Integer.parseInt(datos[2]), Double.parseDouble(datos[3])));
            }
        } catch (IOException e) {
            System.out.println("No se encontró archivo de productos.");
        }
    }
}
