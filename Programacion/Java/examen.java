package Java;

import java.util.Scanner;

public class examen {
    public static void main(String[] args) {




    ->  Para los printf:

        Con la sentendia "\n" cerramos y hacemos un salto de línea 

        Usos del %: 
        System.out.printf("Numero entero: %d\n", numeroEntero); //%d para los printf para los enteros
        System.out.printf("Numero entero: %f\n", numeroReal); // %f para los printf para los reales // 
                                                                    //para mostrar precision de x decimales pondremos .x -> eje: %f.2 -> daria los decimales
        System.out.printf("Numero entero: %c\n", caracter); // %c para los printf para caracter 
        System.out.printf("Numero entero: %s\n", cadena); // %s para los printf para cadenas 

        System.out.printf(" Mostrará 5 numeros de espacios a la derecha %5d\n", numeroEntero);
        System.out.printf(" Mostrará 5 espacios rellenos de 0 a la derecha %05d\n", numeroEntero);

        Si queremos que salga por pantalla un "%" debemos de poner "%%"
        // \n -> SALTO DE LINEA
        // \ u -> CODIGO UNICODE 
        // \t -> TABULACION


    -> Estandar ANSII
    System.out.println("\033[34m\033[43mHola Mundo\033[0m"); //tiene la letra de un color + el fondo de otro color "texto" + reseteo todo 
    System.out.println("\033[33mHola Mundo\033[0m");
    System.out.println("\033[36mHola Mundo\033[0m");
    System.out.println("\033[35mHola Mundo\033[0m");
    System.out.println("\033[31mHola Mundo\033[0m");
    System.out.println("\033[38;2;109;73;156mHola Mundo\033[0m"); 
    System.out.println("\033[1mEste texto aparecerá en negritas\033[0m");
    System.out.println("\033[3mEste texto aparecerá en cursiva\033[0m");
    System.out.println("\033[4mEste texto aparecerá en subrayado\033[0m");

        //Para cerrar la sentencia siempre que usemos ANSI se cerrará con "[0m"


    -> Cosas a recordar: 

    - Cuando definamos una variable como int, por ejemplo, pero a la hora de operar con ella necesitamos tratarla como float pondremos: 
    int num 
    float num2
    float resultado 

    resultado<- (float)num * num2 



    -> Salida por pantalla 

    - Scanner: 

    1º Para usar el Scanner antes hay que importar el Scanner con:  
    import java.util.Scanner;
    import java.util.Locale; //pondremos esto para que no haya problema a la hora de ejecutar en la termial 

    2º Crearemos la variable con: Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH); //sc es el nombre que yo quiera darle

    3º Para crear la entrada por consola: 

    altura = sc.nextDouble(); //donde "altura" es el nombre de la variable que quiero darle valor y next... es el tipo de varialble
    // Si altura fuera un String, seria con nextLine, si altura fuera un numero entero seria nextInt... 

    4º Cerrrar el Scanner con: sc.close(); // si lo hubieramos llamado de otra forma en vez de sc pondriamos el nombre de la variable


    - Sin usar Scanner  

    1º Crearemos la variable con:  num = Integer.parseInt(System.console().readLine()); 
        //Aqui ocurre como en el Scanner, si num es un int pondremos "parseInt", si fuera float pondriamos "parseFloat" pero si fuera 
        // la  variable de tipo cadena quedaria como: num = System.console().readLine();








    }
}
