public class InvertirNumeroConCeros {

    /**
     * INVERTIR CUALQUIER NUMERO, SI TIENE 0 FINALES TAMBIEN LOS INVIERTE
     * @param numeroOriginal
     * @return
     */
    public static String InvertirNumerosConCeros (int numeroOriginal) {


        if (numeroOriginal < 0) {
            System.out.println("El número debe ser positivo.");
        }

        // Contar ceros finales del número original
        int cerosFinales = 0;
        int copia = numeroOriginal; // Copia del número para no modificarlo directamente
        while (copia % 10 == 0 && copia != 0) {
            cerosFinales++;
            copia /= 10; // Eliminar el último dígito
        }

        // Invertir el número sin ceros finales
        long numeroInvertido = 0; // Usamos long por si se trata de un número grande
        while (copia > 0) {
            int digito = copia % 10; // Extraer el último dígito
            numeroInvertido = numeroInvertido * 10 + digito; // Construir el número invertido
            copia /= 10; // Eliminar el último dígito
        }


        // Formatear el número invertido con los ceros al inicio
        StringBuilder numeroInvertidoFinal = new StringBuilder(String.valueOf(numeroInvertido));
        for (int i = 0; i < cerosFinales; i++) {
            numeroInvertidoFinal.insert(0, "0"); // Agregar ceros al inicio
        }
        
        return numeroInvertidoFinal.toString();

    }
}
