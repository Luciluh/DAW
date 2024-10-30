package RepasoExamen;

import java.util.Scanner;

/*
Crea un programa que permita al usuario escoger un color de texto y de fondo en RGB mediante tres valores (0-255) para cada uno. 
Usa los códigos ASCII para configurar el color de texto y fondo en consola.
Imprime un mensaje personalizado con estos estilos y colores elegidos.

 */
public class ejer5 {
    public static void main(String[] args) {

        int colorRFondo;
        int colorGFondo;
        int colorBFondo;
        int colorRLetra;
        int colorGLetra;
        int colorBLetra;
        Scanner sc = new Scanner(System.in);

        System.out.print("Elige tres numeros para crear un color personalizado de letra (valores entre 0-255): ");
        colorRLetra = sc.nextInt();
        colorGLetra = sc.nextInt();
        colorBLetra = sc.nextInt();

        System.out.printf("El color de letra elegido ha sido: \033[38;2;%d;%d;%dm Color letra \033[0m\n",colorRLetra,colorGLetra,colorBLetra);

        System.out.print("Elige tres numeros para crear un color personalizado de fondo (valores entre 0-255): ");
        colorRFondo = sc.nextInt();
        colorGFondo = sc.nextInt();
        colorBFondo = sc.nextInt();

        System.out.printf("El color de fondo elegido ha sido: \033[48;2;%d;%d;%dm Color fondo \033[0m\n",colorRFondo,colorGFondo,colorBFondo);

        System.out.printf ("\033[48;2;%d;%d;%dm\033[38;2;%d;%d;%dm Este ha sido finalmente tu creacion\033[0m \u263B",colorRFondo,colorGFondo,colorBFondo,colorRLetra,colorGLetra,colorBLetra);



        
    }
}
