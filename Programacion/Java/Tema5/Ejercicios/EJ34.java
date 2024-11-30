import java.util.Scanner;

public class EJ34 {
    public static void main(String[] args) {
        
        int num ;
        int inverso = 0 ;
        int numPalote = 0 ; 
        int contadorPalote = inverso%10 ; 
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero positivo: ");
        num = sc.nextInt();

        //Invertimos el número
        while(num>0){
            inverso = inverso*10 + num%10 ;
            num = num/10 ;
            numPalote=inverso;

        
        

        do {
            numPalote = contadorPalote ; 
            System.out.print("|");
            contadorPalote--;
            inverso = inverso/10 ;
        } while ((inverso/10)>10);
        }

        //hacemos un bucle para obtener el primer numero de num por tanto el ultimo de inverso 










        sc.close();
    }
}
