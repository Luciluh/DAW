
import java.util.Locale;
import java.util.Scanner;
public class tarea1 {
    private static final float CAMBIO_UA = 149.6f;
    public static void main(String[] args) {

        float radOrb;
        float uniAst;
        float forkep;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.printf("\033[1mPERIODO ORBITAL DEL PLANETA\033[0m\n");
        System.out.println("============================");
        System.out.print("Ingrese el radio orbital del planteta en millones de kilometros cuadrados: ");
        radOrb = sc.nextFloat();
        uniAst = radOrb/(CAMBIO_UA);
        forkep = (float)Math.sqrt(Math.pow(uniAst, 3));
        System.out.printf("El período orbital del planeta es aproximadamente \033[1m%.3f años\033[0m", forkep);

        sc.close();
        }
    }