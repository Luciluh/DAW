import java.util.ArrayList;

public class EJ01 {
    public static void main(String[] args) {

        //definimos el Arraylist
        ArrayList<String> compañeros = new ArrayList<String>();

        //mostramos el total de elementos
        System.out.println("Nombre de compañeros: " + compañeros.size());

        // añadimos elementos 

        compañeros.add ("Lucia");
        compañeros.add ("Laura");
        compañeros.add ("Dani");
        compañeros.add ("Miriam");
        compañeros.add ("David");
        compañeros.add ("Gloria");


        //mostramos elementos 

        for (String item : compañeros) {
            System.out.printf("%s \n", item);
        }
    }
}
