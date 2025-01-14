
import java.util.Locale;
import java.util.Scanner;

public class tarea5 {
    public static void main(String[] args) {

        int codLib; //codigolibro
        float preUnd; //precio unidad
        int can; //cantidad
        float des; //descuento
        int iva = 21; 
        float total; //precio total
        float preTotLib;
        float preDesc;
        float preiva;

        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);


        System.out.printf("\033[1mLECTURA ILUSTRADA\033[0m\n");
        System.out.println("============================");
        System.out.print("Introduce el código de libro: ");
        codLib = sc.nextInt();
        System.out.print("Introduce el precio unitario: ");
        preUnd = sc.nextFloat();
        System.out.print("Introduce la cantidad: ");
        can = sc.nextInt();
        System.out.print("Introduce el descuento (%): ");
        des = sc.nextFloat();

        preTotLib = preUnd*(float)can;
        preDesc = preTotLib * (des/(float)100);
        preiva = (preTotLib-preDesc) * ((float)iva/(float)100);
        total = preUnd + preTotLib - preDesc + preiva;

        System.out.println("");
        System.out.println("Su ticket:");
        System.out.println("");

        System.out.printf("\033[1mLECTURA ILUSTRADA\033[0m\n");
        System.out.println("============================");
        System.out.printf("%d %25.2f\n", codLib,preUnd); //me falta poner los €
        System.out.printf("%d uds. %20.2f€\n", can,preTotLib); //me falta poner los €
        System.out.printf("-%.0f%% %23.2f\n", des,preDesc); //me falta poner los € y el - 
        System.out.printf("%d%% IVA %19.2f\n", iva,preiva); //me falta poner los € y el - 
        System.out.printf("\033[100mTOTAL %21.2f\033[0m\n", total ); //me falta poner los € y el - 

        sc.close();
    }
}
