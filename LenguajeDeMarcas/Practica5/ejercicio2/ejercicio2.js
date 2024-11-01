function CambioDimension() {
    let cambioDim = document.getElementById("dimension");

    if (cambioDim.style.width === '300px' && cambioDim.style.height === '300px') {
        cambioDim.style.width = '700px';
        cambioDim.style.height = '700px';
    } else {
        cambioDim.style.width = '300px';
        cambioDim.style.height = '300px';
    }
}

function CambioFoto() {
    let cambioFot = document.getElementById("dimension");

    if (cambioFot.src.includes('aguacate_amigos.avif')) {
        cambioFot.src = 'recursos/aguacate_enamorado.avif';
    } else {
        cambioFot.src = 'recursos/aguacate_amigos.avif';
    }
}
