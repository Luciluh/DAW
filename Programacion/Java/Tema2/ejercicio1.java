/**
 * ejercicio1.- Escribe un programa dond declares dos variables x e y. Asignales valores 
 * 144 y 99. A continuacion muestra por pantalla suma, resta, division y multiplicacion
 */
public class ejercicio1 {

    public static void main(String[] args) {
    int x = 144;
    int y = 999;
    
    double division = (double)x/y;

    System.out. println("El valor de la suma es: " + (x+y));
    System.out. println("El valor de la resta es: " + (x-y));
    System.out. println("El valor de la multiplicacion es: " + (x*y));
    System.out. printf("El valor de la division es: %.3f", division);
    }
}