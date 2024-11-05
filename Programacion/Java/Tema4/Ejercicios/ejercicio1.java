package Tema4.Ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa que pida por teclado un día de la semana y 
 * que diga qué asignatura toca a primera hora de ese día.
 */
public class ejercicio1 {
    public static void main(String[] args) {

        String dia;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un día de la semana y te diré qué asignatura toca a primera hora de ese día:");
        dia = sc.nextLine();

        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("PROGRAMACION");
                break;
            case "martes":
                System.out.println("BBDD");
                break;
            case "miercoles":
                System.out.println("SISTEMAS");
                break;
            case "jueves":
                System.out.println("ENTORNOS");
                break;
            case "viernes":
                System.out.println("LENGUAJE DE MARCAS");
                break;
        
            default: System.out.println("El día introducido no es correcto");
                break;
        }
        sc.close();
    }
}
