
import java.util.Locale;
import java.util.Scanner;
public class tarea2 {
    private static final float PI = 3.1415f;
    public static void main(String[] args) {

        float rad;
        float alt;
        float vol;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        

        System.out.printf("\033[1mVOLUMEN DE UN CONO\033[0m\n");
        System.out.println("===================");
        System.out.print("Ingrese el radio de la base del cono (cm): ");
        rad = sc.nextFloat();
        System.out.print("Ingrese el radio de la altura del cono (cm): ");
        alt = sc.nextFloat();

        vol= ((float)1/3) * PI * (float)Math.pow(rad, 2) * alt;

        System.out.printf("El volumen del cono es: \033[31m\033[1m%.2f cm\u00b3 \033[0m", vol);

        sc.close();
    }
}
