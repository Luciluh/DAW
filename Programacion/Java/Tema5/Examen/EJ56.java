import java.util.Scanner;

public class EJ56 {
    public static void main(String[] args) {
        
        int alt ;
        int espaciosDentro = -3;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la altura del arbol (numero mayor o igual a 4): ");
        alt = sc.nextInt();

        //definimos y damos relacion entre altura y espacios izq
        int espaciosIzq = (alt-3);

        //bucle para recorrer altura
        for (int i = 0; i < alt; i++) {

            //creamos la condicion para que pinte el troco, la estrella y la primera fila del arbol
            if (i==0 || i==1 || i==(alt-1)) {
                espaciosIzq = (alt-3);
            }
            //pintamos espacios iqz
            for (int j = 0; j < espaciosIzq; j++) {
                System.out.print(" ");
            }
            //pinto la estrella
            if (i==0) {
                System.out.print("*");
            } else {
                System.out.print("^");
            }
            

            for (int j = 0; j < espaciosDentro; j++) {
                if (i == alt-2) {
                    System.out.print("^");
                }else{
                    System.out.print(" ");
                }
            }
            if (i>1 && i!=alt-1) {
                System.out.print("^");
            }
            
            System.out.println(" ");
            espaciosDentro +=2;
            espaciosIzq --;
            
            
        }
        sc.close();
    }
}
