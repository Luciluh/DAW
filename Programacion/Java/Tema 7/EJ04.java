public class EJ04 {
    public static void main(String[] args) {
        
        //creo los huecos del array
        int [] numero = new int [100];
        int [] cuadrado = new int [100];
        long [] cubo = new long [100];

        String num = "n";
        String num2 = "n2";
        String num3 = "n3";

        System.out.printf("%-5s  | %8s  | %8s\n",num, num2,num3);

        //en cada espacio le asigno un valor y lo muestro
        for (int i = 0; i < 100; i++) {

            System.out.println("______________________________");

            numero [i] = (int)(Math.random()*(100-0+1)+0);

            //el numero es:
            // System.out.println("n = " + numero[i]);

            //el cuadrado es:
            cuadrado[i] = (int)(Math.pow(numero[i], 2));
            // System.out.println("n2 = " + cuadrado[i]);

            //el cubo es:
            cubo[i] = (long)(Math.pow(numero[i], 3));
            // System.out.println("n3 = " + cubo[i]);
            System.out.printf("%-5d  | %8d  | %8d\n",numero[i],cuadrado[i], cubo[i]);
        }

    }
}
