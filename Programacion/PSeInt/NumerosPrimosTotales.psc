//Escribe un algoritmo que solicite al usuario un valor total y muestre por pantalla 
//tantos numero primos como indique dicha variable
//EJ: ¿Cuantos numero primos quieres?: 13
// Respuesta: 2, 3,5,7,11,13,17,19,23,31,37

Algoritmo NumerosPrimosTotales
	Definir num Como Entero;
	Definir divisor Como Entero;
	Definir contador Como Entero; 
	Definir esPrimo Como Logico
	Definir resultado Como Caracter;
	
	Repetir
		Escribir "Inserte un numero";
		Leer num; 
	Hasta Que num>0
	
	Repetir
		
		Mientras expresion_logica Hacer
			secuencia_de_acciones
		Fin Mientras
	contador <- contador + 1
	Hasta Que contador == num
	
FinAlgoritmo
