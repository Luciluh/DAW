/*
* Realiza un conversor de pesetas a euros, La cantidad en pesetas que se quiere convertir
*deberá estar almacenada en un variable
 */
public class ejercicio5 {
    public static void main(String[] args) {
    
        double euros;
        double pesetas;

        pesetas = 34457.3;

        euros = pesetas / (166.386);

        System.out.printf("%.1f pesetas son %.1f euros.", pesetas, euros);
    }
}