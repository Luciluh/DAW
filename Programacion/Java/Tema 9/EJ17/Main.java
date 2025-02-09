package EJ17;

class Piramide {
    private static int piramidesCreadas = 0;
    private int altura;
    
    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }
    
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= altura; i++) {
            sb.append(" ".repeat(altura - i));
            sb.append("*".repeat(2 * i - 1)).append("\n");
        }
        return sb.toString();
    }
}

class Rectangulo {
    private static int rectangulosCreados = 0;
    private int base;
    private int altura;
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }
    
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < altura; i++) {
            sb.append("*".repeat(base)).append("\n");
        }
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Piramide p = new Piramide(4);
        Rectangulo r1 = new Rectangulo(4, 3);
        Rectangulo r2 = new Rectangulo(6, 2);
        
        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);
        
        System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
        System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
    }
}

