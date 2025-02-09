package EJ24;

public class Almacen {
    private static final int MAX_ARTICULOS = 500; // Límite de 500 artículos
    private Articulo[] articulos;
    private int contador;

    public Almacen() {
        articulos = new Articulo[MAX_ARTICULOS];
        contador = 0;
    }

    // Agregar un nuevo artículo
    public void agregarArticulo(Articulo articulo) {
        if (contador < MAX_ARTICULOS) {
            articulos[contador++] = articulo;
        } else {
            System.out.println("El almacén está lleno. No se pueden agregar más artículos.");
        }
    }

    // Listar artículos
    public void listarArticulos() {
        if (contador == 0) {
            System.out.println("No hay artículos en el almacén.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(articulos[i]);
            }
        }
    }

    // Buscar un artículo por código
    public Articulo buscarArticulo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (articulos[i].getCodigo().equalsIgnoreCase(codigo)) {
                return articulos[i];
            }
        }
        return null;
    }

    // Modificar un artículo
    public void modificarArticulo(String codigo, String nuevaDescripcion, Double nuevoPrecioCompra, Double nuevoPrecioVenta, Integer nuevoStock) {
        Articulo articulo = buscarArticulo(codigo);
        if (articulo != null) {
            if (nuevaDescripcion != null) articulo.setDescripcion(nuevaDescripcion);
            if (nuevoPrecioCompra != null) articulo.setPrecioCompra(nuevoPrecioCompra);
            if (nuevoPrecioVenta != null) articulo.setPrecioVenta(nuevoPrecioVenta);
            if (nuevoStock != null) articulo.setStock(nuevoStock);
            System.out.println("Artículo modificado correctamente.");
        } else {
            System.out.println("El artículo con código " + codigo + " no existe.");
        }
    }

    // Entrada de mercancía
    public void entradaMercancia(String codigo, int cantidad) {
        Articulo articulo = buscarArticulo(codigo);
        if (articulo != null) {
            articulo.setStock(articulo.getStock() + cantidad);
            System.out.println("Se han añadido " + cantidad + " unidades al stock.");
        } else {
            System.out.println("El artículo no existe.");
        }
    }

    // Salida de mercancía
    public void salidaMercancia(String codigo, int cantidad) {
        Articulo articulo = buscarArticulo(codigo);
        if (articulo != null) {
            if (articulo.getStock() >= cantidad) {
                articulo.setStock(articulo.getStock() - cantidad);
                System.out.println("Se han retirado " + cantidad + " unidades del stock.");
            } else {
                System.out.println("No hay suficiente stock disponible.");
            }
        } else {
            System.out.println("El artículo no existe.");
        }
    }
}

