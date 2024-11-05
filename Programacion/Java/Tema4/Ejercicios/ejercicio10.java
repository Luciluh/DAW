import java.util.Scanner;

/*
Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar a medianoche
 */
public class ejercicio10 {
    public static void main(String[] args) {

        int hora;
        int minutos;
        int segMedNoch; //segundos que faltan para la media noche
        int segTot; //voy a usar esta variable para guardar aqui la conversion a segundos de la hora que introduzca el usuario 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        hora = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        minutos = sc.nextInt();

        //al hacer el if me estoy asegurando de que no se podrá introducir un formato mayor que 24 en horas y mayor que 60 en minutos 
        if (hora <= 24 && minutos <= 60) {
            segTot = (hora*3600) + (minutos*60);

        //en 24h hay 86400 segundos

        segMedNoch = 86400 - segTot;

        System.out.printf("Desde las %d:%d hasta la media noche faltan %d segundos.", hora, minutos,segMedNoch);
        } else {
            System.out.println("El formato introducido no es correcto, vuelva a intentarlo de nuevo.");
        }
        sc.close();
    }
}
