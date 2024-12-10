public class Funciones {
    
    /**
     * En esta funcion se dará la vuelta a un número
     * @param num
     * @return int
     */
    public static int volteaNum (int num){
        
        int inverso = 0;
        while (num>0) {
            inverso = inverso*10 + num%10 ;
            num = num/10;
        }
        return inverso;
    }

    /**
     * Esta funcion dice si un numero es capicua o no
     * @param num
     * @return boolean
     */
    public static boolean esCapicua (int num){

        boolean esCapiua = false;

        if (num==Funciones.volteaNum(num)) {
            esCapiua = true;
        }

        return esCapiua;
    }

    /**
     * Esta funcion nos dice si un numero es primo o no 
     * @param num
     * @return boolean
     */
    public static boolean esPrimo (int num){

        boolean esPrimo = true; 

        for (int i = 2; i < num/2; i++) {
            if ((num%i)==0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    /**
     * Esta funcion nos dice el primo siguiente al numero que ingresemos
     * @param num
     * @return int 
     */
    public static int siguientePrimo (int num){

        int siguentePrimo = 0;
        num += 1;
        do {
            Funciones.esPrimo(num);
            num++;
        } while (!Funciones.esPrimo(num));
        siguentePrimo = num;
        return siguentePrimo;
    }

    /**
     * Esta funcion calcula la potencia de un numero 
     * @param num
     * @param exponente
     * @return int
     */
    public static int potencia (int num, int exponente){
        
        int potencia;

        potencia = (int) Math.pow(num, exponente);

        return potencia;
    }

    /**
     * Esta funcion calcula la posicion de un numero 
     * @param num
     * @param posicion
     * @return int 
     */
    public static int digitoN (int num, int posicion){

        int inverso = Funciones.volteaNum(num); //tenemos el numnero volteado
        int digito = 0; // el digito que ocupa la posicion indicada


        for (int i = 0; i < posicion; i++) {
            digito = inverso%10;
            inverso = inverso/10;
        }
        return digito;
    }

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
    
    /**
     * Esta funcion devuelve el resultado de la suma de dos dados tirados aleatoriamente
     * @param dado1
     * @param dado2
     * @return resultadoDado
     */
    public static int ResultadoDados (){

        int resultadoDado;

        int dado1 = (int)(Math.random()*(6-1+1)+1);
        int dado2 = (int)(Math.random()*(6-1+1)+1);
        
        resultadoDado = dado1 + dado2;

        return resultadoDado;
    }

    /**
     * Esta funcion devuelve la suma de los digitos de un numero 
     * @param num
     * @return
     */
    public static int SumaDigitos (int num){
        int digito;
        int suma = 0;

        while (num>0) {
            digito = num%10;
            suma += digito;
            num /= 10;
        }

        return suma;
    }
}


