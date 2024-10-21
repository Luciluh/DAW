
import java.util.Scanner;

public class suma {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma1;
        double suma2;
        double resultado;
        
        System.out.println("Introduce un sumando");
        suma1 = scanner.nextDouble();
        System.out.println("Introduce el segundo sumando");
        suma2 = scanner.nextDouble();
        resultado = suma1 + suma2;
        System.out.println("El resultado de la suma es: " + resultado);
        scanner.close();
    }
}
