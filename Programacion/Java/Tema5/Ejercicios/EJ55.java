import java.util.Scanner;

public class EJ55 {
    public static void main(String[] args) {
        
        int num ; 
        float media ;
        int resultado ;
        int suma = 0 ;
        int contador = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        if (num<10) {
            System.out.printf("La media de sus digitos es: %d", num);
        }

            while (num>0) {
                resultado = num%10 ; //separo el ultimo digito del numero
                suma = suma + resultado ; // sumo este ultimo digito a la suma total
                contador++; //incremento un valor que finalmente sera numero 
                //de veces que recorro el bucle, por tanto el divisor de la media

                num = num/10 ; // "renuevo" el numero sin el ultimo digito q ya usamos
            }

            media = (float)suma/contador ;

            System.out.printf("La media de sus digitos es: %.2f", media);
        
        sc.close();

    }
}
