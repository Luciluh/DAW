/**
 * Lucia Villena Martin
 */
package clases;

import interfaces.ClinicaInterfaz;

public class Clinica implements ClinicaInterfaz{
    
    private static final int MAXIMO = 100;
    private int total;
    private Mascota [] pacientes;



    /**
    * Contrustor de clase
    */
    public Clinica() {
        this.total = 0 ;
        this.pacientes = new Mascota[MAXIMO] ;
        this.vaciar();  
    }
    
    /**
     * Devuelve true si no hay ningun paciente
     */
    public boolean esVacia() {
        return this.total == 0 ;
    }
    
    /**
     * Vacía la memoria de pacientes
     */
    private void vaciar() {
        for(int i=0; i < MAXIMO; i++) {
            this.pacientes[i] = null;
        }
    }

    /**
    * Devuelve true si hay maximo numero de pacientes
    */
    public boolean esLlena() {
        return this.total == MAXIMO;
    }

    /**
    * Devuelve el total de perros
    */
    public int totalPerros(){
        return this.totalPerros();
    }

    /**
    * Devuelve el total de gatos
    */
    public int totalGatos(){
        return this.totalGatos();
    }

    /**
    * Devuelve el total de mascotas
    */
    public int totalMascotas(){
        return this.totalMascotas();
    }


    /**
     * Busca un paciente por su chip y devolvemos la posición
     */
    private int buscarPosicion(String chip) {

        int i = 0;
        boolean encontrado = false ;

        while (i < MAXIMO && !encontrado) {  
            if ((this.pacientes[i] != null) && (this.pacientes[i].getChip().equals(chip))) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return (encontrado) ? i : -1;
    }
    /**
     * Buscamos la mascota por el chip
     */
    public Mascota buscarChip(String chip) {

        int pos = this.buscarPosicion(chip) ; //nos vamos a "buscarPosicion"
        boolean valido = pos!=-1 ;

        return valido?this.pacientes[pos]:null ;

    }

    /**
     * Añadimos una nueva masctora
     */
    public void agregar (Mascota mascota) {

        int i = 0;
        this.pacientes[i] = mascota ;
        this.total++ ;
    }

    /**
    * enseña lista de las mascotas
    */
    public void listar(String chip, String nombre, int edad) {

        for(int i=0; i < MAXIMO; i++) {
            if (this.pacientes[i]!=null) {
                System.out.printf("[%s] : %s, %d años", this.chip, this.nombre, this.edad);
            }
        }
        
    }
}


