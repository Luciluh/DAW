package EJ24;

import java.util.Scanner;

public class Gestisimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Almacen almacen = new Almacen();
        int opcion;

        do {
            System.out.println("\nGESTISIMAL ======================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            System.out.print("Introduzca una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        almacen.listarArticulos();
                        break;

                    case 2:
                        System.out.println("Nuevo artículo");
                        System.out.print("Código: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Descripción: ");
                        String descripcion = scanner.nextLine();
                        System.out.print("Precio de compra: ");
                        double precioCompra = scanner.nextDouble();
                        System.out.print("Precio de venta: ");
                        double precioVenta = scanner.nextDouble();
                        System.out.print("Stock: ");
                        int stock = scanner.nextInt();
                        scanner.nextLine();

                        almacen.agregarArticulo(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));
                        break;

                    case 3:
                        System.out.print("Ingrese el código del artículo a eliminar: ");
                        codigo = scanner.nextLine();
                        almacen.modificarArticulo(codigo, null, null, null, 0);
                        break;

                    case 4:
                        System.out.print("Ingrese el código del artículo a modificar: ");
                        codigo = scanner.nextLine();
                        System.out.print("Nueva descripción: ");
                        String nuevaDescripcion = scanner.nextLine();
                        System.out.print("Nuevo precio de compra: ");
                        double nuevoPrecioCompra = scanner.nextDouble();
                        System.out.print("Nuevo precio de venta: ");
                        double nuevoPrecioVenta = scanner.nextDouble();
                        System.out.print("Nuevo stock: ");
                        int nuevoStock = scanner.nextInt();
                        scanner.nextLine();

                        almacen.modificarArticulo(codigo, nuevaDescripcion, nuevoPrecioCompra, nuevoPrecioVenta, nuevoStock);
                        break;

                    case 5:
                        System.out.print("Ingrese el código del artículo: ");
                        codigo = scanner.nextLine();
                        System.out.print("Cantidad a añadir: ");
                        int cantidadEntrada = scanner.nextInt();
                        scanner.nextLine();
                        almacen.entradaMercancia(codigo, cantidadEntrada);
                        break;

                    case 6:
                        System.out.print("Ingrese el código del artículo: ");
                        codigo = scanner.nextLine();
                        System.out.print("Cantidad a retirar: ");
                        int cantidadSalida = scanner.nextInt();
                        scanner.nextLine();
                        almacen.salidaMercancia(codigo, cantidadSalida);
                        break;

                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida.");
                scanner.nextLine(); // Limpiar buffer
                opcion = 0;
            }
        } while (opcion != 7);

        scanner.close();
    }
}

