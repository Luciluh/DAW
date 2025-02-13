package EJ18;

public class Incidencia {
    private static int contador = 0;
    private static int pendientes = 0;
    
    private int codigo;
    private int puesto;
    private String problema;
    private String solucion;
    private boolean resuelta;
    
    public Incidencia(int puesto, String problema) {
        this.codigo = ++contador;
        this.puesto = puesto;
        this.problema = problema;
        this.resuelta = false;
        pendientes++;
    }
    
    public void resuelve(String solucion) {
        if (!resuelta) {
            this.solucion = solucion;
            this.resuelta = true;
            pendientes--;
        }
    }
    
    public static int getPendientes() {
        return pendientes;
    }
    
    @Override
    public String toString() {
        if (resuelta) {
            return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + problema + " - Resuelta - " + solucion;
        } else {
            return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + problema + " - Pendiente";
        }
    }
    
    public static void main(String[] args) {
        Incidencia inc1 = new Incidencia(105, "No tiene acceso a internet");
        Incidencia inc2 = new Incidencia(14, "No arranca");
        Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa");
        Incidencia inc4 = new Incidencia(237, "Hace un ruido extraño");
        Incidencia inc5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas");
        
        inc2.resuelve("El equipo no estaba enchufado");
        inc3.resuelve("Cambio del cable VGA");
        
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(inc5);
        
        System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
    }
}

