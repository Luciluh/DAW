public class EJ08_Funcion {

    public static String convierteEnMorse(int n) {

        // Separamos en dígitos individuales
        int inverso = Funciones.volteaNum(n); 
        String codigo = ""; // Variable para acumular el código Morse

        // Procesamos cada dígito
        do {
            int digito = inverso % 10;
            inverso = inverso / 10;

            // Añadimos el código Morse del dígito correspondiente
            switch (digito) {
                case 1:
                    codigo += "· _ _ _ _ ";
                    break;
                case 2:
                    codigo += "· · _ _ _ ";
                    break;
                case 3:
                    codigo += "· · · _ _ ";
                    break;
                case 4:
                    codigo += "· · · · _ ";
                    break;
                case 5:
                    codigo += "· · · · · ";
                    break;
                case 6:
                    codigo += "_ · · · · ";
                    break;
                case 7:
                    codigo += "_ _ · · · ";
                    break;
                case 8:
                    codigo += "_ _ _ · · ";
                    break;
                case 9:
                    codigo += "_ _ _ _ · ";
                    break;
                case 0:
                    codigo += "_ _ _ _ _ ";
                    break;
                default:
                    break;
            }
        } while (inverso > 0);

        // Devolvemos el código Morse acumulado
        return codigo; 
    }
}
