Algoritmo NumerosPrimosExamen
	Definir num Como Entero;
	Definir divisor Como Entero;
	Definir esPrimo Como Logico;
	esPrimo <- Verdadero;
	
	Repetir
		Escribir "Inserte un numero entero entero mayor que 0";
		Leer num; 
	Hasta Que num>0
	
	Para divisor<-2 Hasta num-1 Con Paso 1 Hacer
		Si num%divisor==0 Entonces
				esPrimo <- Falso;
				divisor<-num-1;
		SiNo
				esPrimo <- Verdadero;
		FinSi
	Fin Para
		
	Si esPrimo Entonces
		Escribir num, " es un numero primo";
	SiNo 
		Escribir num, " no es un numero primo";
	FinSi
	
FinAlgoritmo
