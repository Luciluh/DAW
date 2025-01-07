import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        
        String colores[] = {"Rojo", "Azul", "Amarillo", "Naranja", "Rosa", "Negro", "Blanco", "Morado"};
        String original[] = new String[8];
        boolean esColor = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca 8 palabras (vaya pulsando INTRO entre una y otra).");
        for (int i = 0; i < original.length; i++) {
            original[i] = sc.nextLine();
        }
        
        // Mostrar el array original
        System.out.println("Array original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + "    ");
        }
        System.out.println();

        // Imprimir colores que coinciden
        System.out.println("Array resultante: ");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < colores.length; j++) {
                if (original[i].equals(colores[j])) {
                    System.out.print(original[i] + "    ");
                    break; // Evitar imprimir duplicados
                }
            }
        }
        // Imprimir palabras que no son colores
        
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < colores.length; j++) {
                esColor = false;

                if (original[i].equals(colores[j])) {
                    esColor = true; // Encontramos una coincidencia
                    break;
                }
            }
            if (esColor==false) {
                System.out.print(original[i] + "    ");
            }
        }
        System.out.println();

        sc.close();
    } 
}

