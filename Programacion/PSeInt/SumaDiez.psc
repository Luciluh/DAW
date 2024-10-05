//Hacer un algoritmo que le pida al usuario 10 numeros enteros y muestre por pantalla la suma de ellos//
Algoritmo SumaDiez
	
	Definir numero Como Entero;
	Definir contador Como Entero;
	Definir suma Como Entero;
	
	suma<-0;
	contador<-0;

	Mientras (contador<10) Hacer;
		Escribir "Escriba un numero entero";
		Leer numero;
		contador <- contador + 1;
		suma <- numero + suma;
	FinMientras;
	
	Escribir "El resultado de la suma es ", suma;	
	
FinAlgoritmo
