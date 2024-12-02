package EJ02;

public class EJ02 {
    public static String Mayor_Menor_Igual (int num1, int num2){

        String Mayor_Menor_Igual = " ";


        if (num1>num2) {
            Mayor_Menor_Igual = "El primer numero es mayor";
        } else if (num1<num2) {
            Mayor_Menor_Igual = "El primer numero es menor";
        } else if (num1==num2){
            Mayor_Menor_Igual = "Ambos son iguales";
        }
        return Mayor_Menor_Igual;
    }
}
