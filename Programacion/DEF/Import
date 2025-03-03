/* APUNTES
-Empezar un codigo: 
public class vueltasTierra {
    public static void main(String[] args) {

    }
}________________________________________________________________
INVERTIR NUMERO:
while(num>0){
    inverso = inverso*10 + num%10 ;
    num = num/10 ;
}_____________________________________________________
- GENERAR NUMEROS ALEATORIOS: 
EN TRAMO
int num = (int)(Math.random()*(max-min+1)+min)
GENERA 10 NUM ALEATORIOS:
for (int i = 0; i < 10; i++) { 
            int aleatorio = (int)(Math.random() * (60 - 30 + 1)) + 30;
            System.out.println(aleatorio);
        }
_____________________________________________________________
- Locale, para usos de float 
Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
import java.util.Locale;
_________________________________________________________________
Para guardar numeros: 
(num+10)+num2%10
________________________________________________________________
Para cuadrar: 
System.out.printf("\033[1mLECTURA ILUSTRADA\n========================================\033[0m\n");
        System.out.printf("%-30s %8.2f€\n",codigo, precio);
        System.out.printf("%-30s %8.2f€\n",cantidad + " uds.", precioTotal);
        System.out.printf("%-30s %8.2f€\n","-" + descuento + "%", -descuentoAplicado);
        System.out.printf("%-30s %8.2f€\n","21% IVA", impuesto);
        System.out.printf("\033[1m\033[100m%-30s %8.2f€\033[0m\n","TOTAL",precioTotal-descuentoAplicado+impuesto);
________________________________________________________________
- Readline
var = (System.console().readLine()); 
num = Integer.parseInt(System.console().readLine()); 
_________________________________________________________________
- Constantes 
private static final float CAMBIO = 166.386f;
_______________________________________________________________

- Editar texto: negrita, subrayado y cursiva:
"\033[1mMensajecualquiera\033[0m";
Para el texto: \033[38;2;R;G;Bm -> RGB lo buscamos en google con el colorpicker
Para el fondo: \033[48;2;R;G;Bm -> RGB lo buscamos en google con el colorpicker
______________________________________________________
EXCEPCIONES
        try {
            
        } catch (Exception e) {   este valor lo copias de la terminal cuando te da error 
        Aqui ponemos el mensaje de error
        }finally{
        sc.close
        }
*/
/* EQUIS
import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ32Equis {
    public static void main(String[] args) {
        int alt ; 
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduzca una altura: ");
            alt = sc.nextInt();
            int espacios = alt -2 ; //es la relacion de espacios en la primera fila 
            int espaciosIzq = 0 ;
            int mitadAlt = alt/2 ;
            
    
    
            // Recorremos la figura entera 
            for (int i = 0; i < alt; i++) {  
    
                //pintamos los espacios a la izq
                for (int j = 0; j < espaciosIzq; j++) {
                    System.out.print(" ");
                }
                System.out.print("*"); //cuando termine de pintar los espacios necesito que pinte un *
    
                //pintamos espacios de dentro
                for (int j = 0; j < espacios; j++) {
                    System.out.print(" ");
                }//este if es para que justo en la mitad solo pinte un *
                if (i == mitadAlt) {
                    System.out.println("");
                }else{
                System.out.println("*");
                }
    
                // este if es para que en la mitad de la X se de la vuelta a los incrementos/decrementos
                if (i >= mitadAlt) {
                    espaciosIzq = Math.abs(espaciosIzq)-1;
                    espacios+=2;    
                } else {
                    espaciosIzq++;
                    espacios-=2;
                }
            }
            
        } catch (InputMismatchException e) {
            System.out.println("*** ERROR, EL PROGRAMA NO ADMITE CARACTERES ***");
    
        } finally {
        sc.close();
        }
    }
}

 */

/* PALOTES:
import java.util.Scanner;

public class ConversorPalotesBasico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        // Invertir el número
        int inverso = 0;
        while (numero > 0) {
            inverso = inverso * 10 + numero % 10;
            numero = numero / 10;
        }
        
        // Procesar el número invertido para el sistema de palotes
        String resultado = ""; // Inicializamos la cadena vacía
        while (inverso > 0) {
            int digito = inverso % 10;
            inverso /= 10;

            // Generar palotes para el dígito actual
            for (int i = 0; i < digito; i++) {
                resultado = resultado + "|"; // tambien podria poner: resultado += "|";  Concatenamos el carácter '|'
            }

            // Añadir un guion entre los dígitos (si no es el último)
            if (inverso > 0) {
                resultado = resultado + "-";  // tambien podria poner: resultado += "-";
            }
        }

        System.out.println("El número en el sistema de palotes es: " + resultado);
    }
}
*/

/* ROMBO
import java.util.Scanner;

public class EJ37Rombo {
    public static void main(String[] args) {
        
        int alt ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del rombo: ");
        alt = sc.nextInt();
        int espaciosIzq = (alt-1)/2 ; //relacion de espacios a la izq respecto a la altura
        int espaciosDentro = -1 ;

        //comprobamos que el numero introducido es válido
        if (alt<3 || alt%2==0) {
            System.out.println("***ERROR: VALOR INVÁLIDO***\n Solo se admiten valores impares mayores o iguales a 3, vuelva a intentarlo ");
        } else {
            
        }for (int i = 0; i < alt; i++) {

            //pinto espacios izq
            for (int j = 0; j < espaciosIzq; j++) {
                System.out.print(" ");
            }
            //pinto el primer *
            System.out.print("*");
            
            //pinto espacios dentro
            for (int j = 0; j < espaciosDentro; j++) {
                System.out.print(" ");
            }

            if (i==0 || i==alt-1) {
                System.out.println("");
            }else{
                //pinto el segundo *
                System.out.println("*");
            }

            if (i >= (alt/2)) {
                espaciosIzq++;
                espaciosDentro-=2;
            } else {
                espaciosIzq--;
                espaciosDentro+=2;
            }
        }

        sc.close();
    }
}
*/