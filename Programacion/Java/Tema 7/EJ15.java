import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {

        int mesa[] = new int[11];
        int grupo;
        Scanner sc = new Scanner(System.in);

        // Generamos ocupaciones aleatorias de mesas.
        for (int i = 0; i < mesa.length; i++) {
            mesa[i] = (int) (Math.random() * (4 - 0 + 1) + 0);
        }

        // Mostramos la ocupación inicial
        mostrarMesa.mostrarMesas(mesa);

        // Preguntamos cuántos comensales son
        do {
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            grupo = sc.nextInt();

            if (grupo == -1) {
                break; // Salir del programa
            }

            if (grupo > 4) {
                System.out.println("Lo siento, no admitimos grupos de más de 4 personas.");
                continue; // Pedir un nuevo grupo
            }

            boolean asignado = false;

            // Intentar asignar a una mesa vacía
            for (int i = 0; i < mesa.length; i++) {
                if (mesa[i] == 0) {
                    mesa[i] = grupo;
                    asignado = true;
                    break;
                }
            }

            // Si no se asignó a una mesa vacía, intentar asignar a una mesa parcialmente ocupada
            if (!asignado) {
                for (int i = 0; i < mesa.length; i++) {
                    if (mesa[i] + grupo <= 4) {
                        mesa[i] += grupo;
                        asignado = true;
                        break;
                    }
                }
            }

            // Si no se pudo asignar, informar al usuario
            if (!asignado) {
                System.out.println("Lo siento, no hay espacio suficiente para su grupo.");
            }

            // Mostrar la ocupación actual
            mostrarMesa.mostrarMesas(mesa);

        } while (grupo != -1);

        sc.close();
    }


}
