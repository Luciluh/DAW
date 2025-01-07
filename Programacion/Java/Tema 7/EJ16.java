import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {

        int num [] = new int [20];
        int multiplos;
        Scanner sc = new Scanner(System.in); 

        for (int i = 0; i < num.length; i++) {
            num [i] = (int)(Math.random()*(400-0+1)+0);
            System.out.print(num[i] + " ");
        }

        System.out.println("");
        System.out.print("¿Qué numeros quiere resaltar?\n(1 - los multiplos de 5 , 2 - los multiplos de 7) : ");
        multiplos = sc.nextInt();


        for (int i = 0; i < num.length; i++) {
            if ((multiplos == 1)&&(num[i]%5==0)) { //multiplos de 5 
                System.out.printf("[%d] ",num[i]);
            } else if ((multiplos == 2)&&(num[i]%7==0)) { //multiplos de 7
                System.out.printf("[%d] ",num[i]);
            } else{
                System.out.print(num[i] + " ");
            }
        }
        sc.close();
    }
}
