package Apuntes;

import Apuntes.Clases.Animal;
import Apuntes.Clases.Gato;
import Apuntes.Clases.Sexo;
import Apuntes.Clases.Perro;

public class Main {
    
    public static void main(String[] args) {
        
        Gato garfield ;
        garfield = new Gato("Garfield Davis", "naranja") ; //instancio un objeto

        Gato silvestre = new Gato("Silvestre", "blanco y negro") ; //instancio otro objeto en una misma línea

        Perro perrete = new Perro("Oddie") ;

        perrete.hablar() ;

        System.out.printf("El nombre completo de Garfield es %s\n", garfield.getNombre()); //consigo un atributo privado
        garfield.setEdad(45) ; //establezco un atributo privado

        //establezco el sexo del gato
        garfield.setSexo(Sexo.MACHO);

        //establezco el maullido y hago que maulle
        garfield.setMaullido("Mauuuuuuuu");
        garfield.hablar();

        //describo los gatos
        garfield.describir();
        silvestre.describir();

        //un gato pelea con otro gato
        silvestre.peleaCon(garfield);

        //método toString
        System.out.println(garfield); //no hace falta poner toString porque te "convierte" el objeto en una cadena
        
        acaricia(garfield) ;
        acaricia(perrete) ;
    }

    public static void acaricia(Animal animal) {

        String tipo = "" ;

        if (animal instanceof Perro) {
            tipo = "perro" ;
        } else if (animal instanceof Gato) {
            tipo = "gato" ;
        }
        System.out.printf("Estoy acariciando a un %s llamado %s\n", tipo, animal.getNombre());

        //como son 2 animales solo, puedo usar un ternario como alternativa
    }

}
