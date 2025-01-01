public class EJ02 {
    public static void main(String[] args) {

        char [] simbolo = new char[10]; //creamos el array simbolo

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for (int i = 0; i < 10; i++) {
            System.out.printf("simbolo[%d] = %c\n", i , simbolo[i]);
            
        }

    }
}
