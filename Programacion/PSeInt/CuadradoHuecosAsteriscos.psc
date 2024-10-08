Algoritmo CuadradoHuecosAsteriscos
<<<<<<< HEAD
	Definir lado Como Entero
	Definir contador Como Entero
	Definir contador2 Como Entero
	
	Escribir 'Dame un numero de lado'
	Leer lado
=======
	Definir lado Como Entero;
	Definir contador Como Entero;
	Definir contador2 Como Entero;
	
	Escribir 'Dame un numero de lado';
	Leer lado;
>>>>>>> 55ded5346b376c8d2e39b8d2973f6a41d83026a9
	
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
