import java.util.Scanner;

public class EJ04ConviAleat {
    private static final int COMBINACION = 8888;
    public static void main(String[] args) {
        
        int combi;
        int aleatorio;
        Scanner sc = new Scanner(System.in);

        // GENERAMOS UNA COMBINACION ALEATORIA: [0, 1) --> [1000, 9999]
        //[min, max)
        // float num = Math.random ()*(max-min) + min;
        //aleatorio = (int) Math.random()


        for (int i = 0; i < 4 ; i++) {
            System.out.print("Introduce la clave de la caja fuerte: ");
            combi = sc.nextInt();
            if (combi == COMBINACION) {
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
