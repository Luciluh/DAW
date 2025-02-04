package RepasoExamen;

import java.util.Locale;
import java.util.Scanner;

public class importante {
    public static void main(String[] args) {

        /* Locale, para usos de float */
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        import java.util.Locale;
        
        /*Scanner */
        String var;
        int num;
        Scanner sc = new Scanner(System.in);
        
        var = sc.nextLine(); 

        sc.close();

        /* readline*/
        var = (System.console().readLine()); 
        num = Integer.parseInt(System.console().readLine()); 

        /*Constantes */
        private static final float CAMBIO = 166.386f;


        /* Editar texto: negrita, subrayado y cursiva */
        "\033[1mMensajecualquiera\033[0m";

        // Para el texto: \033[38;2;R;G;Bm -> RGB lo buscamos en google con el colorpicker

        // Para el fondo: \033[48;2;R;G;Bm -> RGB lo buscamos en google con el colorpicker

        //Para queno haya problemas en las mayusculas o minusculas usaremos:
        toLowerCase()
        


    }
}
