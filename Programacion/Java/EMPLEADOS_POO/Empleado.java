import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private String dni;

    // Constructor para inicializar un empleado con su nombre y DNI
    public Empleado(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y setters para acceder y modificar los datos del empleado
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Método toString para mostrar la información del empleado en un formato legible
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni;
    }
}
