import java.util.Scanner;

public class Apuestas {

    private static final int GANANCIA_APUESTA_EXACTA = 10;
    private static final int GANANCIA_APUESTA_PARIMPAR = 2;
    public static void main(String[] args) {
        
        int saldo = 1000;
        int opcion = 0;
        int numApuesta;
        int resultadoDado;
        int apuesta; 
        int beneficio = 0; //es lo que ganas o pierdes en cada apuesta
        String ParImpar;
        int contadorGanancias = 0;
        int contadorPerdidas = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Juego de Dados con Apuestas");
        System.out.printf("Tu saldo inicial es: %d unidades.\n", saldo);


        //Menu para repetir las opciones hasya que ingrese una valida o salga del programa
        do {
            System.out.println("¿Qué te gustaria hacer?");
            System.out.println("1. Apostar a un numero especifico (Exacto)");
            System.out.println("2. Apostar a que el numero sera par");
            System.out.println("3. Apostar a que el numero sera impar");
            System.out.println("4. Salir del juego");

            System.out.print("Elige una opcion (1-4): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                // FALTA HACER UNA EXEPCION PARA QUE SOLO PUEDA INGRESAR NUM DE 2 AL 12
                    System.out.print("¿Cual es el numero exacto que crees que saldrá? (De 2 a 12): ");
                    numApuesta = sc.nextInt();
    
                    System.out.printf("¿Cuanto deseas apostar?(Saldo disponible: %d): ",saldo); //hay que poner el saldo disponible
                    apuesta = sc.nextInt();
    
                    System.out.println("Tirando los dados...");
    
                    resultadoDado = Apuestas_Funciones.ResultadoDados();
                    System.out.printf("El resultado de la tirada es: %d \n", resultadoDado); //resultado de los dados
    
                    //Si acierto el numero:
                    if (numApuesta==resultadoDado) {
                        System.out.println("¡Enhorabuena! El resultado de la apuesta es igual a tu apuesta.");

                        beneficio = apuesta*GANANCIA_APUESTA_EXACTA;
                        saldo += beneficio;
                        System.out.printf("Has ganado %d unidades.\nTu saldo ahora es de %d unidades.", beneficio, saldo);
                        contadorGanancias++;
                    } else {
                    //sino acierto el numero:

                    System.out.println("¡Lo siento, no has acertado!");

                    saldo -= apuesta;
                    System.out.printf("Has perdido %d unidades.\nTu saldo ahora es de %d unidades.\n", apuesta, saldo);
                    contadorPerdidas++;
                    }
                    break;
                case 2:

                    System.out.printf("¿Cuanto deseas apostar?(Saldo disponible: %d): ",saldo); //hay que poner el saldo disponible
                    apuesta = sc.nextInt();

                    System.out.println("Tirando los dados...");
                    resultadoDado = Apuestas_Funciones.ResultadoDados();
                    System.out.printf("El resultado de la tirada es: %d \n", resultadoDado); //resultado de los dados

                    if (resultadoDado%2==0) {
                        beneficio = apuesta * GANANCIA_APUESTA_PARIMPAR; 
                        saldo += beneficio;
                        System.out.printf("¡Felicidades! El numero es par. Has ganado %d unidades.\n Tu saldo ahora es de %d unidades", beneficio, saldo);
                        contadorGanancias++;
                    } else {
                    //Sino aciertas
                    System.out.println("¡Lo siento, no has acertado!");

                    saldo -= apuesta;
                    System.out.printf("Has perdido %d unidades.\nTu saldo ahora es de %d unidades.\n", apuesta, saldo);
                    contadorPerdidas++;
                    }

                    break;
                case 3:
                
                System.out.printf("¿Cuanto deseas apostar?(Saldo disponible: %d): ",saldo); //hay que poner el saldo disponible
                apuesta = sc.nextInt();

                System.out.println("Tirando los dados...");
                resultadoDado = Apuestas_Funciones.ResultadoDados();

                System.out.printf("El resultado de la tirada es: %d \n", resultadoDado); //resultado de los dados

                if (resultadoDado%2!=0) {
                    beneficio = apuesta * GANANCIA_APUESTA_PARIMPAR; 
                    saldo += beneficio;
                    System.out.printf("¡Felicidades! El numero es impar. Has ganado %d unidades.\n Tu saldo ahora es de %d unidades", beneficio, saldo);
                    contadorGanancias++;
                } else {
                //Sino aciertas
                System.out.println("¡Lo siento, no has acertado!");

                saldo -= apuesta;
                System.out.printf("Has perdido %d unidades.\nTu saldo ahora es de %d unidades.\n", apuesta, saldo);
                contadorPerdidas++;
                }

                    break;
                case 4:
                    System.out.printf("Gracias por jugar, Tu saldo final es de %d. Has ganado un total de %d veces y has perdido un total de %d veces.", saldo, contadorGanancias,contadorPerdidas);
                    break;
            
            }

        } while (opcion!=4);













        sc.close();
    }
}
