public class EJ02_Palindromo {
    // Creamos la firma de la función que devuelve si una palabra es un palíndromo
    public static boolean esPalindromo(String palabra){
        return false; // Inicialmente solo retornamos un valor falso
    }


    public class Palindromo {

    // Implementamos la función que determina si una palabra es un palíndromo
    public static boolean esPalindromo(String palabra){
        // Primero, limpiamos la palabra: eliminamos caracteres no alfabéticos y pasamos todo a minúsculas
        String palabraLimpia = palabra.replaceAll("[\\W_]+", "").toLowerCase();
        
        // Invertimos la palabra limpia
        String palabraInvertida = new StringBuilder(palabraLimpia).reverse().toString();
        
        // Comparamos la palabra limpia con la invertida
        return palabraLimpia.equals(palabraInvertida);
    }
}
}
