package CRUD_EMPLEADOS.clases;

/**
 * @author Lucia Villena Martin
 */



public class Empleado implements Comparable<Empleado> {

    private String dni ;
    private String nombre ;
    private int edad ;
    private double salario ;

    /**
     * @param dni
    * @param nombre
    * @param salario
    */
    public Empleado(String dni, String nombre, double salario) {
        this.dni = dni ;
        this.nombre = nombre ;
        this.salario = salario ;
    }

    /**     
     * @return
    */
    public String getDni() {
        return dni;
    }

    /**
     * @return
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return
    */
    public int getEdad() {
        return edad;
    }

    /**    
     * @return
    */
    public double getSalario() {
        return salario;
    }

    /**
     * @param edad
    */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param empleado
    * @return
    */
    @Override
    public int compareTo(Empleado empleado) {        
        return this.dni.compareTo(empleado.dni) ;
    }

    /** 
     * @return
    */
    @Override
    public String toString() {        
        return this.dni + ": " + this.nombre + ", " + this.edad + " años - Salario: " + this.salario + "€" ;
    }
    
}