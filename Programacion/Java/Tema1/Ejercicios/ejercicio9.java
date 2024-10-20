public class ejercicio9 {
    public static void main(String[] args) throws InterruptedException { /* el "throws InterruptedException"es una excepción                   */
        String estrella = "\u2605";   
        String corazon = "\u2764";    
        String sol = "\u2600";        
        String luna = "\u263D";       

        
        System.out.print(estrella);
        Thread.sleep(500);  /*Con esto esperamos 500 milisegundos antes de pasar al "apagado"*/
        System.out.print("\r ");  /* Funcion del apagado*/
        Thread.sleep(500);  
        System.out.print(corazon);
        Thread.sleep(500);  
        System.out.print("\r ");  
        Thread.sleep(500);  
        System.out.print(sol);
        Thread.sleep(500);  
        System.out.print("\r ");  
        Thread.sleep(500);  
        System.out.print(luna);
        Thread.sleep(500);  
        System.out.print("\r ");
    }
}
