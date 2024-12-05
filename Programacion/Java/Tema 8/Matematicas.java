public class Matematicas {
    
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

        if (num==Matematicas.volteaNum(num)) {
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
            Matematicas.esPrimo(num);
            num++;
        } while (!Matematicas.esPrimo(num));
        siguentePrimo = num;
        return siguentePrimo;
    }
}
