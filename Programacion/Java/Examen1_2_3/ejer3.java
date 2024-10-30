package RepasoExamen;
/*
 * ALGORITMO QUE:
- Permite agregar, eliminar y listar tareas.
- Cada tarea debe tener un nombre y una prioridad (baja, media, alta).
- Usa secuencias de printf para mostrar la lista en un formato tabulado que incluya negrita o subrayado para destacar la prioridad alta.
- Utiliza caracteres Unicode para agregar iconos en cada línea (por ejemplo, un icono de check para tareas completadas).

 */
import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {

        String tar1;
        String tar2;
        String tar3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una tarea prioritaria de orden 1: \n");
        tar1 = sc.nextLine();

        System.out.printf("\033[44mLa siguiente tarea está guardada como prioritaria (orden 1):\033[0;4\033[1m %s \033[0m", tar1);


        sc.close();
    }
}
