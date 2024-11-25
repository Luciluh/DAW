import java.util.Scanner;

public class EJ37Rombo {
    public static void main(String[] args) {
        
        int alt ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del rombo: ");
        alt = sc.nextInt();
        int espaciosIzq = (alt-1)/2 ; //relacion de espacios a la izq respecto a la altura
        int espaciosDentro = -1 ;

        //comprobamos que el numero introducido es válido
        if (alt<3 || alt%2==0) {
            System.out.println("***ERROR: VALOR INVÁLIDO***\n Solo se admiten valores impares mayores o iguales a 3, vuelva a intentarlo ");
        } else {
            
        }for (int i = 0; i < alt; i++) {

            //pinto espacios izq
            for (int j = 0; j < espaciosIzq; j++) {
                System.out.print(" ");
            }
            //pinto el primer *
            System.out.print("*");
            
            //pinto espacios dentro
            for (int j = 0; j < espaciosDentro; j++) {
                System.out.print(" ");
            }

            if (i==0 || i==alt-1) {
                System.out.println("");
            }else{
                //pinto el segundo *
                System.out.println("*");
            }

            if (i >= (alt/2)) {
                espaciosIzq++;
                espaciosDentro-=2;
            } else {
                espaciosIzq--;
                espaciosDentro+=2;
            }
        }

        sc.close();
    }
}
