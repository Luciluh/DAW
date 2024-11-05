import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        
        int num ;
        int i = 1 ; 
        Scanner sc = new Scanner(System.in);

        System.out.print("NÚMERO DE DÍGITOS DE UN NÚMERO\nIntroduzca un número entero: ");
        num = sc.nextInt();

        int resultado = num ; 

        // Si el número es negativo, lo convertimos a positivo para contar los dígitos correctamente
        if (num < 0) {
            num = Math.abs(num);
        }

        do {
            num = num/10;
            i++ ; 
            } while (num>10);

        if (resultado<10) {
            System.out.printf("%d tiene 1 dígito.",resultado);
        } else if (resultado>10) {
            System.out.printf("%d tiene %d dígitos.",resultado,i);
        }

        sc.close();
    }
}
