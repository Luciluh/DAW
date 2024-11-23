public class EJ03_ContarConsonantes {

    // Creamos la firma de la función
    public static int contarConsonantes(String palabra){
        return 0; // Inicialmente solo retornamos 0
    }

    public class ContarConsonantes {

        // Implementamos la función que cuenta las consonantes
        public static int contarConsonantes(String palabra) {
            int contador = 0;
            
            // Convertimos la palabra a minúsculas para hacer la comparación insensible a mayúsculas
            palabra = palabra.toLowerCase();
            
            // Iteramos sobre cada letra de la palabra
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                
                // Verificamos si la letra es una consonante (es una letra y no es vocal)
                if (Character.isLetter(letra) && !"aeiou".contains(String.valueOf(letra))) {
                    contador++;
                }
            }
            
            return contador;
        }
    }
}
