import java.util.Scanner;

/*
Escribe un programa que nos diga el horóscopo a partir del día y mes de nacimiento.
Aries: del 21 de marzo al 19 de abril
Tauro: del 20 de abril al 20 de mayo
Géminis: del 21 de mayo al 20 de junio
Cáncer: del 21 de junio al 22 de julio
Leo: del 23 de julio al 22 de agosto
Virgo: del 23 de agosto al 22 de septiembre
Libra: del 23 de septiembre al 22 de octubre
Escorpio: del 23 de octubre al 21 de noviembre
Sagitario: del 22 de noviembre al 21 de diciembre
Capricornio: del 22 de diciembre al 19 de enero
Acuario: del 20 de enero al 18 de febrero
Piscis: del 19 de febrero al 20 de marzo
 */
public class ejercicio9 {
    public static void main(String[] args) {

        int mes;
        int dia;
        String horoscopo; 
        Scanner sc = new Scanner(System.in);


    System.out.println("Este programa te dirá cuál es tu horóscopo.");
    System.out.print("Introduce el número del mes en que nació (1-12): ");
    mes = sc.nextInt();
    System.out.print("Ahora introduce el día: ");
    dia = sc.nextInt();

    /* EXPLICACIÓN DE EVALUAR UNA CONDICION
    Condición (dia <= 19): Esto verifica si el día ingresado es menor o igual a 19.
    Operador ternario ? :: Este operador evalúa una condición y asigna un valor basado en si la condición es true o false.
    Si (dia <= 19) es true, entonces se asigna "Capricornio" a la variable signo.
    Si (dia <= 19) es false, se asigna "Acuario". 
    */
        switch (mes) {
            case 1:
                horoscopo = (dia <= 19) ? "Capricornio" : "Acuario";
                break;
            case 2:
                horoscopo = (dia <= 18) ? "Acuario" : "Piscis";
                break;
            case 3:
                horoscopo = (dia <= 20) ? "Piscis" : "Aries";
                break;
            case 4:
                horoscopo = (dia <= 19) ? "Aries" : "Tauro";
                break;
            case 5:
                horoscopo = (dia <= 20) ? "Tauro" : "Géminis";
                break;
            case 6:
                horoscopo = (dia <= 20) ? "Géminis" : "Cáncer";
                break;
            case 7:
                horoscopo = (dia <= 22) ? "Cáncer" : "Leo";
                break;
            case 8:
                horoscopo = (dia <= 22) ? "Leo" : "Virgo";
                break;
            case 9:
                horoscopo = (dia <= 22) ? "Virgo" : "Libra";
                break;
            case 10:
                horoscopo = (dia <= 22) ? "Libra" : "Escorpio";
                break;
            case 11:
                horoscopo = (dia <= 21) ? "Escorpio" : "Sagitario";
                break;
            case 12:
                horoscopo = (dia <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                horoscopo = "Fecha no válida";
        }

    System.out.printf("Su horóscopo es %s", horoscopo);

    sc.close();
    }
}
