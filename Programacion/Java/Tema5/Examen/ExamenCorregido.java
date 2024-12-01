import java.util.Scanner;

public class ExamenCorregido {
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
            sc.nextLine();
            System.out.print("Dibujo la grafica en blanco y negro o en color (b/c): ");
            color = sc.nextLine();

            if (color.equals("c")) {
                //pinto color
            } else{
                //Creamos un numero aleatorio con rango
                int aleatorio = (int)(Math.random()*(numMax-numMin+1)+numMin);
                System.out.println(aleatorio);

                //Invierto el numero 
                while(aleatorio>0){
                    inverso = inverso*10 + aleatorio%10 ;
                    aleatorio = aleatorio/10 ;
                }

                //Creo una copia de inverso para usarlo mas adelante
                int inversoCopia = inverso;
                //Separar cada dígito
                do {
                    digito = inverso%10;
                    inverso = inverso/10;

                    //Comprobamos el digito maximo
                    if (digito>digitoMax) {
                        digitoMax = digito;
                    }
                    //Creamos un bucle que recorra hacia la derecha
                } while (inverso>0);
                
                do {
                    digito = inversoCopia%10;
                    inversoCopia = inversoCopia/10;
                    
                    for (int j = 0; j < 3; j++){
                        for (int i = 0; i < digitoMax + 1; i++) {
                            if (j == 1) {
                                if (i==0) {
                                    System.out.print("| "+digito+" |");                                    
                                }else if (i>digito){
                                    System.out.print("    |");
                                }else{
                                System.out.print("  * |");
                                }
                            }else{
                                System.out.print(" --- ");
                            }
                        }
                        System.out.println(" ");

                    }
                        //Creamos un bucle que recorra hacia la derecha
                    } while (inversoCopia>0);
                }
            sc.close();
        }
    }

