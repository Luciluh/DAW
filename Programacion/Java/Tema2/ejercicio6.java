/*
 * Ejercicio 6.- Escribe un programa que calcule el total de una factrura a partir
 * de la base imponible(precio sin iva). La base imponible estara almacenada en una variable.
 */
public class ejercicio6 {
    public static void main(String[] args) {

    double base = 522.98;
    int iva = 21;
    double total;

    total = base * ((double)iva/100);

    System.out.printf("Base imponible         %.2f\n" , base);
    System.out.printf("IVA                    %d\n" , iva);
    System.out.println("------------------------------" );
    System.out.printf("Total                  %.2f", total);
    }
}
