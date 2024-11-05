package Tema4.Ejercicios;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        int puntuacion = 0;
        String respuesta;
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("CUESTIONARIO DE 1ºDAW");

        // Pregunta 1
        System.out.println("1. ¿Cuál de los siguientes tipos de datos tiene más precisión?");
        System.out.println("a) int\nb) double\nc) float");
        System.out.print("=> ");
        respuesta = scanner.nextLine();

        if (respuesta.equals("b")) { //para comparar String no nos vale el ==, tenemos que usar [nombreVariable.equeals("cadena")]
            System.out.println("Correcto");

            //aqui pongo un incremento porque puntuacion va a ir sumando 1 a medida que acertemos
            puntuacion++;
        } else {
            System.out.println("Incorrecto");
        }

        // Pregunta 2
        System.out.println("\n2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?");
        System.out.println("a) XML\nb) SELECT\nc) SQL");
        System.out.print("=> ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("c")) {
            System.out.println("Correcto");
            puntuacion++;
        } else {
            System.out.println("Incorrecto");
        }

        // Pregunta 3
        System.out.println("\n3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
        System.out.println("a) href\nb) a\nc) link");
        System.out.print("=> ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("b")) {
            System.out.println("Correcto");
            puntuacion++;
        } else {
            System.out.println("Incorrecto");
        }

        // Pregunta 4
        System.out.println("\n4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
        System.out.println("a) /etc\nb) /config\nc) /cfg");
        System.out.print("=> ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("a")) {
            System.out.println("Correcto");
            puntuacion++;
        } else {
            System.out.println("Incorrecto");
        }

        // Pregunta 5
        System.out.println("\n5. ¿Cuál de las siguientes memorias es volátil?");
        System.out.println("a) RAM\nb) EPROM\nc) ROM");
        System.out.print("=> ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("a")) { 
            System.out.println("Correcto");
            puntuacion++;
        } else {
            System.out.println("Incorrecto");
        }

        // Pregunta 6
        System.out.println("\n6. ¿Qué significa 'HTML'?");
        System.out.println("a) HyperText Markup Language\nb) HighText Machine Language\nc) HyperText Markdown Language");
        System.out.print("=> ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("a")) {
            System.out.println("Correcto");
            puntuacion++;
        } else {
            System.out.println("Incorrecto");
        }

        // Pregunta 7
        System.out.println("\n7. ¿Cuál de los siguientes es un sistema de gestión de bases de datos?");
        System.out.println("a) SQL Server\nb) GitHub\nc) Visual Studio");
        System.out.print("=> ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("a")) {
            System.out.println("Correcto");
            puntuacion++;
        } else {
            System.out.println("Incorrecto");
        }

        // Pregunta 8
        System.out.println("\n8. ¿Qué significa 'IDE' en programación?");
        System.out.println("a) Integrated Development Environment\nb) Internal Development Editor\nc) Integrated Device Environment");
        System.out.print("=> ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("a")) {
            System.out.println("Correcto");
            puntuacion++;
        } else {
            System.out.println("Incorrecto");
        }

        // Pregunta 9
        System.out.println("\n9. ¿Cuál es la extensión de archivo para un documento HTML?");
        System.out.println("a) .htm\nb) .html\nc) .doc");
        System.out.print("=> ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("b")) {
            System.out.println("Correcto");
            puntuacion++;
        } else {
            System.out.println("Incorrecto");
        }

        // Pregunta 10
        System.out.println("\n10. ¿Cuál es el comando para listar archivos en Linux?");
        System.out.println("a) ls\nb) dir\nc) list");
        System.out.print("=> ");
        respuesta = scanner.nextLine();
        if (respuesta.equals("a")) {
            System.out.println("Correcto");
            puntuacion++;
        } else {
            System.out.println("Incorrecto");
        }

        // Resultado final
        System.out.printf("Ha obtenido %d puntos.", puntuacion);

        scanner.close();
    }

}


