package EJ22;

import java.util.Scanner;

public class Main {
    private static Coleccion coleccion = new Coleccion();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("====================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    listarDiscos();
                    break;
                case 2:
                    agregarDisco();
                    break;
                case 3:
                    modificarDisco();
                    break;
                case 4:
                    borrarDisco();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void listarDiscos() {
        System.out.println("\nLISTADO");
        System.out.println("=======");
        for (Disco disco : coleccion.getDiscos()) {
            System.out.println(disco);
        }
    }

    private static void agregarDisco() {
        System.out.println("\nNUEVO DISCO");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Género: ");
        String genero = scanner.nextLine();
        System.out.print("Duración (en minutos): ");
        int duracion = scanner.nextInt();
        scanner.nextLine();

        coleccion.agregarDisco(new Disco(codigo, autor, titulo, genero, duracion));
        System.out.println("Disco agregado correctamente.");
    }

    private static void modificarDisco() {
        System.out.print("\nIngrese el código del disco que desea modificar: ");
        String codigo = scanner.nextLine();
        Disco discoExistente = coleccion.buscarDisco(codigo);

        if (discoExistente != null) {
            System.out.print("Nuevo código (ENTER para no cambiar): ");
            String nuevoCodigo = scanner.nextLine();
            if (nuevoCodigo.isEmpty()) nuevoCodigo = discoExistente.getCodigo();

            System.out.print("Nuevo autor (ENTER para no cambiar): ");
            String nuevoAutor = scanner.nextLine();
            if (nuevoAutor.isEmpty()) nuevoAutor = discoExistente.toString();

            System.out.print("Nuevo título (ENTER para no cambiar): ");
            String nuevoTitulo = scanner.nextLine();
            if (nuevoTitulo.isEmpty()) nuevoTitulo = discoExistente.toString();

            System.out.print("Nuevo género (ENTER para no cambiar): ");
            String nuevoGenero = scanner.nextLine();
            if (nuevoGenero.isEmpty()) nuevoGenero = discoExistente.toString();

            System.out.print("Nueva duración (0 para no cambiar): ");
            int nuevaDuracion = scanner.nextInt();
            scanner.nextLine();
            if (nuevaDuracion == 0) nuevaDuracion = discoExistente.toString().length();

            Disco nuevoDisco = new Disco(nuevoCodigo, nuevoAutor, nuevoTitulo, nuevoGenero, nuevaDuracion);
            coleccion.modificarDisco(codigo, nuevoDisco);
            System.out.println("Disco modificado correctamente.");
        } else {
            System.out.println("Disco no encontrado.");
        }
    }

    private static void borrarDisco() {
        System.out.print("\nIngrese el código del disco que desea borrar: ");
        String codigo = scanner.nextLine();

        if (coleccion.borrarDisco(codigo)) {
            System.out.println("Disco eliminado correctamente.");
        } else {
            System.out.println("Disco no encontrado.");
        }
    }
}

