Algoritmo Piramide
	Definir altura Como Entero
	Definir asterisco Como Entero
	Definir espacio Como Entero
	Definir contador Como Entero
	
	Escribir "Dime una altura para tu piramide" 
	Leer altura 
	
	//en la primera fila, la relacion entre asterisco y espacio es: 
	asterisco <- 1
	espacio <- (altura - 1)
	
	Para altura <- 1 Hasta altura Con Paso 1 Hacer //bucle que nos hace variar las filas 
		
		Para contador<-1 Hasta espacio Con Paso 1 Hacer //pintamos los espacios 
			Escribir " " Sin Saltar
		Fin Para
		
		Para contador<-1 Hasta asterisco Con Paso 1 Hacer //pintamos los * 
			Escribir "*" Sin Saltar
		Fin Para
	
		Escribir "" //para hacer el salto de linea al final de cada fila
		espacio <- espacio-1
		asterisco <- asterisco + 2
	
	Fin Para
	
FinAlgoritmo
