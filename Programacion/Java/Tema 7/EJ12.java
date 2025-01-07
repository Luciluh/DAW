import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        int numOri [] = new int [10];
        int numDes [] = new int [10];
        int posIni;
        int posFin;
        Scanner sc = new Scanner(System.in);


        //pedimos 10 num 
        for (int i = 0; i < numOri.length; i++) {
            numOri[i] = sc.nextInt();
        }
        //mostramos el array original 
        System.out.println("Array original: ");
        System.out.print("Indice : ");
        for (int i = 0; i < numOri.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.print("Valor : ");
        for (int i = 0; i < numOri.length; i++) {
            System.out.print(numOri[i] + " ");
        }
        System.out.println(" ");

        //medimos posiciones inicial y final
        System.out.print("Introduzca la posicion inicial (0-9): ");
        posIni = sc.nextInt();
        System.out.print("Introduzca la posicion final (0-9): ");
        posFin = sc.nextInt();


        //Hacemos los calculos
        for (int i = 0; i < posIni; i++) {
            numDes[i + 1] = numOri[i];
        }
        for (int i = posIni; i < posFin; i++) {
            if (posIni==i){
                numDes[posFin] = numOri[i];
            } else if  (posIni!=i){
                numDes[i] = numOri[i];
            }
        }        
        for (int i = posFin; i < numDes.length; i++) {
            if (i!=9) {
                numDes[i + 1] = numOri[i];
            } else if (i==9) {
                numDes[0]=numOri[9];
            }
        }
        
        //Imprimimos el array resultante
        System.out.println("Array resultante: ");
        System.out.print("Indice : ");
        for (int i = 0; i < numDes.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.print("Valor : ");
        for (int i = 0; i < numDes.length; i++) {
            System.out.print(numDes[i] + " ");
        }

        sc.close();
    }
}
