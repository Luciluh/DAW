public class mostrarArrayConIndice {

    public static void mostrarArrayConIndice(int array[]) {
        // Ajustar el ancho de las celdas (más amplio)
        int cellWidth = 8; // Ancho fijo para mayor claridad

        String separator = "\u2500".repeat(cellWidth);
        
        // Cabecera superior
        System.out.print("\u250C" + separator);
        for (int i = 1; i < array.length; i++) {
            System.out.print("\u252C" + separator);
        }
        System.out.println("\u2510");

        // Fila de índices
        System.out.print("\u2502" + centerText("Índice", cellWidth));
        for (int i = 0; i < array.length; i++) {
            System.out.print("\u2502" + centerText(String.valueOf(i), cellWidth));
        }
        System.out.println("\u2502");

        // Separador entre cabecera e información
        System.out.print("\u251C" + separator);
        for (int i = 1; i < array.length; i++) {
            System.out.print("\u253C" + separator);
        }
        System.out.println("\u2524");

        // Fila de valores
        System.out.print("\u2502" + centerText("Valor", cellWidth));
        for (int i = 0; i < array.length; i++) {
            System.out.print("\u2502" + centerText(String.valueOf(array[i]), cellWidth));
        }
        System.out.println("\u2502");

        // Pie inferior
        System.out.print("\u2514" + separator);
        for (int i = 1; i < array.length; i++) {
            System.out.print("\u2534" + separator);
        }
        System.out.println("\u2518");
    }

    private static String centerText(String text, int width) {
        if (text.length() >= width) {
            return text.substring(0, Math.min(text.length(), width));
        }
        int padding = (width - text.length()) / 2;
        String leftPad = " ".repeat(padding);
        String rightPad = " ".repeat(width - text.length() - padding);
        return leftPad + text + rightPad;
    }

}
