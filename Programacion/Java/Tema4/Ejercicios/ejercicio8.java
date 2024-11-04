package Tema4.Ejercicios;

import java.util.Locale;
import java.util.Scanner;

/*
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0).
 */
public class ejercicio8 {
    public static void main(String[] args) {

        float a ;
        float b ;
        float c ;
        double sol1 ; //solucion1
        double sol2 ; //solucion2
        double raiz ; //aqui voy a meter la parte que nos causa problemas a la hora de si existen o no soluciones
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Este programa resuelve ecuaciones de segundo grado."); 
        System.out.println("ax2 + bx + c = 0");
        System.out.println("Introduce los valores:");
        System.out.print("a = ");
        a = sc.nextFloat();
        System.out.print("b = ");
        b = sc.nextFloat();
        System.out.print("c = ");
        c = sc.nextFloat();

        sol1 = ((-b) + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a); //primera solucion con la + 
        sol2 = ((-b) - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a); //segunda solucion con la -

        raiz = Math.sqrt(Math.pow(b, 2) - 4*a*c);

        // Aquí lo he hecho asi porque solo cuando ambas variables a,b y c son = 0 la ec. tiene infinitas soluciones PERO tambien cuando a=0 (es decir cuando el denominador(a) es = 0) no tiene sol.
        //Entonces me entraba por ambos if si lo ponia separados. 
        if (a==0 && b==0 && c==0) {
            System.out.println("La ecuacion tiene infinitas soluciones ");
        } else if (a==0) {
            System.out.println("La ecuacion NO tiene soluciones ");
        }

        
        if (raiz>0) { //si la raiz es positiva tendrá las dos soluciones
            sol1 = ((-b) + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a); //primera solucion con la + 
            sol2 = ((-b) - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a); //segunda solucion con la -
            System.out.printf("x1 = %.1f\nx2 = %.1f", sol1,sol2); // mostramos las soluciones por pantalla
        } else if (raiz == 0) {
            sol1 = (-b)/(2*a);
        } else if (raiz < 0) {
            System.out.println("La ecuacion tiene soluciones reales");
        } 

        sc.close();
    }
}
