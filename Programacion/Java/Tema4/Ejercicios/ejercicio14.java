import java.util.Scanner;
//\033[1m : codigo negrita
public class ejercicio14 {
    public static void main(String[] args) {

    String respuesta;
    int resultado = 0;
    Scanner sc = new Scanner(System.in);

        System.out.printf("\033[1mTEST DE FIDELIDAD\n==================\033[0m\n");
        System.out.println("Este programa te dirá si hay probabilidad de que tu pareja te esté siendo infiel.");

        // Pregunta 1
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.print("(v)erdadero o (f)also: ");
        respuesta = sc.nextLine();
        if ((respuesta.equals("v"))) {
            resultado= resultado + 1;
        }
        // Pregunta 2
        System.out.println("2. Ha aumentado sus gastos de vestuario.");
        System.out.print("(v)erdadero o (f)also: ");
        respuesta = sc.nextLine();
        if ((respuesta.equals("v"))) {
            resultado= resultado + 1;
        }
        // Pregunta 3
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
        System.out.print("(v)erdadero o (f)also: ");
        respuesta = sc.nextLine();
        if ((respuesta.equals("v"))) {
            resultado= resultado + 1;
        }
        // Pregunta 4
        System.out.println("4. Ahora se afeita y asea con más frecuencia (si es hombre) o ahora se arregla el pelo y asea con más frecuencia (si es mujer).");
        System.out.print("(v)erdadero o (f)also: ");
        respuesta = sc.nextLine();
        if ((respuesta.equals("v"))) {
            resultado= resultado + 1;
        }
        // Pregunta 5
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
        System.out.print("(v)erdadero o (f)also: ");
        respuesta = sc.nextLine();
        if ((respuesta.equals("v"))) {
            resultado= resultado + 1;
        }
        // Pregunta 6
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        System.out.print("(v)erdadero o (f)also: ");
        respuesta = sc.nextLine();
        if ((respuesta.equals("v"))) {
            resultado= resultado + 1;
        }
        // Pregunta 7
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        System.out.print("(v)erdadero o (f)also: ");
        respuesta = sc.nextLine();
        if ((respuesta.equals("v"))) {
            resultado= resultado + 1;
        }
        // Pregunta 8
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        System.out.print("(v)erdadero o (f)also: ");
        respuesta = sc.nextLine();
        if ((respuesta.equals("v"))) {
            resultado= resultado + 1;
        }
        // Pregunta 9
        System.out.println("9. Has notado que últimamente se perfuma más.");
        System.out.print("(v)erdadero o (f)also: ");
        respuesta = sc.nextLine();
        if ((respuesta.equals("v"))) {
            resultado= resultado + 1;
        }
        // Pregunta 10
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        System.out.print("(v)erdadero o (f)also: ");
        respuesta = sc.nextLine();
        if ((respuesta.equals("v"))) {
            resultado= resultado + 1;
        }

        switch (resultado) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
                break;
            case 11, 12 , 13, 14, 15, 16, 17, 18, 19, 20, 21, 22:
                System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
                break;
            case 23, 24, 25, 26, 27, 28, 29, 30:
                System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
                break;
        }

        sc.close();
    }
}
