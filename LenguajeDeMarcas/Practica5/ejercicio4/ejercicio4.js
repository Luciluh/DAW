function Operacion(event){
    event.preventDefault(); // usamos esto para NO enviar el formulario
    let num1 = parseFloat(document.getElementById("operando1").value); //el value es para coger el valor del operando1 y usamos el parseFloat porque en la suma concatenaba los resultados en vez de sumarlos
    let num2 = parseFloat(document.getElementById("operando2").value);
    let operacion = document.getElementById("operacion").value;
    let resultado;

    switch (operacion) {
        case "suma": 
        resultado = num1+num2;            
            break;
        case "resta": 
        resultado = num1-num2; 
            break; 
        case "multi": 
        resultado = num1*num2; 
            break; 
        case "division": 
        resultado = num1/num2; 
            break; 
    }

    document.getElementById("resultado").value = resultado; //dar/mostar valor 
}
