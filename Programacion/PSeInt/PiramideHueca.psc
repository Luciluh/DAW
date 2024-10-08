Algoritmo PiramideHueca
	
	Definir altura Como Entero
	Definir contador1 Como Entero	
	Definir contador2 Como Entero
	Definir asterisco Como Entero 
	Definir espacioDentro Como Entero
	
	
	
	Escribir "Dime un numero";
	Leer altura; 
	
	asterisco <- 1 
	espacio <- altura -1
	espacioDentro <- -1
	
	Para contador1<-1 Hasta altura 
		
		Si contador1 == altura Entonces
			Para contador2 <- 1 Hasta altura*2-1
				Escribir "*" Sin saltar;
			FinPara
		SiNo
			Para contador2 <-1 Hasta espacio
				Escribir " " Sin Saltar;
			FinPara
			Escribir "*" Sin Saltar;
		FinSi
		
		Si !contador1 == 1 Y !contador1 == altura Entonces
			Para contador2 <- 1 Hasta espacioDentro 
				Escribir " " Sin saltar;
			FinPara
			Escribir "*" Sin Saltar;
		FinSi
		
		espacioDentro <- espacioDentro +2
		espacio <- espacio -1
		Escribir ""
		
	FinPara
	
	
FinAlgoritmo
