package EJ03;
/*
     * Ejercicio 3
     * Haz tests para la siguiente función que
     * un compañero de tu trabajo ha
     * desarrollado. Si tiene algún error corrígelo,
     * hasta que superes los tests que
     * has diseñado.
     * 
     * Los que tiene que hacer la función es recibir
     * una frase y devolver el número
     * de espacios en blanco que contiene. Por ejemplo:
     * Si recibe la frase: "¡Hola mundo!" debe
     * devolver 1
     * Si recibe la frase "Adiós, mundo cruel."
     * debe devolver 2.
     */
    
public class EJ03 {
    public static int cuentaEspacios(String frase) {
        int espacios = 1;
        for (int i=0;i<frase.length(); i++) {
            if (Character.isWhitespace(frase.charAt(i))) {
            //El error se encontraba en que "espacios" se incrementaba
            //En el test siempre salia un espacio mas de la cuenta
            }
        }
        return espacios;
    }
}