import java.util.Locale;
import java.util.Scanner;

/*Ampliamos un ejercicio de la relación anterior para considerar las horas extras. 
Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta
que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
A partir de la hora 41, se pagan a 16 euros la hora.
 */
public class ejercicio3 {
    public static void main(String[] args) {

        float horas;
        float sueldo;
        float horasextra;
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        horas = sc.nextFloat();

        if (horas<=40 && horas>0) {
            sueldo = horas*12;
        } else {
            horasextra= horas - 40;
            sueldo = (40*12) + (horasextra*16); 
        }

        System.out.printf("El sueldo semanal que le corresponde es de %.1f euros.", sueldo);
        sc.close();
    }
}
