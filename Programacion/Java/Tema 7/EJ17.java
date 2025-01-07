import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        int num [] = new int [10];
        int numSolicitado;
        boolean numEncontrado = true;


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            num [i] = (int)(Math.random()*(100-0+1)+0);
        }
        mostrarArrayConIndice.mostrarArrayConIndice(num);

        System.out.print("Introduzca uno de los numeros del array: ");
        numSolicitado = sc.nextInt();

        //Comprobamos si el numero solicitado esta en el array original
        for (int i = 0; i < num.length; i++) {
            if (num[i]==numSolicitado) {
                numEncontrado = true;
                break;
            } else if (num[i]!=numSolicitado) {
                numEncontrado = false;
            }
        }
        
        //Si se encuentra en el array se pinta ese numero en la posicion 0 y los demas se desplazan uno a la derecha 
        if (numEncontrado==true){
            for (int i = 0; i < num.length; i++) {
                if ((num[i]==numSolicitado)){
                    num[0]=num[i];
                }
                for (int j = 1; j < num.length-1; j++) {
                    num[i+1]=num[i];
                }
            }
            
            mostrarArrayConIndice.mostrarArrayConIndice(num);
        }
        
        //Sino se encuentra en el arrray:
        if (numEncontrado==false) {
            System.out.println("El numero no se encuentra en el array");
        } 
        sc.close();

    }
}
