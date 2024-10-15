public class EjemploObjetos {
    public static void main(String[] args) {


        Gato gatoA = new Gato(); //instanciar la clase 
        Gato gatoB = new Gato ();

        gatoA.nombre = "Garfield";
        gatoA.edad = 12;
        gatoA.chip = "ASDAD52";
        
        gatoB.nombre = "Silvestre";
        gatoB.edad = 30;
        gatoB.chip = "AHGYAD52";

        gatoA.maulla();

    } 
    
}
