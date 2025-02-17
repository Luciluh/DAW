package Apuntes.Clases;

public class Gato extends Animal { //extends significa que es una especialización de ...

    //atributos (deben ser privados por el principio de ocultación)
    private String maullido ;

    //constructores: como es subclase, se utiliza super(atributo1, atributo2)
    /**
     * 
     * @param nombre
     * @param color
     */
    public Gato(String nombre, String color) { 
        super(nombre, color) ; //this sirve para distinguir y no poner nombre = nombre (this.nombre será la propiedad)
    }

    //métodos

    public void setMaullido(String maullido) {
        this.maullido = maullido ;
    }
    /**
     * @return void
     */
    @Override
    public void hablar() { //este es obligatorio porque precede de una clase abstracta con método abstracto
        System.out.println(maullido);
    }

    /**
     * @return void
     */
    public void ronronea() {
        System.out.println("Brrrrr");
    }

    /**
     * @param contrincante
     * @return void
     */
    public void peleaCon(Gato contrincante) {
        System.out.println("Voy a pelearme con " + contrincante.nombre);
    }

}