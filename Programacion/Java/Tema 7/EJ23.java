public class EJ23 {

    private static final int FILA = 3;
    private static final int COL = 6;
    public static void main(String[] args) {
        int num [][] = new int[FILA][COL];

        num[0][1] = 30; 
        num[0][2] = 2;
        num[0][5] = 7;
        num[1][0] = 75;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        for (int i = 0; i < COL+1; i++) {
            if (i==0) {
                System.out.printf("     ");
            } else{
                System.out.printf("    %2s %-5ºd ", "columna", i);
            }
        }

        System.out.println("");

        for (int i = 0; i < FILA; i++) {
            System.out.print("Fila " + i + " ");
            for (int j = 0; j < COL; j++) {
                System.out.printf("%3s %-15d"," ", num[i][j]);
            }
            System.out.println("");
            
        }

    }
}
