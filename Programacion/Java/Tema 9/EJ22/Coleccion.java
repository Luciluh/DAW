package EJ22;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Disco> discos;

    public Coleccion() {
        this.discos = new ArrayList<>();
        // Agregar algunos discos de prueba
        discos.add(new Disco("GASAA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        discos.add(new Disco("FGHQ64", "Metallica", "Black Album", "hard rock", 46));
        discos.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
    }

    public ArrayList<Disco> getDiscos() {
        return discos;
    }

    public void agregarDisco(Disco disco) {
        discos.add(disco);
    }

    public boolean modificarDisco(String codigo, Disco nuevoDisco) {
        for (int i = 0; i < discos.size(); i++) {
            if (discos.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                discos.set(i, nuevoDisco);
                return true;
            }
        }
        return false;
    }

    public boolean borrarDisco(String codigo) {
        return discos.removeIf(disco -> disco.getCodigo().equalsIgnoreCase(codigo));
    }

    public Disco buscarDisco(String codigo) {
        for (Disco disco : discos) {
            if (disco.getCodigo().equalsIgnoreCase(codigo)) {
                return disco;
            }
        }
        return null;
    }
}

