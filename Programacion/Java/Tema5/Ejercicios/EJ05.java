import java.util.Scanner;

public class EJ05 {
    public static void main(String[] args) {
        
        int num; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número y te mostraré su tabla de multiplicar:  ");
        num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i) );
        }
        sc.close();
    }
}
