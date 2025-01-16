public class Main {
    public static void main(String[] args) {
        
        //instancio el gato

        
        
        System.out.println("POO Gato:");
        
        //se puede definir asi:
        Gato garfield;
        garfield = new Gato("Garfield", "british"); //instancio objeto (se construye el objeto)
        
        //o asi:
        Gato silvestre = new Gato("Silvestre", "callejero"); //instancio objeto (se construye el objeto)


        //aqio directamente tambien pdemos darle un valor 
        //garfield.edad = 45; SOLO SE PUEDE HACER ESTO CUANDO ESTA EN "PUBLIC"
        //podemos cambiarle el valor al nombre y se sobreescribiria 
        //garfield.nombre = "Pedro"; // finalmente garfield se llamaria Pedro  SOLO SE PUEDE HACER ESTO CUANDO ESTA EN "PUBLIC"


        garfield.maulla();
        silvestre.maulla();

        garfield.come();
        silvestre.come();

        garfield.ronronea();
        silvestre.ronronea();
        silvestre.peleaCon(garfield);

    }

    //null -> Significa que el objeto aun no se ha creado
}
