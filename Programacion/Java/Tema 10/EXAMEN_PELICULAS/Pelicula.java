package EXAMEN_PELICULAS;

import java.util.*;
import java.util.Objects;

// Clase Pelicula que representa una película con sus atributos y métodos
class Pelicula {
    private String codigo;
    private String titulo;
    private int estreno;
    private boolean vista;

    // Constructor que recibe los valores y verifica que no sean nulos
    public Pelicula(String codigo, String titulo, int estreno) {
        if (codigo == null || titulo == null) {
            throw new IllegalArgumentException("Ninguno de los valores puede ser nulo");
        }
        this.codigo = codigo;
        this.titulo = titulo;
        this.estreno = estreno;
        this.vista = false; // Inicialmente la película no ha sido vista
    }

    // Implementación del método equals basándose en el código de la película
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pelicula pelicula = (Pelicula) obj;
        return Objects.equals(codigo, pelicula.codigo);
    }

    // Implementación del método hashCode basado en el código de la película
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public String getTitulo() {
        return titulo;
    }
    
    public int getEstreno() {
        return estreno;
    }
}

// Interfaz genérica para definir un catálogo de elementos
interface CatalogoInterface<T> {
    boolean anadir(T elemento);
    boolean eliminar(T elemento);
    List<T> recuperarElementos();
}

// Clase Catalogo que implementa la interfaz y maneja una colección de elementos
class Catalogo<T> implements CatalogoInterface<T> {
    private Set<T> coleccion; // Usamos un HashSet para evitar duplicados

    public Catalogo() {
        this.coleccion = new HashSet<>();
    }

    @Override
    public boolean anadir(T elemento) {
        return coleccion.add(elemento); // Devuelve false si el elemento ya existía
    }

    @Override
    public boolean eliminar(T elemento) {
        return coleccion.remove(elemento);
    }

    @Override
    public List<T> recuperarElementos() {
        return new ArrayList<>(coleccion); // Devolvemos una copia para evitar modificaciones externas
    }
}

// Interfaz para definir las operaciones de un videoclub
interface VideoclubInterface {
    void nuevaPelicula(Pelicula pelicula);
    void eliminarPorAnio(int anio);
    List<Pelicula> buscarPorPatron(String patron);
}

// Clase Videoclub que maneja un catálogo de películas
class Videoclub implements VideoclubInterface {
    private Catalogo<Pelicula> catalogo;

    public Videoclub() {
        this.catalogo = new Catalogo<>();
    }

    @Override
    public void nuevaPelicula(Pelicula pelicula) {
        if (!catalogo.anadir(pelicula)) {
            throw new RuntimeException("DuplicateFilmException: La película ya existe en el catálogo");
        }
    }

    @Override
    public void eliminarPorAnio(int anio) {
        List<Pelicula> peliculas = catalogo.recuperarElementos();
        for (Pelicula p : new ArrayList<>(peliculas)) {
            if (p.getEstreno() == anio) {
                catalogo.eliminar(p);
            }
        }
    }

    @Override
    public List<Pelicula> buscarPorPatron(String patron) {
        List<Pelicula> resultado = new ArrayList<>();
        for (Pelicula p : catalogo.recuperarElementos()) {
            if (p.getTitulo().toLowerCase().contains(patron.toLowerCase())) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}

