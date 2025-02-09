package Apuntes.Clases;

//la clase se nombra utilizando UpperCamelCase
//el archivo .java debe llamarse igual que la clase
public abstract class Animal {
    //Al ser abstract no se pueden instanciar objetos de tipo Animal, van a tener que especializarse
    //en gato, perro, etc.

    //si en este archivo de clase llamo al algún método u atributo de la propia clase (gato) SIEMPRE le pongo this. antes !!!

    //cuando creo una clase (una plantilla) con sus atributos, etc., 
    //este archivo NO puede tener un main donde poner instrucciones 
    //para instanciar la clase Animal, lo hago desde el algoritmo principal (archivo Main.java)
    
    //protected nos permite que se pueda acceder a ellos desde sus subclases (hijos) y en el mismo paquete
    //las propiedades están definidas A NIVEL DE OBJETO y solo existen TRAS INSTANCIAR LA CLASE
    protected String nombre ;
    protected String color ;
    protected String raza ;
    protected Sexo sexo ;
    protected int edad ;
    protected double peso ;

    //método abstracto (solo pueden definirse en clases abstractas, obliga a las subclases a tener un método habla)
    public abstract void hablar() ;

    //constructor de la clase, un método más que debe cumplir:
    //
    // - debe  llamarse IGUAL que la clase (en JAVA)
    // - puede haber más de un constructor (en JAVA)
    // - normalmente se utiliza para inicializar las propiedades/atributos del objeto más importantes
    // - puede haber más de uno pero no pueden ser iguales (se llamarán igual, no harán lo mismo)
    // - si solo quiero un constructor vacío, se recomienda ponerlo aunque esté vacío
    // - todos los constructores de las subclases de Animal deben estar aquí
    public Animal() {

    }

    public Animal(String nombre) { 
        this.nombre = nombre ; //this sirve para distinguir y no poner nombre = nombre (this.nombre será la propiedad)
    }

    public Animal(String nombre, String color) { 
        this.nombre = nombre ; 
        this.color = color ;
    }

    /**
     * os métodos GETTER nos dan el valor de propiedades privadas
     * @return nombre de la clase
     */
    public String getNombre() { 
        return this.nombre ;
    }

    /**
     * los métodos SETTER nos permiten re/establecer una propiedad privada
     * @return void
     */
    public void setEdad(int edad) { 
        this.edad = edad ;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo ;
    }

    //métodos (comportamientos) se definen como funciones SIN STATIC
    /**
     * @return void
     */
    public void come() {
        System.out.println(this.nombre + " come");
    }

    /**
     * @return void
     */
    public void describir() {
        System.out.printf("%s es %s\n", this.nombre, this.color);
    }

    //Override
    /**
     * Esta función sobrecarga la funcionalidad.
     * Siempre debe definirse de esta manera, lo que devuelve es lo que varía.
     */
    @Override
    public String toString() {
        return "Hola, soy un " + ((this instanceof Perro)?"PERRO":"GATO") + " llamado " + this.nombre + ", tengo " + this.edad + " años y soy " + this.sexo + ".";
    }
}
