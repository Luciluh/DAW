public class Formato {
    public static void main(String[] args) {

        int numeroEntero = 31; // %d para los printf
        double numeroReal = 8.25; ///%f para los printf
        char caracter ='A';
        String cadena = "Hola";

        System.out.println("El numero " + numeroEntero + " no tiene decimales pero el numero " + numeroReal + " si los tiene");
        
        System.out.printf("El número %d no tiene decimales pero %f si los tiene\n", numeroEntero,numeroReal);
        System.out.printf("Numero entero: %d\n", numeroEntero);
        System.out.printf("Numero entero: %f\n", numeroReal);
        System.out.printf("Numero entero: %c\n", caracter);
        System.out.printf("Numero entero: %s\n", cadena);


        System.out.printf(" Mostrará 5 numeros de espacios a la derecha %5d\n", numeroEntero);
        System.out.printf(" Mostrará 5 espacios rellenos de 0 a la derecha %05d\n", numeroEntero);


        //Me dijo literalmente "vete de la clase"
        System.out.println("Me dijo literalmente: \"Vete de la clase\"" );

        //
    }
    
}

// %d para los printf para los enteros
// %f para los printf para los reales 
// %s para los printf para cadenas 
// %c para los printf para caracter 
// para imprimir % o \ los pondremos dobles para que aparezcan: %% y \\
// para mostrar precision de x decimales pondremos .x -> eje: %f.2 -> daria los decimales

// \n -> SALTO DE LINEA
// \ u -> CODIGO UNICODE 
// \t -> TABULACION

// "H" es una cadena y 'H' es un caracter