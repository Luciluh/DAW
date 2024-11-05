import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int  minDia = 24 * 60; // 1440 minutos por día
        int  minViernes = (4 * minDia) + (15 * 60); // Minutos desde lunes 00:00 hasta viernes 15:00
        int minutosDesdeLunes = 0;

        System.out.print("Introduzca un día de la semana (de lunes a viernes): ");
        String dia = scanner.nextLine().toLowerCase();

        System.out.print("Hora: ");
        int hora = scanner.nextInt();

        System.out.print("Minutos: ");
        int minutos = scanner.nextInt();


        // calculo los minutos transcurridos desde el lunes 00:00 hasta el día y la hora 
        switch (dia) {
            case "lunes":
                minutosDesdeLunes = hora * 60 + minutos;
                break;
            case "martes":
                minutosDesdeLunes = minDia + hora * 60 + minutos;
                break;
            case "miércoles":
            case "miercoles":
                minutosDesdeLunes = 2 * minDia + hora * 60 + minutos;
                break;
            case "jueves":
                minutosDesdeLunes = 3 * minDia + hora * 60 + minutos;
                break;
            case "viernes":
                minutosDesdeLunes = 4 * minDia + hora * 60 + minutos;
                break;
            default:
                System.out.println("Día no válido.");
                return;
        }

        // calculo los minutos restantes para el fin de semana
        int minutosFaltantes = minViernes- minutosDesdeLunes;

        System.out.println("Faltan " + minutosFaltantes + " minutos para llegar al fin de semana.");
        scanner.close();
    }
}
