/*
* ERealiza un conversor de euros a pesetas, La cantidad en euros que se quiere convertir
*deberá estar almacenada en un variable
 */
public class ejercicio4 {
    public static void main(String[] args) {
    
        double euros;
        double pesetas;

        euros = 5.3;

        pesetas = euros * (166.386);

        System.out.printf("%.1f euros son %.1f pesetas.", euros, pesetas);
    }
}
