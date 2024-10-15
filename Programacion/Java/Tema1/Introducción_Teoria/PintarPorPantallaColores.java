public class PintarPorPantallaColores {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        System.out.println("\033[34m\033[43mHola Mundo\033[0m"); //tiene la letra de un color + el fondo de otro color "texto" + reseteo todo 
        System.out.println("\033[33mHola Mundo\033[0m");
        System.out.println("\033[36mHola Mundo\033[0m");
        System.out.println("\033[35mHola Mundo\033[0m");
        System.out.println("\033[31mHola Mundo\033[0m");
        System.out.println("\033[38;2;109;73;156mHola Mundo\033[0m"); 
        System.out.println("\033[1mEste texto aparecerá en negritas\033[0m");
        System.out.println("\033[3mEste texto aparecerá en cursiva\033[0m");
        System.out.println("\033[4mEste texto aparecerá en subrayado\033[0m");


        //Estandar ANSI 
        //codigo escape [colorTextom
        //colorTexto tiene que comprender entre:
        // Para el texto:  entre 30 y 37
        // Para el fondo: entre 40 y 47
        //Para cerrar el código de escape usaremos \033[0m
        //para un color concreto usaremos:
        // Para el texto: \033[38;2;R;G;Bm -> RGB lo buscamos en google con el colorpicker
        // Para el fondo: \033[48;2;R;G;Bm -> RGB lo buscamos en google con el colorpicker
        // Tabla de caracteres unicode para poner iconos -> \ u + codigo unicode


    }
}
