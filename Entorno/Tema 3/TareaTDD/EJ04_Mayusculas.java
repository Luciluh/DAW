public class EJ04_Mayusculas {

    // Creamos la firma de la función
    public static boolean tieneMayusculas(String palabra) {
        return false; // Inicialmente solo retornamos false
    }

    public class Mayusculas {

        // Implementamos la función que verifica si una palabra tiene solo mayúsculas
        public static boolean tieneMayusculas(String palabra) {
            // Verificamos si la palabra no está vacía y si es igual a su versión en mayúsculas
            return !palabra.isEmpty() && palabra.equals(palabra.toUpperCase());
        }
    }
    
}

