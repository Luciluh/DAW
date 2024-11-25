import java.util.Scanner;

public class EJ35(incabado) {
    public static void main(String[] args) {
        
        int alt ; 
        int espaciosIzq = 0 ; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del reloj de arena: ");
        alt = sc.nextInt();
         //comprobamos que el numero introducido es válido
        if (alt<3 || alt%2==0) {
            System.out.println("***ERROR: VALOR INVÁLIDO***\n Solo se admiten valores impares mayores o iguales a 3, vuelva a intentarlo ");
        } else {

            for (int i = 0; i < alt; i++) {
                System.out.println("*");
                for (int j = 0; j < espaciosIzq; j++) {
                    System.out.print(" ");
                }
            if (i < (alt/2)) {
                
            } else {
                
            }
            }

        }


        sc.close();

    }
}
