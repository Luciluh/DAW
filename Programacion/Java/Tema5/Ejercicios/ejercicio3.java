/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do … while.
 */
public class ejercicio3 {
    public static void main(String[] args) {
        
        int num = 0;

        do {
            if (num%5==0) {
                System.out.print(num + " ");  
            }
            num++;
        } while (num<=100);
        
    }
}
