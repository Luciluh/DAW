/*
-Empezar un codigo: 
public class vueltasTierra {
    public static void main(String[] args) {

    }
}
_________________________________________________________________




- GENERAR NUMEROS ALEATORIOS: 
EN TRAMO
int num = (int)(Math.random()*(max-min+1)+min)
SIN TRAMO 
int

GENERA 10 NUM ALEATORIOS:
for (int i = 0; i < 10; i++) { 
            int aleatorio = (int)(Math.random() * (60 - 30 + 1)) + 30;
            System.out.println(aleatorio);
        }
_________________________________________________________________
- Locale, para usos de float 
Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
import java.util.Locale;
_________________________________________________________________

- Scanner 
String var;
int num;
Scanner sc = new Scanner(System.in);

var = sc.nextLine(); 

sc.close();
_________________________________________________________________

Para guardar numeros: 
(num+10)+num2%10

_________________________________________________________________

-Para cuadrar: 
%-30s.....................| %8.2f\n
_________________________________________________________________

- Readline
var = (System.console().readLine()); 
num = Integer.parseInt(System.console().readLine()); 
_________________________________________________________________

- Constantes 
private static final float CAMBIO = 166.386f;

_________________________________________________________________

- Editar texto: negrita, subrayado y cursiva:

"\033[1mMensajecualquiera\033[0m";

Para el texto: \033[38;2;R;G;Bm -> RGB lo buscamos en google con el colorpicker

Para el fondo: \033[48;2;R;G;Bm -> RGB lo buscamos en google con el colorpicker

______________________________________________________
EXCEPCIONES

        try {
            
        } catch (Exception e) {   este valor lo copias de la terminal cuando te da error 
        Aqui ponemos el mensaje de error
        }
*/