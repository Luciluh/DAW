import java.util.Scanner;

public class EJ07 {
    public static void main(String[] args) {
        
        int num ;
        int total = 0 ; 
        int i = 0; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa calcula la media de los números positivos introducidos.\nPara parar, introduzca un número negativo.\nVaya introduciendo números:");

        do {
            num = sc.nextInt();
            if (num>0) {
                total = total + num ; 
                i++;                 
            }
        } while (num>0);

        float resultado = total/i;

        System.out.printf("La media de los numeros introducidos es %.2f", resultado);

        sc.close();
    }
}
