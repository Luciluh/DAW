/*
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while
 */
public class ejercicio2 {
    public static void main(String[] args) {
        
        int num = 0;
        while (num <= 100) {
            if (num%5==0) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
