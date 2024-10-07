Algoritmo NumerosPrimosOptimizado 
	Definir num Como Entero;
	Definir div Como Entero;
	
	Escribir "Introduce un valor"; 
	Leer num
	
	Mientras (num<=0) Hacer
		Escribir "Numero incorrecto. Intentalo de nuevo";
		Leer num;
	FinMientras

	div <- 2
	Mientras (div < num/2) Y (num%div <> 0) Hacer
		div <- div + 1
	FinMientras
	
	Si (div > num/2) Entonces
		Escribir "El numero ES primo";
	SiNo
		Escribir "El numero NO ES primo";
	FinSi
	
FinAlgoritmo
