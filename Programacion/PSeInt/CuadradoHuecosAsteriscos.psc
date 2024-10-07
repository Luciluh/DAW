Algoritmo CuadradoHuecosAsteriscos
	Definir lado Como Entero;
	Definir contador Como Entero;
	Definir contador2 Como Entero;
	
	Escribir 'Dame un numero de lado';
	Leer lado;
	
	Para contador<-1 Hasta lado Con Paso 1 Hacer
		
		Si contador==1 O contador==lado Entonces
			Para contador2<-1 Hasta lado Con Paso 1 Hacer
				Escribir '*'Sin Saltar;
			FinPara
		SiNo
			Escribir '*'Sin Saltar;
			Para espacios<-1 Hasta lado-2 Con Paso 1 Hacer
				Escribir " " Sin Saltar;
			FinPara
			Escribir '*'Sin Saltar;
		FinSi
		
		Escribir '';
		
	FinPara
	
FinAlgoritmo
