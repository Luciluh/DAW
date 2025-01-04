public class mostrarArrayConIndice {
    
        /**
     * Muestra un array como una tabla con sus índices de posición como cabecera.
     * 
     * @param array El array a mostrar.
     */
    public static void mostrarArrayConIndice(int array[]) {
        String cadena = "\u2500\u2500\u2500\u2500\u2500\u2500";

        // Cabecera superior
        System.out.printf("\u250C%s", cadena);
        for (int i = 0; i < array.length; i++) {
            System.out.print(cadena);
            System.out.printf("%s", (i < array.length - 1) ? "\u252C" : "\u2510\n");
        }

        // Fila de índices
        System.out.print("\u2502 Índice \u2502");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %3d \u2502", i);
        }
        System.out.println();

        // Separador entre cabecera e información
        System.out.printf("\u251C%s", cadena);
        for (int i = 0; i < array.length; i++) {
            System.out.print(cadena);
            System.out.printf("%s", (i < array.length - 1) ? "\u253C" : "\u2524\n");
        }

        // Fila de valores
        System.out.print("\u2502 Valor \u2502");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %3d \u2502", array[i]);
        }
        System.out.println();

        // Pie inferior
        System.out.printf("\u2514%s", cadena);
        for (int i = 0; i < array.length; i++) {
            System.out.print(cadena);
            System.out.printf("%s", (i < array.length - 1) ? "\u2534" : "\u2518\n");
        }
    }

}
