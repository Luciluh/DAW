
import java.util.Scanner;
/* ME FALTAN LAS CONVERSIONES DE HORAS, MIN Y SEG */
public class tarea3 {
    public static void main(String[] args) {

        float seg;
        float min;
        float min2;
        float hor;
        float hor2;
        float dia;
        float dia2;
        float seg2;
        Scanner sc = new Scanner(System.in);

    
        System.out.printf("\033[1mCALCULADORA DE TIEMPO\033[0m\n");
        System.out.println("===================");
        System.out.print("Introduce una cantidad en segundos: ");
        seg = sc.nextInt();

        dia = seg/86400f;
        dia2 = dia;
        dia = seg%86400f;

        hor = dia/3600f;
        hor2 = hor;
        hor = dia%3600f;

        min = hor/60f;
        min2 = min;
        min = hor%60f;

        seg2 = hor%60f;
        

        System.out.printf("%.0f segundos son \033[46m%.0f días\033[0m \033[43m%.0f horas\033[0m \033[41m%.0f minutos\033[0m y \033[42m%.0f segundos\033[0m", seg, dia2, hor2, min2, seg2);


        sc.close();
    }
}
