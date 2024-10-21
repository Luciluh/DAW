import java.util.Scanner;

public class ejemploentrada {
    @SuppressWarnings("ConvertToTryWithResources") /* NO LE HAGAS CASO LUCIA, ES PARA QUE NO SALGA EL ERROR */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String nombre; 
        int edad; 
        
        System.out.println("Introduce tu nombre");
        nombre = scanner.nextLine(); /* Siempre que vayamos a introducir por consola una cadena o algo que queramos tratar como
        cadena, usaremos el "nextline" */
        System.out.println("Introduce tu edad");
        edad = scanner.nextInt();
        System.out.println("Introduce tu teléfono");
        num = scanner.nextInt();
        System.out.printf("Mi nombre es %s y tengo %d años. Mi numero de teléfono es %d", nombre, edad, num);
        scanner.close();
    }
}
