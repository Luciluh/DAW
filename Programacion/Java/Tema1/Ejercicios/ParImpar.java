
import java.util.Scanner;

public class ParImpar {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero para comprobar si es par o impar");
        num = scanner.nextInt();

        if (num%2==0) { System.out.println ("El numero es par");
            
        } else {System.out.print("El numero no es par");
        }
        scanner.close();
    }
}
