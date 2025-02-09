/**
 * Lucia Villena Martin
 */
package clases;

public abstract class Mascota {
    
    private String chip;
    private String nombre;
    private int edad;
    private boolean vacunada;
    public int totalPerros;
    public int totalGatos;
    public int totalMascotas = totalPerros + totalGatos;
    
    
    public Mascota() {
    }

    /**
     * @param chip
     * @param nombre
     * @param edad
     * @param vacunada
     */
    public Mascota (String chip, String nombre, int edad, boolean vacunada){
        this.chip = chip;
        this.nombre = nombre;
        this.edad = edad;
        this.vacunada = false;
    }

    /**
     * 
     * @return
     */
    public String getChip(){
        return chip;
    }

    /**
     * 
     * @param chip
     */
    public void setChip(String chip) {
        this.chip = chip;
    }

    /**
     * 
     * @return
     */
    public String getNombre (){
        return nombre;
    }

    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * 
     * @return
     */
    public int getEdad(){
        return edad;
    }

    /**
     * 
     * @return
     */
    public boolean estaVacunada(){
        return vacunada;
    }


    public abstract void pasear();
    public abstract void jugar();

    /**
     * 
     * @return
     */
    public boolean vacuna(){

        boolean estado = false;

        if (vacunada == false){
            estado = true;
        }

        return estado;
    }

    /**
     * 
     * @return
     */
    public boolean estado(){
        return vacunada;
    }
}
