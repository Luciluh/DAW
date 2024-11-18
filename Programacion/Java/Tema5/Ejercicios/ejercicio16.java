/* 
Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir
por teclado. El carácter con el que se pinta la pirámide también se debe pedir por
teclado.
*/
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        
        char caracter;
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduczca un caracter para pintar la piramide: ");
        caracter = sc.next().charAt(0);

        System.out.print("Ingresa la altura de la piramide que deseas: ");
        num = sc. nextInt();
        
        System.out.println();

        //recorremos filas hacia abajo
        for(int i = 1; i<=num; i++){

            //Espacios en blanco
            for(int blancos = 1; blancos<=num-i; blancos++){
                System.out.print(" ");
            }

            //pinta 
            for(int pinta =1; pinta <=(i*2)-1; pinta ++){
                System.out.print(caracter);
            }
            System.out.println();

            sc.close();
        }
    }
}


