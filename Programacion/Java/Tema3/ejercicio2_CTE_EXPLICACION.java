
import java.util.Scanner;

public class ejercicio2_CTE_EXPLICACION {

    private static final float CAMBIO = 166.386f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double euros; /*ES CORRECTO USAR EL DOUBLE PERO ES MEJOR EL FLOAT YA QUE SON CANTIDADES PEQUEÑAS */
        int pesetas; 

        /*
         * Para crear variables usaremos: private static final float CAMBIO = 166.386f [VA SIEMPRE DENTRO DE LA CLASE, 
         * AL COMIENZO Y FUERA DEL MAIN]
         * private = es la visibilidad 
         * final = indica que es cte
         * float = segun el tipo de valor que se le dé 
         * CAMBIO = nombre de la cte, siempr en mayuscula 
         */

        System.out.print("Introduzca la cantidad de euros que quiere convertir: " ); /*USAMOS EL PRINT Y NO PRINTLN PORQ LA ENTRADA DEL USUARIO
        QUEREMOS QUE ESTE EN LA MISMA LINEA QUE LA SALIDA POR PANTALLA */
        euros = sc.nextDouble();
        pesetas = (int)(euros * CAMBIO);
        System.out.printf("%.2f euros son %d pesetas.", euros, pesetas);

        sc.close();
    }
}
