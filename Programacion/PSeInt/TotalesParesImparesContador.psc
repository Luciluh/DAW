Algoritmo TotalesParesImparesContador
	
	Definir total Como Entero
	Definir num Como Entero
	Definir contador1 Como Entero
	Definir contador2 Como Entero
	contador1<-0
	contador2<-0
	
	Escribir "Introduce total de numeros a leer"
	Leer total
	
	Para total<-1 Hasta total Con Paso 1 Hacer
		Escribir "Introduce un numero"
		Leer num
		
		Si num%2==0
			contador1<-contador1 + 1 
		SiNo
			contador2<-contador2 + 1 
		FinSi
	Fin Para
	
	Escribir "Total de numero pares: ", contador1
	Escribir "Total de numero impares: ", contador2

FinAlgoritmo
