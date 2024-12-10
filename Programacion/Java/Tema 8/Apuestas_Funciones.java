public class Apuestas_Funciones {
    
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
}
