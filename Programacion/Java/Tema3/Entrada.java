
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {
<<<<<<< HEAD

        String nombre;
        int edad;
        String linea;
        float valor;
=======
        String nombre ;
        int edad ;
        String linea ;
        float valor ;
>>>>>>> 556c27c0810e8637ea48a99482378ed5c0511d5e

        /* 
        //Solicitamos una cadena de caracteres:
        System.out.println("¿Cómo te llamas?") ;
        nombre = System.console().readLine() ; //Equivalente a Leer. 
        //readLine SIEMPRE devuelve un string

        //Solicitamos un valor de tipo entero:
        System.out.println("¿Cuántos años tienes?");
        linea = System.console().readLine() ;

        //Convertimos a tipo ENTERO el valor guardado en la cadena:
        edad = Integer.parseInt(linea) ;

        //Solicitamos un valor de tipo real:
        System.out.println("Dime un valor de tipo real: ") ;
        linea = System.console().readLine() ;

        //Convertimos a tipo real el valor guardado en la cadena:
        valor = Float.parseFloat(linea) ;        

        //Mostramos un mensaje
        System.out.println("Hola " + nombre + ". Encantada de conocerte.") ;
        System.out.printf("Veo que tienes %d años.\n",edad) ;
        System.out.printf("Tu valor de tipo real es %.2f.\n", valor) ; 
         */
        //UTILIZANDO LA CLASE SCANNER---------------------------------------
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt(); //Lo leo directamente como entero

        System.out.printf("Veo que tienes %d. y en 2025 tendrás %d", edad, ++edad);
    }
}
