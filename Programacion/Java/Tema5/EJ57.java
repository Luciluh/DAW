import java.util.Scanner;

public class EJ57 {
    public static void main(String[] args) {

        int alt ; 
        int esteriscos;
        int espaciosIzq = 0 ;
        Scanner sc = new Scanner(System.in); 
        
        
        System.out.print("Introduce la altura de la V (número mayor o igual a 3): ");
        alt = sc.nextInt();
        if (alt<3) {
            System.out.println("***ERROR: ALTURA NO VÁLIDA***");
            while (alt<3) {
                //pedimos el valor
                System.out.print("Introduce la altura de la V (número mayor o igual a 3): ");
                alt = sc.nextInt();
            }
            
        }
        int espacios = 3*(alt-2) ;

        for (int i = 0; i < alt-1; i++) {

            //pintamos los espacios a la izq
            for (int j = 0; j < espaciosIzq; j++) {
                System.out.print(" ");
            }
            System.out.print("***");
            //pintamos espacios dentro
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            System.out.println("***");

            espaciosIzq++;
            espacios-=2;
        
        sc.close();

            
        }







        sc.close();
    }
}
