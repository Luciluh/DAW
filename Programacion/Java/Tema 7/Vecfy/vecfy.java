import java.util.Arrays;
import java.util.Scanner;
import libreria.*;
public class vecfy {
    private static final int MAXIMO = 10;
    /**
     * @param args
     */
    public static void main(String[] args) {

        int [] vectorA = new int [MAXIMO];
        int [] vectorB = new int [MAXIMO];
        int min;
        int max;
        int producto;
        int opcion;
        int comprobar;
        boolean decision;
        Scanner sc = new Scanner(System.in);

    
        do {

            //mostramos menu 
            recursos.mostrarMenu();
            
            //preguntamos opcion
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();

            if(opcion!=0){
                //min y max de los valores del array
                System.out.print("¿Cual quiere que sea el valor minimo para los vectores?: ");
                min = sc.nextInt();
                System.out.print("¿Cual quiere que sea el valor maximo para los vectores?: ");
                max = sc.nextInt();
                //inicializamos los arrays a y b
                recursos.rellenarAleatorio(vectorA, min, max);
                recursos.rellenarAleatorio(vectorB, min, max);
        
                //mostramos los vectores
                System.out.print("El vector A es: "); 
                recursos.mostrar(vectorA);
                System.out.println("");
                System.out.print("El vector B es: "); 
                recursos.mostrar(vectorB);
                System.out.println("");
            }

            
            //barajamos las opciones dadas
            switch (opcion) {
                case 0:
                System.out.println("Gracias por usar la aplicacion");            
                break;

                case 1:
                System.out.printf("La suma acumulativa del vector A es: %d\n", recursos.sumaAcumulativa(vectorA));
                System.out.printf("La suma acumulativa del vector B es: %d\n", recursos.sumaAcumulativa(vectorB));
                break;
                
                case 2:
                System.out.println("La suma de ambos vectores es: " + Arrays.toString(recursos.sumaVectores(vectorA, vectorB)));
                break;

                case 3:
                System.out.println("La resta de ambos vectores es: " + Arrays.toString(recursos.restaVectores(vectorA, vectorB)));
                break;

                case 4:
                System.out.print("Ingrese el producto que desea multiplicar al vector: ");
                producto = sc.nextInt();

                System.out.printf("El producto escalar del vector A y el producto(%d) es: %s \n", producto, Arrays.toString(recursos.productoEscalar(vectorA, producto)));
                System.out.printf("El producto escalar del vector B y el producto(%d) es: %s \n", producto, Arrays.toString(recursos.productoEscalar(vectorB, producto)));
                break;
                
                case 5:
                System.out.print("Introduce numero a comprobar: ");
                comprobar = sc.nextInt();

                System.out.printf("El numero %d aparece un total de %d veces en el vector A\n", comprobar, recursos.calcularFrecuencia(vectorA, comprobar));
                System.out.printf("El numero %d aparece un total de %d veces en el vector B\n", comprobar, recursos.calcularFrecuencia(vectorB, comprobar));
                    break;
                
                case 6:
                System.out.print("Introduce numero a buscar: ");
                comprobar = sc.nextInt();

                if (recursos.buscarElemento(vectorA, comprobar)==true) {
                    System.out.printf("¡En el vector A se ha encontrado el número %d!\n", comprobar);
                } else if (recursos.buscarElemento(vectorA, comprobar)==false)
                System.out.printf("Lo siento, en el vector A no se ha encontrado el número %d :(\n", comprobar);

                if (recursos.buscarElemento(vectorB, comprobar)==true) {
                    System.out.printf("¡En el vector B se ha encontrado el número %d!\n", comprobar);
                } else if (recursos.buscarElemento(vectorB, comprobar)==false)
                System.out.printf("Lo siento, en el vector B no se ha encontrado el número %d :(\n", comprobar);
                    break;
                
                case 7:
                System.out.printf("Para el vector A, el numero con mayor valor es: %d\n", recursos.maximo(vectorA));
                System.out.printf("Para el vector B, el numero con mayor valor es: %d\n", recursos.maximo(vectorB));
                    break;

                case 8:
                System.out.printf("Para el vector A, el numero con menor valor es: %d\n", recursos.minimo(vectorA));
                System.out.printf("Para el vector B, el numero con menor valor es: %d\n", recursos.minimo(vectorB));
                    break;

                case 9:
                System.out.printf("Para el vector A, la media de sus valores es: %d\n", recursos.mediaAritmetica(vectorA));
                System.out.printf("Para el vector B, la media de sus valores es: %d\n", recursos.mediaAritmetica(vectorB));
                    break;

                case 10:
                System.out.printf("Para el vector A, el vector invertido es: %s\n", Arrays.toString(recursos.invertir(vectorA)));
                System.out.printf("Para el vector B, el vector invertido es: %s\n", Arrays.toString(recursos.invertir(vectorB)));
                    break;

                case 11:
                if (recursos.comparar(vectorA, vectorB)==false) {
                    System.out.println("Los vectores A y B no son iguales");
                } else {
                    System.out.println("Los vectores A y B son iguales");
                }
                    break;

                case 12:
                System.out.println("Tras eliminar los duplicados el vector A quedaria: " + Arrays.toString(recursos.eliminarDuplicados(vectorA)));
                System.out.println("Tras eliminar los duplicados el vector B quedaria: " + Arrays.toString(recursos.eliminarDuplicados(vectorB)));                
                    break;

                case 13:
    
                System.out.println("Quiere mostrar cada iteraccion? (si: true // no: false)");
                decision=sc.nextBoolean();

                System.out.println("Array A ordenado: " + Arrays.toString(recursos.burbuja(vectorA, decision)));
                System.out.println("Array B ordenado: " + Arrays.toString(recursos.burbuja(vectorB, decision)));
                    break;

                case 14:

                    break;

                case 15:
                System.out.print("Array resultante es: ");
                recursos.concatenar(vectorA, vectorB);
                System.out.println("");
                    break;

                default:
                    break;
            }

            //Si el usuario no decide salir del programa entoncescreamos una pausa
            if(opcion!=0){
            System.out.println("Presione ENTER para continuar");
            sc.nextLine();
            sc.nextLine();
            }
        } while (opcion!=0);
        sc.close();
    }
}
