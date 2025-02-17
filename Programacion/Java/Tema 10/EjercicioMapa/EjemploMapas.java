package EjercicioMapa;

/**
* @author Lucia Villena Martin
*/

import java.util.HashMap;
import java.util.Map;

public class EjemploMapas {

    public static void main(String[] args) {

        HashMap<Integer, String> datos = new HashMap<Integer, String>() ;

        // añadimos elementos 
        datos.put(922, "Amalia Núñez" ) ;
        datos.put(921, "Cindy Nero" ) ;
        datos.put(700, "César Vázquez" ) ;
        datos.put(219, "Víctor Tilla" ) ;
        datos.put(537, "Alan Brito" ) ;
        datos.put(605, "Esteban Quito" ) ;

        System.out.println("Los elementos del mapa son: " + datos) ;
        System.out.println(datos.get(219)) ;


        System.out.println("\nBÚSQUEDA"); 
        System.out.println(datos.containsKey(700)?datos.get(700):"NO ESTÁ" ) ;
        System.out.println(datos.containsKey(701)?"CONTIENE LA CLAVE 701":"NO ESTÁ" ) ;

        System.out.println("\nMOSTRANDO EL MAPA"); 
        System.out.println(datos.entrySet()) ;

        for(Map.Entry item: datos.entrySet()) {
            System.out.println(item.getValue()) ;
        }

        System.out.println("\nMOSTRANDO EL MAPA 2a PARTE" ); 
        System.out.println(datos.values()); 

        for(String item: datos.values()) {
            System.out.println(item) ;
        }

        System.out.println("\nMOSTRANDO EL MAPA 3a PARTE" ); 
        System.out.println(datos.keySet()); 

        for(int item: datos.keySet()) {
            System.out.println(item) ;
        }

    }
    
}