import java.util.Scanner;

public class EJ01 {
    public static final String RESET = "/033[0m";
    public static void main(String[] args) {
        
        int numMin ; 
        int numMax ; 
        String color ;
        int inverso = 0 ;
        int digito;
        int digitoMax = 0;
        Scanner sc = new Scanner(System.in);


            System.out.println("GRAPHIFY");
            System.out.println("==============================");

            //Pedimos al usuario los valores
            System.out.print("Introduce el valor mínimo del rango: ");
            numMin = sc.nextInt();
            System.out.print("Introduce el valor máximo del rango: ");
            numMax = sc.nextInt();

            //si los valores introducidos son positivos comienza el programa
            if ((numMax > 0)&&(numMin>0)) { 
                //Genero el numero aleatorio
                int aleatorio = (int)(Math.random()*(numMax-numMin+1)+numMin);
        
                sc.nextLine();
                //Preguntamos si quiere el programa en b&n o a color
                System.out.print("Dibujo la grafica en blanco y negro o en color (B/C): ");
                color = sc.nextLine();

                //Si el usuario ingresa "c" pintara de color
                if (color.equals("c")) {
                    //pinta de color
                    System.out.println("Pinta de color");
                } else {//si es b&n o no pone nada se pinta de blanco y negro

                    //Invertimos el numero
                    while (aleatorio>0) {
                        inverso = inverso*10 + aleatorio%10 ;
                        aleatorio = aleatorio/10;
                    }
                    //Separamos los digitos del inverso e imprimimos por pantalla de forma vertical
                    do {
                        digito = inverso%10;
                        inverso = inverso/10;
                        //Calculamos el digito max
                        if (digito>digitoMax) {
                            digitoMax = digito;
                        }
                        //Recorremos el dibujito
                        for (int i = 0; i < 3; i++) {
                            //Recorremos hacia la derecha
                            for (int j = 0; j < (digitoMax +1); j++) {
                                //Pintamos los caracteres
                                if ((i==0)) {
                                    System.out.print(" --- ");
                                } else if (i == 1 && j==0) {
                                    System.out.print("| "+digito+" |");
                                } else if (i==1 && j!=0 ) {
                                    System.out.print("  * |");
                                } else if (i==2)
                                System.out.print(" --- ");

                                if (j==digitoMax) {
                                    System.out.println(" ");
                                }

                            }
                            }
                    } while (inverso>0);
                }
                
            //como los valores introducidos no son positivos el programa finaliza
            }else{
            System.out.println("***ERROR EL PROGRAMA HA FINALIZADO***"); 
            }
            sc.close();
        }
    }

