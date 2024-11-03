package Java.Tema4.Apuntes;

import java.util.Scanner;

public class AprobadoSuspenso {
    public static void main(String[] args) {

        float nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué nota has sacado en tu ultimo examen?");
        nota = sc.nextFloat();

        /*SENTENCIA SELECCION 
        if (nota>=5) {
            System.out.println("Enhorabuena, has aprobado");
        } else {
            System.out.println("Lo siento :( Has suspendido");
        }*/

        //Operador ternario

        //System.out.println((nota>=5)?"Enhorabuena, has aprobado":"Lo siento :( Has suspendido");


        //Para controlar los valores incorrectos: 

        if ((nota >=0)&&(nota<5)) {
            System.out.println("Lo siento :( Has suspendido.");  
        } else if ((nota >= 5)&&(nota<=10)){
            System.out.println("Enhorabuena has aprobado."); 
        } else {
                System.out.println("Valor incorrecto"); 
        }
        
        sc.close();
    }
}
    

