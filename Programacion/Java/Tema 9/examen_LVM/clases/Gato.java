/**
 * Lucia Villena Martin
 */
package clases;

public class Gato extends Mascota {
    
    private String pelaje;

    /**
     * 
     * @param chip
     */
    public Gato (String chip){
        super.setChip(chip);
    }

    /**
     * 
     * @param chip
     * @param nombre
     */
    public Gato (String chip, String nombre){
        super.setChip(chip);
        super.setNombre(nombre);
    }

    /**
     * 
     */
    public void maullar(){
        System.out.println("¡Miiiiaaau!");
    }

    /**
     * 
     */
    public void bufar(){
        System.out.println("Fuuuuu...");
    }

    /**
     * 
     */
    @Override
    public void pasear(){
        if (!estado()) {
            System.out.println(getNombre() + " no puede pasear hasta no se vacunado/a");
        } else {
            maullar();
        }
    }

    /**
     * 
    @Override
    public void vacunar(){
        if (vacunar == true) {
            System.out.println((getNombre() + " ya ha sido vacunado/a"));
        } else {
            bufar();
        }
    }
    */

    /**
     * 
     */
    @Override
    public void jugar (){
        System.out.println(getNombre() + " se tumbacon un ovillo de lana y lo araña ");
    }

}
