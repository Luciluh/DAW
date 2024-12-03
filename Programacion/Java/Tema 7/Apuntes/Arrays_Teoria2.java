package Apuntes;
public class Arrays_Teoria2 {
    private static final int MAXIMO = 100;
    public static void main(String[] args) {

        //ES MEJOR DEFINIR EL VALOR DEL ARRAY EN UNA CONSTANTE PARA FUTUROS CABMIOS MAS SENCILLOS 

        int[] numeros = new int[MAXIMO];
        /* Es lo mismo que: 
        int[] numeros; 
        numeros = new int[MAXIMO];
        */


        for (int i = 0; i < MAXIMO; i++) {
            numeros [i] = (int)(Math.random()*10) ; 
            //Llenamos el array entre valores aleatorios de 0 y 9
            System.out.println("Los valores del array son: " + numeros[i]);
            
        }
    }
}
