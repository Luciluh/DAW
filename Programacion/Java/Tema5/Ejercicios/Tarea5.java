public class Tarea5 {
    public static void main(String[] args) {

        int codigo ;
        float precio ;
        int cantidad ;
        float descuento ;
        float descuentoAplicado ;
        float precioTotal ;
        float impuesto ;

        System.out.printf("\033[1mLECTURA ILUSTRADA\033[0m\n========================================\n");
        System.out.print("Introduce código de libro: ");
        codigo = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce precio unitario: ");
        precio = Float.parseFloat(System.console().readLine()) ;
        System.out.print("Introduce cantidad: ");
        cantidad = Integer.parseInt(System.console().readLine()) ;
        System.out.print("Introduce descuento (%): ");
        descuento = Float.parseFloat(System.console().readLine()) ;

        System.out.printf("\nSu ticket:\n\n");

        precioTotal = precio*cantidad ;
        descuentoAplicado = (descuento/100f)*(precioTotal) ;
        impuesto = 0.21f*(precioTotal-descuentoAplicado) ;
        
        System.out.printf("\033[1mLECTURA ILUSTRADA\n========================================\033[0m\n");
        System.out.printf("%-30s %8.2f€\n",codigo, precio);
        System.out.printf("%-30s %8.2f€\n",cantidad + " uds.", precioTotal);
        System.out.printf("%-30s %8.2f€\n","-" + descuento + "%", -descuentoAplicado);
        System.out.printf("%-30s %8.2f€\n","21% IVA", impuesto);
        System.out.printf("\033[1m\033[100m%-30s %8.2f€\033[0m\n","TOTAL",precioTotal-descuentoAplicado+impuesto);

        //Imprimo la primera parte como un String, concatenando la variable con el texto que quiero delante y detrás, para poder elegir
        //exactamente cuánto ocupará no solo la variable sino también el texto junto a ella como una sola unidad.
        //Con el menos, indico el espacio que quiero a la derecha, mientras que con el 8 de %8.2 indico el espacio que quiero a la izquierda.
    }
}
