//Escribe un algoritmo que solicite por teclado un valor numerico entero mayor que 0 e indique por pantallas si es primo o no
//Solo es primo si es divisible por si mismo y por la unidad(1)
Algoritmo NumerosPrimos
	Definir num Como Entero;
	Definir divisor Como Entero;
	Definir esPrimo Como Logico
	esPrimo <- Verdadero
	
	Repetir
		Escribir "Inserte un numero";
		Leer num; 
	Hasta Que num>0
	
	Para divisor<-2 Hasta num-1 Con Paso 1 Hacer
		Si num%divisor=0 
				esPrimo <- Falso
				divisor<-num-1
		SiNo
				esPrimo <- Verdadero
		FinSi
	Fin Para
		
	Si esPrimo 
		Escribir num, " es un numero primo"
	SiNo 
		Escribir num, " no es un numero primo"
	FinSi
	
FinAlgoritmo
