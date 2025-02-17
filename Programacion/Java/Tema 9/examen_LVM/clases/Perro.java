/**
 * Lucia Villena Martin
 */
package clases;

public class Perro extends Mascota {
    
    private String raza;

    /**
     * 
     * @param chip
     */
    public Perro (String chip){
        super.setChip(chip);
    }

    /**
     * 
     * @param chip
     * @param nombre
     */
    public Perro (String chip, String nombre){
        super.setChip(chip);
        super.setNombre(nombre);
    }


    /**
     * 
     */
    public void ladrar(){
        System.out.println("¡GUAU!");
    }

    /**
     * 
     */
    public void gruñir(){
        System.out.println("Grrrr...");
    }

    /**
     * 
     */
    @Override
    public void pasear(){
        if (!estado()) {
            System.out.println(getNombre() + " no puede pasear hasta no se vacunado/a");
        } else {
            ladrar();
        }
    }

    /**
     * 
     public void vacunar(){
        if (vacunar == true) {
            System.out.println((getNombre() + " ya ha sido vacunado/a"));
        } else {
            gruñir();
        }
    }
    */

    /**
     * 
     */
    @Override
    public void jugar (){
        int num = (int)((Math.random()* 8 + 1));

        switch (num) {
            case 1:
                System.out.println(getNombre() + " corre tras una pelota y la trae de vuelta");
                break;
            case 2:
                System.out.println(getNombre() + " juega con su mordedor");
                break;
            case 3:
                System.out.println(getNombre() + " muerde un juguete de goma y lo sacude con fuerza");
                break;
            case 4:
                System.out.println(getNombre() + " escarba en la tierra buscando algo interesante");
                break;
            case 5:
                System.out.println(getNombre() + " encuentra un palo y lo mastica felizmente");
                break;
            case 6:
                System.out.println(getNombre() + " salta sobre el sofa y espera que le lancen su juguete favorito");
                break;
            case 7:
                System.out.println(getNombre() + " juega con otros perros en el paque y mueve la cola emocionado");
                break;
            case 8:
                System.out.println(getNombre() + " rueda por el suelo pidiendo mas juego");
                break;
            default:
                throw new AssertionError();
        }
    }

}
