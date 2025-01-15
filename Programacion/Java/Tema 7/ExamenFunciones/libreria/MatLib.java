package libreria;
public class MatLib {

    /**
     * Esta funcion suma
     * @param num1
     * @param num2
     * @return int 
     */
    public static int suma (int num1, int num2){
        int resultado;
        resultado = num1 + num2;
        return resultado;
    }
    
    /**
     * Calcula y devuelve el incremento en una unidad de un valor dado 
     * @param num
     * @return int 
     */
    public static int inc (int num){
        int incremento = 1;
        int resultado;

        resultado = num + incremento;

        return resultado;
    }

    /**
     * Devuelve la resta de un numero 
     * @param num1
     * @param num2
     * @return int 
     */
    public static int resta (int num1, int num2){

        int aux;
        int resultado;
        
        aux = -num2;
        resultado = num1 + aux;

        return resultado;
    }

    /**
     * 
     * @param num
     * @return int 
     */
    public static int dec (int num){
        int decremento = -1;
        int resultado;

        resultado = num + decremento; 

        return resultado;
    }


    /**
     * Comprueba si un numero es mayor que otro o no 
     * @param num1
     * @param num2
     * @return boolean 
     */
    public static boolean esMayor (int num1, int num2){

        boolean esMayor = true; 

        if ((MatLib.resta(num1, num2))>0) {
            esMayor = true;             
        } else {
            esMayor = false;
        }
        return esMayor;
    }

    /**
     * Comprueba si un numero es menor que otro o no
     * @param num1
     * @param num2
     * @return boolean
     */
    public static boolean esMenor (int num1, int num2){

        boolean esMenor = true;

        if ((MatLib.resta(num1, -num2))>0 && (-(MatLib.resta(num1, num2)))>0) {
            esMenor = true;
        } else {
            esMenor = false;
        }
        return esMenor;
    }

    /**
     * Comprueba si un numero es igual a otro o no 
     * @param num1
     * @param num2
     * @return boolean
     */
    public static boolean esIgual (int num1, int num2){
        boolean esIgual = true; 


        return esIgual;
    }

    /**
     * Multiplica dos numeros
     * @param num1
     * @param num2
     * @return int 
     */
    public static int multiplica (int num1, int num2){

        int resultado = 0;

        for (int i = 0; i < num2; i = i +1 ) {
            resultado = resultado + num1;
        }

        return resultado;
    }

    /**
     * Divide dos numeros 
     * @param num1
     * @param num2
     * @return int
     */
    public static int divide (int num1, int num2){

        int resResta;
        int resultado = 0; 

        resResta = MatLib.resta(num1, num2);
        while (resResta>0) {
            resResta = MatLib.resta(resResta, num2);
            resultado = resultado + 1;            
        }

        resultado = resultado + 1;

        return resultado;
    }


    /**
     * Calcula el resto de una division
     * @param num1
     * @param num2
     * @return int
     */
    public static int resto (int num1, int num2){

        int resto;

        resto = MatLib.resta(num1, num2);
        do {
            resto = MatLib.resta(resto, num2);         
        } while (resto>0);

        if (0 > resto) {
            resto = resto + num2;
        }

        return resto;
    }


    /**
     * Calcula y devuelve el resultado  de la potencia elevado a la base 
     * @param base
     * @param exponente
     * @return int
     */
    public static int potencia (int base, int exponente){

        int resultado = 1; 

        for (int i = 0; i < exponente ; i = i +1) {
            resultado = MatLib.multiplica(base,resultado);
            
        }
        return resultado; 
    }

    /**
     * Devuelve la potencia de un numero elevado al cuadrado
     * @param num 
     * @return int
     */
    public static int cuadrado (int num){

        int resultado; 

        resultado = MatLib.potencia(num, 2);

        return resultado;
    }

    /**
     * Devuelve la potencia de un numero elevado al cubo
     * @param num
     * @return int
     */
    public static int cubo (int num){
        int resultado; 

        resultado = MatLib.potencia(num, 3);

        return resultado;
    }

    /**
     * Dice si dos numeros son multiplos o no
     * @param num1
     * @param num2
     * @return boolean
     */
    public static boolean esMultiplo (int num1, int num2){

        boolean esMultiplo = true; 

        if (MatLib.resto(num1, num2)>0 || (-MatLib.resto(num1, num2)>0 )) {
            esMultiplo = false;
        } else {
            esMultiplo = true;
        }

        return esMultiplo;
    }

    /**
     * Dice si un numero es divisor del otro o no
     * @param num1
     * @param num2
     * @return boolean
     */
    public static boolean esDivisor (int num1, int num2){

        boolean esDivisor = true; 

        if (MatLib.resto(num2, num1)>0 || (-MatLib.resto(num2, num1)>0 )) {
            esDivisor = false;
        } else {
            esDivisor = true;
        }

        return esDivisor;
    }

    /**
     * Dice si un numero es primo o no
     * @param num
     * @return boolean
     */
    public static boolean esPrimo (int num){

        boolean esPrimo = true; 
        
        for (int i = 2; i < num; i++) {
            
            if (num <= 1){
                esPrimo = false;
            }
            if (num%i==0) {
                esPrimo = false;
                break;
            } 

        }
        return esPrimo;
    }

    /**
     * Decimos si un numero es primo o no
     * @param num
     * @return boolean
     */
    public static boolean esCuadradoPerfecto (int num){
        boolean esCuadradoPerfecto = true; 

        return esCuadradoPerfecto;
    }


    public static void piramide(int altura) {
        
        int espacios = MatLib.resta(altura, 1);
        int asteriscos = 1; 

        for (int i = 0; i < altura; i = i +1) {
            
            //pintamos los espacios 
            for (int j = 0; j < espacios; j = j +1) {
                System.out.print(" ");
            }
            //pintamos los numeros
            for (int j = 0; j < asteriscos; j= j +1) {
                for (int j2 = 0; j2 < 10; j2 = j2 +1) {
                    System.out.println(j2);
                }
            }
            System.out.println(" ");

            asteriscos = asteriscos +2;
            espacios =  MatLib.resta(espacios, 1);
        }

    }

}
