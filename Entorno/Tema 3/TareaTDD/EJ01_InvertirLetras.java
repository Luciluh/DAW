public class EJ01_InvertirLetras {
    
    // Implementamos la función que invierte una cadena
    public static String invertirCadena(String invertir) {
        // Usamos StringBuilder para invertir la cadena
        return new StringBuilder(invertir).reverse().toString();
    }
}
