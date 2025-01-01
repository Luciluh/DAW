public class EJ01 {
    public static void main(String[] args) {
        
        int [] num = new int [12]; //creamos el array "num";

        num [0]= 39;
        num [1]= -2;
        num [4]= 0;
        num [6]= 14;
        num [8]= 5;
        num [9]= 120;


        //Para mostrar todo el contenido del array creamos un bucle que nos recorra todo el array
        for (int i = 0; i < 12; i++) {
            System.out.printf("num[%d] = %d\n",i, num[i]);
        }

    }
}
