import java.util.Scanner;

public class EJ13 {
    
    public static void main(String[] args) {
        
        int altura;
        Scanner sc = new Scanner(System.in);
        int espacios = 1;
        
        
        System.out.print("Introduzca una altura para la figura: ");
        altura = sc.nextInt();
        int asteriscos = altura;
        int espaciosDentro = altura - 3 ;
        
        //pintamos asteriscos fila completa
        for (int j = 0; j < asteriscos; j++) {
            System.out.print("*");
        }
        System.out.println(" ");

        for (int i = 1; i < altura; i++) { 
            
            //pintamos espacios izq
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            if (i!=altura-1) {
                System.out.print("*");
            }
            //pintamos espacios dentro 
            for (int j = 0; j < espaciosDentro; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            espacios ++;
            espaciosDentro--;

        }
        sc.close();
    }
}
