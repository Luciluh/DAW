function cambioTitulo() {
    let cambioColor  = document.getElementById("titulo");
    
    if (cambioColor.style.color == 'red'){
        cambioColor.style.color = 'black';
    } else{
        cambioColor.style.color = 'red'
    }

}

function cambioNegrita() {
    let cambioNegrita = document.getElementById("parrafos"); //creo la variable let con la llamada de la funcion

    if (cambioNegrita.style.fontWeight == 'bold'){  //al hacer el if lo que conseguimos es poder hacer cambios de negrita a normal y viceversa
        cambioNegrita.style.fontWeight = 'normal';
    } else{
        cambioNegrita.style.fontWeight = 'bold';
    }
    
}