import java.util.Scanner;
/*
Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser una letra, 
un número o un símbolo como *, +, -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si el 
vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 */
public class ejercicio13 {
    public static void main(String[] args) {

        String caracter;
        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa pinta una piramide.");
        System.out.println("Introduzca el caracter de relleno: ");
        caracter = sc.nextLine();
        System.out.println("Elija un tipo de pirámide:");
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("  " + caracter);
                System.out.println(" " + caracter + caracter + caracter);
                System.out.println(caracter + caracter + caracter + caracter + caracter);
                break;

            case 2:
            System.out.println(caracter + caracter + caracter + caracter + caracter);
            System.out.println(" " + caracter + caracter + caracter + " ");
            System.out.println("  " + caracter + " ");
            break;

            case 3:
            System.out.println("  " + caracter);
            System.out.println(" " + caracter + caracter);
            System.out.println(caracter + caracter + caracter);
            System.out.println(" " + caracter + caracter);
            System.out.println("  " + caracter);
            break;

            case 4:
            System.out.println(caracter);
            System.out.println(caracter + caracter);
            System.out.println(caracter + caracter + caracter);
            System.out.println(caracter + caracter);
            System.out.println(caracter);
            break;
        
            default:
            System.out.println("Este numero no es una opcion, intentelo de nuevo.");
                break;
        }
        sc.close();

    }
}

/*
char car;
String cadena;
Scanner sc = new Scanner(System.in);

System.out.println("Introduzca el caracter de relleno: ");
caracter = sc.nextLine();
car= cadena.charAt(index:0)

*SIMPLIFICANDO*
car = sc.nextLine().charAt(index:0)


 */