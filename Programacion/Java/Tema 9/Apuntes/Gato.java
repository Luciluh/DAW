public class Gato {
    //se debe de llamar igual que el documento
    //NO hay que ponerle el "public static...."

    //propiedades, atributos o caracteristicas del objeto "gato"

    //lA VISIBILIDAD DE LAS PROPIEDADES DEBERIAN DE SER PRIVADAS (GENERALMENTE)
    private String nombre;
    private String color;
    private String raza;
    private String sexo;
    private int edad;
    private double peso;

    //constructor de la clase (es un metodo)
    //se tiene que llamar igual que la clase (en JAVA) en UpperCamelCase
    //puede haber mas de un constructor (en JAVA)
    //normalmente se utiliza para inicializar las propiedades, atributos o caracteristicas del objeto
    //En el constructor se definen normalmente los atributos criticos, lo que mas me interesan LO MAS IMPORTANTE
    /* 
    public Gato(String nom){ // no tiene porque tener el mismo nombre que cuando se define la variable
        nombre = nom; // al llamarse distinto no hay problema

    }
    */

    //¿Que pasa si llamamos el constructor igual que la variable?
    /**
     * El constructor devuelve una instancia de la clase
     * @param nombre
     * @param raza
     */
    public Gato (String nombre,String raza){
        this.nombre = nombre; //al ponerle el this. hacemos referencia a la variable para distinguirlo del constructor
        this. raza = raza;
    }



    //¡¡¡RECOMENDACION DEL PROFE: USEMOS THIS. SIEMPRE!!!


    //Para instanciarlo tengo que irme a el main original
    //Métodos (comportamiento del gato)
    
    /**
     * @return void
     */
    public void maulla(){  //sin static
        System.out.println("Miauuuu");
    }

    /**
     * @return void
     */
    public void come(){  //sin static
        System.out.println(this.nombre + " come.."); //referenciamos a llamar al objeto se llame como se llame
        System.out.println("Ñammm");
    }

    /**
     * @return void
     */
    public void ronronea(){  //sin static
        System.out.println("Grrrrrr");
    }

    /**
     * @return void
     */
    public void peleaCon(Gato enemigo){  //sin static
        System.out.println("Voy a pelearme con " + enemigo.nombre);
    }


    /**
     * 
     */
    @Override 
    public String toString(){
        return "Hola, soy " + this.nombre + "y tengo " + this.edad + "años";


    }





}
