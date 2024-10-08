Algoritmo cuadradovacionose
	
	Definir lado Como Entero;
	Definir contador Como Entero;
	Definir contador2 Como Entero;
	
	Escribir "Dame un numero";
	Leer lado 
	
	Para contador <- 1 Hasta lado Hacer
		Si contador==1 O contador == lado Entonces
			Para contador2 <- 1 hasta lado hacer 
				Escribir "*"  Sin Saltar
			FinPara
			Escribir " Esta es la fila ", contador
			
		SiNo
			Escribir "*" Sin Saltar;
			Para contador2 <- 1 Hasta lado - 2 Hacer
				Escribir " " Sin Saltar;
			FinPara
			Escribir "*" Sin Saltar
			Escribir " Esta es la fila ", contador
		FinSi
	FinPara
	
FinAlgoritmo
