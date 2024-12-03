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
     * 
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
}
