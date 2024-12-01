/*
Ejemplo 1: Verificar número primo
Crea una función que determine si un número es primo. La función debe recibir un número entero y devolver true si es primo, o false si no lo es.

Tests:

Un test con un número primo, como 7.
Un test con un número no primo, como 8.
*/

public class EJ01 {
    public static boolean esPar (int num){

        boolean esPar = true;
        if (num%2==0) {
            esPar = true;
        } else {
            esPar = false;
        }
        return esPar;
    }
}
