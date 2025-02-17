package clases;

public class Empleado implements Comparable<Empleado> {
    private String dni;
    private String nombre;
    private int edad;
    private double salario;

    // Constructor
    public Empleado(String dni, String nombre, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;
        this.edad = 0; // Por defecto, 0 hasta que se asigne
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para comparar empleados por DNI (para la ordenación)
    @Override
    public int compareTo(Empleado otro) {
        return this.dni.compareTo(otro.dni);
    }

    // Representación en texto del empleado
    @Override
    public String toString() {
        return "Empleado{" +
                "DNI='" + dni + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Salario=" + salario +
                '}';
    }
}

