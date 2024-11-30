import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ32Equis {
    public static void main(String[] args) {
        int alt ; 
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduzca una altura: ");
            alt = sc.nextInt();
            int espacios = alt -2 ; //es la relacion de espacios en la primera fila 
            int espaciosIzq = 0 ;
            int mitadAlt = alt/2 ;
            
    
    
            // Recorremos la figura entera 
            for (int i = 0; i < alt; i++) {  
    
                //pintamos los espacios a la izq
                for (int j = 0; j < espaciosIzq; j++) {
                    System.out.print(" ");
                }
                System.out.print("*"); //cuando termine de pintar los espacios necesito que pinte un *
    
                //pintamos espacios de dentro
                for (int j = 0; j < espacios; j++) {
                    System.out.print(" ");
                }//este if es para que justo en la mitad solo pinte un *
                if (i == mitadAlt) {
                    System.out.println("");
                }else{
                System.out.println("*");
                }
    
                // este if es para que en la mitad de la X se de la vuelta a los incrementos/decrementos
                if (i >= mitadAlt) {
                    espaciosIzq = Math.abs(espaciosIzq)-1;
                    espacios+=2;    
                } else {
                    espaciosIzq++;
                    espacios-=2;
                }
            }
            
        } catch (InputMismatchException e) {
            System.out.println("*** ERROR, EL PROGRAMA NO ADMITE CARACTERES ***");
    
        } finally {
        sc.close();
        }
    }
}
