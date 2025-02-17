package Apuntes.Clases;

public class Perro extends Animal { //extends significa que es una especialización de ...
    
    //constructor
    //cuando el constructor va a estar vacío pero es subclase, pongo el super() vacío
    public Perro() {
        super() ;
    }

    public Perro(String nombre) {
        super(nombre) ;
    }

    //métodos
    @Override
    public void hablar() { //este es obligatorio porque precede de una clase abstracta con método abstracto
        System.out.println("Guau guau");
    }

}
