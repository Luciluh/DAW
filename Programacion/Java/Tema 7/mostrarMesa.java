public class mostrarMesa {

    /**
     * Funcion para mostrar la mesa del EJ15
     * @param mesa
     */
    public static void mostrarMesas(int[] mesa) {
        System.out.print("|Mesa nº   "); // 10 espacios
        for (int i = 0; i < mesa.length; i++) {
            System.out.printf("|  %2d  ", i);
        }
        System.out.println("|");
        System.out.print("|Ocupación ");
        for (int i = 0; i < mesa.length; i++) {
            System.out.printf("|  %2d  ", mesa[i]);
        }
        System.out.println("|");
    }
}
