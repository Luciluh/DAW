Algoritmo CienPrimerosParesA 
	
	Definir numero Como Entero;
	Definir contador como Entero;
	
	numero = 1
	contador = 0 
	
	Mientras (contardor < 100) Hacer
		Si (numero%2 ==0) Entonces
			Escribir numero
			contador<-contador + 1
		FinSi
		
		numero <-numero+1
		//incremento el valor de numero +1 porque sino pasa por el if es porque era un numero impar que
		//al sumarle +1 se convierte en par
	FinMientras
	
FinAlgoritmo
