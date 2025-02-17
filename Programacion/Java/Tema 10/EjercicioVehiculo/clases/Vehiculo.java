package EjercicioVehiculo.clases;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private boolean disponible;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.disponible = true;
    }

    public String getMatricula() { return matricula; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public boolean isDisponible() { return disponible; }

    public void alquilar() { disponible = false; }
    public void devolver() { disponible = true; }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Disponible: " + (disponible ? "Sí" : "No");
    }
}
