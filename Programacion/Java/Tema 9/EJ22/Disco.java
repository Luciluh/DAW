package EJ22;

public class Disco {
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "----------------------------------\n" +
            "Código: " + codigo + "\n" +
            "Autor: " + autor + "\n" +
            "Título: " + titulo + "\n" +
            "Género: " + genero + "\n" +
            "Duración: " + duracion;
    }
}

