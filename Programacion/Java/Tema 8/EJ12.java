import java.util.Scanner;

public class EJ12 {
    
    public static void main(String[] args) {
        
        int altura;
        Scanner sc = new Scanner(System.in);
        int espacios = 1;

        
        System.out.print("Introduzca una altura para la figura: ");
        altura = sc.nextInt();
        int asteriscos = altura;

        for (int i = 0; i < altura; i++) {
            
            //pintamos asteriscos
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

            //pintamos espacios izq
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            asteriscos --;
            espacios ++;

        }
        sc.close();
    }
}
