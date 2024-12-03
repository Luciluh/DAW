package Apuntes;
/*
Los arrays con contenedores que almacenan variables de un mismo tipo. 
Empiezan en 0 siempre y cada una de sus "posiciones" son llamados indices
*/
public class Arrays_Teoria{
    public static void main(String[] args) {
        
        int suma;
        //nombre del Array/coleccion y justo despues del tipo de variables [ ]
         int[] numeros; //definimos un array de numeros enteros que se llama numeros

        //inicializamos el array reservando 3 espacios de memoria -- 
        //nombre de lo que guardamos dentro del array = new tipo de variable [cantidad de numeros que queremos guardar]
        numeros = new int[3]; 

        //Guardamos valores en cada espacio 
        numeros[0] = 82; //guardamos en el espacio de memoria 0 el valor 82 
        numeros[1] = 33; //guardamos en el espacio de memoria 1 el valor 33 
        numeros[2] = -64; //guardamos en el espacio de memoria 2 el valor -64 
        
        //Salida por pantalla
        System.out.print("Los valores de los arrays son: ");
        //operaciones con arrays
        suma= numeros[0] + numeros[1] +numeros[2];
        System.out.printf("Los valores de los arrays son: %d, %d y %d\n", numeros[0],numeros[1],numeros[2]);
        System.out.printf("La suma es: %d\n ", suma);


        /*
        EJEMPLO 2
        */
        //Ya se los valores que van a tener. 
        //Definimos el array y lo seguimos de { } para directamente decir la cantidad de espacios que tiene

        //Definimos, creamos e inicializamos un array 
        int [] datos ={31,1,50,3,43,5}; //esto me indica la cantidad de espacios de memoria y los valores que toman en esa posicion de memoria 
        System.out.printf("%d\n", datos[0]); 



    }
}