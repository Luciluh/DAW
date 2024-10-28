package RepasoExamen;
/*
Crea un programa que reciba una lista de productos con su nombre, precio y cantidad. Usa printf para imprimir un reporte tipo tabla con los siguientes detalles:
Nombre (alineado a la izquierda con un ancho fijo de 15 caracteres)
Precio (con 2 decimales, alineado a la derecha en un campo de 10 caracteres)
Cantidad (alineada a la derecha con 5 caracteres).
Añade un total general calculado en la última línea usando printf.

 */
public class ejer4 {
    public static void main(String[] args) {
    
        String pro1 = "agua";
        String pro2 = "leche";
        String pro3 = "caramelos";
        float pre1 = 1.05f;
        float pre2 = 2.9f;
        float pre3 = 0.91f;

        System.out.printf("%-10.2f€ %15s", pre1,pro1);




        
    }
}
