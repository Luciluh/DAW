Algoritmo MenuIf
	
	Definir opcion Como Entero;
	Definir nombre Como Caracter;
	
	Repetir
		Escribir "0. Despedir"
		Escribir "1. Saludar";
		Escribir "2. Introducir nombre";
		Escribir "Introduce una opción";
		Leer opcion; 
		
		Si (opcion == 1) Entonces
			Escribir "Hola"; 
		Sino
			Si (opcion == 2)
				Escribir "Dame tu nombre";
				Leer nombre;
			Sino
			FinSi
		FinSi
		
	Hasta Que (opcion==0)
FinAlgoritmo
