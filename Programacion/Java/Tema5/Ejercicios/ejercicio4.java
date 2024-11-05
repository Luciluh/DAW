import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
        int combi;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4 ; i++) {
            System.out.print("Introduce la clave de la caja fuerte: ");
            combi = sc.nextInt();
            if (combi == 8888) {
                System.out.println("Se ha abierto la caja fuerte");
                i = 4;
            } else if (i==3) {
                System.out.println("Lo siento, ha agotado las 4 oportunidades.\nSe ha emitido un aviso a la policía.");
            } else {
                System.out.println("Clave incorrecta");
            }
        }
        sc.close();
    }
}
