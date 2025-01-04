public class EJ10 {
    public static void main(String[] args) {

        int numOri[] = new int [20];
        
        System.out.println("Array original:");
        for (int i = 0; i < 20; i++) {
            numOri[i] = (int)(Math.random()*(100-0+1)+0);
            System.out.print(numOri[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Array con los pares al principio:");
        for (int i = 0; i < 20; i++) {
            if (numOri[i]%2==0) {
                System.out.print(numOri[i]+ " ");
            }
        }
        for (int i = 0; i < 20; i++) {
            if (numOri[i]%2!=0) {
                System.out.print(numOri[i] + " ");
            }
        }
        
    }
}
