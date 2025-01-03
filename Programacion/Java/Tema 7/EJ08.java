import java.util.Scanner;

public class EJ08 {
    public static void main(String[] args) {
        int temp [] = new int [12];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                    System.out.print("Introduzca la temperatura media de enero: ");
                    temp[i] = sc.nextInt();
                    break;
                case 1:
                    System.out.print("Introduzca la temperatura media de febrero: ");
                    temp[i] = sc.nextInt();
                    break;
                case 2:
                    System.out.print("Introduzca la temperatura media de marzo: ");
                    temp[i] = sc.nextInt();
                    break;
                case 3:
                    System.out.print("Introduzca la temperatura media de abril: ");
                    temp[i] = sc.nextInt();
                    break;
                case 4:
                    System.out.print("Introduzca la temperatura media de mayo: ");
                    temp[i] = sc.nextInt();
                    break;
                case 5:
                    System.out.print("Introduzca la temperatura media de junio: ");
                    temp[i] = sc.nextInt();
                    break;
                case 6:
                    System.out.print("Introduzca la temperatura media de julio: ");
                    temp[i] = sc.nextInt();
                    break;
                case 7:
                    System.out.print("Introduzca la temperatura media de agosto: ");
                    temp[i] = sc.nextInt();
                    break;
                case 8:
                    System.out.print("Introduzca la temperatura media de septiembre: ");
                    temp[i] = sc.nextInt();
                    break;
                case 9:
                    System.out.print("Introduzca la temperatura media de octubre: ");
                    temp[i] = sc.nextInt();
                    break;
                case 10:
                    System.out.print("Introduzca la temperatura media de noviembre: ");
                    temp[i] = sc.nextInt();
                    break;
                case 11:
                    System.out.print("Introduzca la temperatura media de diciembre: ");
                    temp[i] = sc.nextInt();
                    break;
            }
        }

        for (int j = 0; j < 11; j++) {
            switch (j) {
                case 0:
                    System.out.printf("%-12s %2c","enero", '|'); 
                    for (int j2 = 0; j2 < temp[0]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[0] + "ºC");
                    break;            
                case 1:
                    System.out.printf("%-12s %2c","febrero", '|'); 
                    for (int j2 = 0; j2 < temp[1]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[1] + "ºC");
                    break;            
                case 2:
                    System.out.printf("%-12s %2c","marzo", '|'); 
                    for (int j2 = 0; j2 < temp[2]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[2] + "ºC");
                    break;            
                case 3:
                    System.out.printf("%-12s %2c","abril", '|'); 
                    for (int j2 = 0; j2 < temp[3]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[3] + "ºC");
                    break;            
                case 4:
                    System.out.printf("%-12s %2c","mayo", '|'); 
                    for (int j2 = 0; j2 < temp[4]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[4] + "ºC");
                    break;            
                case 5:
                    System.out.printf("%-12s %2c","junio", '|'); 
                    for (int j2 = 0; j2 < temp[5]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[5] + "ºC");
                    break;            
                case 6:
                    System.out.printf("%-12s %2c","julio", '|'); 
                    for (int j2 = 0; j2 < temp[6]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[6] + "ºC");
                    break;            
                case 7:
                    System.out.printf("%-12s %2c","agosto", '|'); 
                    for (int j2 = 0; j2 < temp[7]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[7] + "ºC");
                    break;            
                case 8:
                    System.out.printf("%-12s %2c","septiembre", '|'); 
                    for (int j2 = 0; j2 < temp[8]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[8] + "ºC");
                    break;            
                case 9:
                    System.out.printf("%-12s %2c","octubre", '|'); 
                    for (int j2 = 0; j2 < temp[9]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[9] + "ºC");
                    break;            
                case 10:
                    System.out.printf("%-12s %2c","noviembre", '|'); 
                    for (int j2 = 0; j2 < temp[10]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[10] + "ºC");
                    break;            
                case 11:
                    System.out.printf("%-12s %2c","diciembre", '|'); 
                    for (int j2 = 0; j2 < temp[11]; j2++) {
                        System.out.print("*");
                    }
                    System.out.println(" " + temp[11] + "ºC");
                    break;          
            }
        }
        
        sc.close();
    }
}
